import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

class updation {
    public static void update() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jbdc:mysql://localhost:3306/Libary_Mangement", "root", "@Radhakrishna297");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

public class Update {
    public static void main(String[] args) {

    }
}
