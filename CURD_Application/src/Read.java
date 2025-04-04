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
            ResultSet rs=smt.executeQuery(query);
            int count=0;
            if(rs.next()){
                count=rs.getInt(1);
                System.out.println(("Data printed Successfully"));
            }
            if(count==0){
                System.out.println("Data is Not Available");
                return;
            }
            while(rs.next()){
                System.out.println("First Name : "+rs.getString("FirstName"));
                System.out.println("Last Name : "+rs.getString("LastName"));
                System.out.println("Email : "+rs.getString("Email"));
                System.out.println("Phone Number : "+rs.getString("Phone"));
                System.out.println("Course : "+rs.getString("Course"));
                System.out.println("Batch : "+rs.getInt("Batch"));
                System.out.println("Gender : "+rs.getString("Gender"));
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
