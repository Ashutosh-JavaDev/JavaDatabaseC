import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Scanner;
class updation {
    public static void update() {
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jbdc:mysql://localhost:3306/Libary_Mangement", "root", "@Radhakrishna297");
            System.out.println("Enter the Student ID whose Data want to Update");
            PreparedStatement ps=con.prepareStatement("Update Registration set ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

}

public class Update {
    public static void main(String[] args) {

    }
}
