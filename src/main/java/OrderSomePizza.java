import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.HttpServlet;

@WebServlet(name="OrderSomePizza", urlPatterns = "/ordersomepizza")
public class OrderSomePizza extends HttpServlet {
    int orderNumber = 0;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");
        String address = req.getParameter("address");
        String toppings[] = req.getParameterValues("toppings[]");

        System.out.printf("Incoming customer order : #%d\n",orderNumber++);
        System.out.printf("Crust: %s\n",crust);
        System.out.printf("Sauce: %s\n",sauce);
        System.out.printf("Size: %s\n",size);
        System.out.println("Toppings:");
        int toppingNum = 1;
        for(String topping : toppings){
            System.out.printf("%d - %s\n",toppingNum++,topping);
        }
        System.out.printf("Delivery to: %s\n",address);

    }
}
