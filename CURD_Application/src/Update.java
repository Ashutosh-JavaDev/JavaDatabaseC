import java.sql.Statement;
import java.util.InputMismatchException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

class updation {
    public static void update() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}

public class Update {
    public static void main(String[] args) {

    }
}
