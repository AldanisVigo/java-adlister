import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="Count", urlPatterns = "/count")
public class Count extends HttpServlet{
    int count = 0;

    /*
        GET Request route mapped to /count path
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        //Set the response content type to "text/html"
        res.setContentType("text/html");

        //Get the reset query parameter from the HttpServletRequest object
        var reset = req.getParameter("reset");

        if(reset != null) { //If the reset parameter is not null
            if(reset.equals("true")) { //If the reset param equals "true
                //Log the action
                System.out.println("Resetting page counter.");
                //Reset the counter back to 0
                count = 0;
            }else{ //If the reset param's value is not "true"
                //Log the action
                System.out.println("Reset param provided but is false. Skipping reset.");
                //Increment the counter by one
                count++;
            }
        }else{ //Otherwise
            count++; //Increment the counter by 1
        }

        //Get the writer from the HttpServletResponse object
        PrintWriter out = res.getWriter();

        //And write the output to the page with the current page visit count
        out.printf("Page Visits: %s",count);
    }
}
