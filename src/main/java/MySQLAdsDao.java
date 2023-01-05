import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{
    Config config = new Config();
    Connection connection;

    @Override
    public List<Ad> all() throws SQLException {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Ads;");
            stmt.execute();
            ResultSet ads_query = stmt.getResultSet();
            List ads = new ArrayList<Ad>();
            while (ads_query.next()) {
                int id = ads_query.getInt("id");
                String title = ads_query.getString("title");
                String description = ads_query.getString("description");
                int stateid = ads_query.getInt("stateid");
                int countyid = ads_query.getInt("countyid");
                int userId = ads_query.getInt("userid");
                ads.add(new Ad(id,userId,title,description,stateid,countyid));
            }

            return ads;
        }catch(SQLException e){
            throw e;
        }
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
