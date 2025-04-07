import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Deletion {
    void delete() {
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Libary_Mangement","root","@Radhakrishna297");
            //.............................................................
            System.out.println("Enter the Student ID whose data want to Delete");
            int student = sc.nextInt();
            String query = "SELECT COUNT(*) FROM Registration WHERE STU_ID = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, student);
            ResultSet rs = ps.executeQuery();
            int count = 0;
            if (rs.next()) {
                count=rs.getInt(1);
                // count++;
            }
            if (count == 0) {
                System.out.println("No Student is Found with this student ID in the Table");
                return;
            }
           

            // String ColumntoDelete = sc.nextLine();

          
           

            
            String DeleteQuery = ("delete Registration where STU_ID = ?");
            PreparedStatement pst = con.prepareStatement(DeleteQuery);
            // pst.setString(1, newDelete);
            pst.setInt(1, student);
            int value = pst.executeUpdate();
            if (value > 0) {
                System.out.println("Data Deleted Successfully");
            } else {
                System.out.println("Data has Not Been Deleted");
            }
            // Close resources
            rs.close();
            ps.close();
            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Delete {

}
