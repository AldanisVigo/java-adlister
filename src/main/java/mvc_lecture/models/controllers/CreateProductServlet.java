package mvc_lecture.models.controllers;

import mvc_lecture.models.Product;
import mvc_lecture.models.dao.DaoFactory;
import mvc_lecture.models.dao.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/products/create")
public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            req.getRequestDispatcher("/products/create.jsp").forward(req, res);
        }catch(Exception e){
            throw e;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            //Products dao
            Products productsDao = DaoFactory.getProductsDao();

            //Pull the parameter values from the request
            String name = req.getParameter("name");
            double price = Double.parseDouble(req.getParameter("price"));

            //Create a new product with the parameter values
            Product myNewProduct = new Product(name, price);

            //Insert it into the dao
            productsDao.insert(myNewProduct);

            res.sendRedirect("/products");

        }catch(Exception e){
            throw e;
        }
    }
}
