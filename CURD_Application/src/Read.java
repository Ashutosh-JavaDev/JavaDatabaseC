import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

class fetchStatement {
    public void readValue() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Libary_Mangement", "root",
                    "@Radhakrishna297");
            String query="Select*from Registration";
            Statement smt=con.createStatement();
            ResultSet rs=ps.executeQuery(query);
            while(rs.next()){
                System.out.println("First Name : "+rs.getString("FirstName"));
                System.out.println("Last Name : "+rs.getString("FirstName"));
                System.out.println("Email : "+rs.getString("FirstName"));
                System.out.println("Phone Number : "+rs.getString("FirstName"));
                System.out.println("Course : "+rs.getString("FirstName"));
                System.out.println("Batch : "+rs.getString("FirstName"));
                System.out.println("Gender : "+rs.getString("FirstName"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Read {
    public static void main(String[] args) {
        fetchStatement ob = new fetchStatement();
        ob.readValue();
    }
}
