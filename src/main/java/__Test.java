import com.neo.dao.connection.WrappedConnection;
import com.neo.dao.daofactory.AbstractDAOFactory;
import com.neo.dao.idao.IAdminsDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class __Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fast_test";
        String user = "root";
        String pass = "root";
        Properties prop = new Properties();
        prop.put("user", user);
        prop.put("password", pass);
        try (Connection connection = DriverManager.getConnection(url, prop)){
            WrappedConnection wrappedConnection = new WrappedConnection(connection);
            IAdminsDAO iAdminsDAO = AbstractDAOFactory.getDAOFactory().getAdminsDAO(wrappedConnection);
            System.out.println(iAdminsDAO.findAll());
        } catch (Exception e) {
            System.err.println("properties file is missing " + e);
        }
    }
}
