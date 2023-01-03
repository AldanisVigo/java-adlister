import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="SetFavoriteColor", urlPatterns = "/setcolor")
public class SetFavoriteColor extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //Pull the color from the request
        String color = req.getParameter("color");

        //Set the attribute on the request object
        req.setAttribute("color",color);

        //Forward the request to the show-favorite-color route
        req.getRequestDispatcher("/show-favorite-color").forward(req, res);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
    }
}
