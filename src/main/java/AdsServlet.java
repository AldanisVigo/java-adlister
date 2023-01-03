import dao.Ads;
import dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "adsservlet", urlPatterns = "/showAds")
public class AdsServlet extends HttpServlet {
   Ads dao = DaoFactory.getAdsDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setAttribute("ads",dao.all());
        req.getRequestDispatcher("/ads/index.jsp").forward(req,res);
    }
}
