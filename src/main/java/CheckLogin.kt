import java.io.IOException
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(name = "CheckLogin", urlPatterns = ["/attemptLogin"])
class CheckLogin : HttpServlet() {
    private var conn: Connection? = null
    @Throws(ServletException::class)
    override fun init() {
        try {
            // The newInstance() call is a workaround for some
            // broken Java implementations
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
        } catch (ex: Exception) {
            // handle the error
            println(ex.message)
        }
        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/adlister?" +
                        "user=root&password=passwd"
            )
        } catch (ex: SQLException) {
            // handle any errors
            println("SQLException: " + ex.message)
            println("SQLState: " + ex.sqlState)
            println("VendorError: " + ex.errorCode)
        }
        super.init()
    }

    override fun destroy() {
        super.destroy()
        //Close the connection to MySQL
        try {
            if (conn != null && !conn!!.isClosed) {
                conn!!.close()
            }
        } catch (e: SQLException) {
            throw RuntimeException(e)
        }
    }

    @Throws(IOException::class)
    override fun doPost(req: HttpServletRequest, res: HttpServletResponse) {
        //Grab the username and password from the request's query parameters
        val username = req.getParameter("username")
        val password = req.getParameter("password")

        //Set a flag for allowing access, initially it will disallow access
        var allowAccess = false
        try { //Attempt to see if the user is in the list of users
            //Create a result set to hold the results of our query
            val results: ResultSet

            //Create a statement for the query
            val statement = conn!!.createStatement()

            //Execute the statement and store the results in the result set
            results = statement.executeQuery("SELECT * FROM User WHERE email='$username' AND password='$password';")

            //Print out the results of executing our statement
            while (results.next()) {
                //Retrieve the user and pass from the row
                val user = results.getString("email")
                val pass = results.getString("password")

                //Check if we have a match with what the user provided
                if (user == username && pass == password) {
                    allowAccess = true //Flip the flag to allow access if they are in the list
                }
            }

            //Close the results set
            results.close()

            //Close the mysql statement
            statement.close()
        } catch (e: SQLException) {
            //Print out the exception to the console
            println(e)
        }

        //If access is allowed then redirect
        if (allowAccess) {
            res.sendRedirect("/profile.jsp?username=$username")
        } else {
            res.sendRedirect("/login.jsp?error=Your username and password were incorrect, please check your username and password and try again.")
        }
    }
}