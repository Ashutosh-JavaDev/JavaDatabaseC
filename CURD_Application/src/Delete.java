import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Deletion {
    void delete() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Libary_Mangement","root","@Radhakrishna297");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Delete {

}
