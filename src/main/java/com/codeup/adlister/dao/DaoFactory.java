package com.codeup.adlister.dao;
import com.codeup.adlister.config.Config;

import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    private static UsersDao usersDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }

    public static UsersDao getUsersDao() throws SQLException {
        if(usersDao == null){
            usersDao = new UsersDao();
        }
        return usersDao;
    }
}
