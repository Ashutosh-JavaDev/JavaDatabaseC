import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class fetchStatement {
    public void readValue() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Libary_Mangement", "root",
                    "@Radhakrishna297");
          
            PreparedStatement ps=con.prepareStatement("Select * from Registration");
            ResultSet rs=ps.executeQuery();
            System.out.println();
            while(rs.next()){
                System.out.println("-----------------------------------------------");
                System.out.println("Student ID: "+rs.getInt("STU_ID"));
                System.out.println("First Name : "+rs.getString("FirstName"));
                System.out.println("Last Name : "+rs.getString("LastName"));
                System.out.println("Email : "+rs.getString("Email"));
                System.out.println("Phone Number : "+rs.getString("Phone"));
                System.out.println("Course : "+rs.getString("Course"));
                System.out.println("Batch : "+rs.getInt("Batch"));
                System.out.println("Gender : "+rs.getString("Gender"));
                System.out.println("-----------------------------------------------");
                System.out.println();
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
