
package main;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author tonare
 */
public class ConnectionFactoryComProperties {
        public Connection getConnection() {
        try {
            Properties prop = new Properties();
            prop.load(getClass().getResourceAsStream("properties.properties"));
            String dbDriver = prop.getProperty("db.driver");
            String dbUrl = prop.getProperty("db.url");
            String dbUser = prop.getProperty("db.user");
            String dbPwd = prop.getProperty("db.pwd");
            Class.forName(dbDriver);
            return (Connection) DriverManager.getConnection(dbUrl, dbUser,dbPwd);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}