package mvc_lecture.controllers;

import mvc_lecture.dao.DaoFactory;
import mvc_lecture.dao.Products;
import mvc_lecture.models.Product;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ShowProductsServlet extends HttpServlet {
    private Products productsDao = DaoFactory.getProductsDao();

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        try{
           List<Product> products = productsDao.all();
           req.setAttribute("productsList",products);
           RequestDispatcher disp = req.getRequestDispatcher("/products/index.jsp");
           disp.forward(req,res);
        } catch(Exception e){
            throw e;
        }
    }
}
