import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet(name="ShowFavoriteColor", urlPatterns = "/show-favorite-color")
public class ShowFavoriteColor extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        //Get the color parameter from the request body
        String color = req.getParameter("color");

        // Set the color attribute in the request
        req.setAttribute("color", color);

        // req.getRequestDispatcher("/showcolor.jsp").forward(req, res);
        res.sendRedirect("/showcolor.jsp?color=" + URLEncoder.encode(color, StandardCharsets.UTF_8));
    }
}
