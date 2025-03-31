import java.sql.DriverManager;
import java.sql.Connection;
public class Create {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("null", "root", "@Radhakrishna297");
    }
}
