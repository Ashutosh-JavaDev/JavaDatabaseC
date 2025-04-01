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
            int Student=sc.nextInt();
            System.out.println("Press 1:To Update First Name\nPress 2: To Update Last Name\nPress 3:To Update Email\nPress 4:To Update Phone Number\nPress 5:To Update Course\nPress 6:To Update Batch\nPress 7:To Update Gender");
            int choice=sc.nextInt();
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
