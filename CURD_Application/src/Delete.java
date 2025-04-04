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
           

            String ColumntoDelete = " ";

            while (true) {
                System.out.println(
                    "Press 1:To Delete First Name\nPress 2: To Delete Last Name\nPress 3:To Delete Email\nPress 4:To Delete Phone Number\nPress 5:To Delete Course\nPress 6:To Delete Batch\nPress 7:To Delete Gender");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        ColumntoDelete = "FirstName";
                        break;
                    case 2:
                        ColumntoDelete = "LastName";
                        break;
                    case 3:
                        ColumntoDelete = "Email";
                        break;
                    case 4:
                        ColumntoDelete = "Phone";
                        break;
                    case 5:
                        ColumntoDelete = "Course";
                        break;
                    case 6:
                        ColumntoDelete = "Batch";
                        break;
                    case 7:
                        ColumntoDelete = "Gender";
                        break;
                    default:
                        System.out.println("Wrong press Choose wisely");
                        continue;

                }
                break;
            }
            System.out.println("Enter the value want to Delete in : " + ColumntoDelete);

            String newDelete = sc.nextLine();
            String DeleteQuery = ("delete Registration set " + ColumntoDelete + "=? where STU_ID = ?");
            PreparedStatement pst = con.prepareStatement(DeleteQuery);
            pst.setString(1, newDelete);
            pst.setInt(2, student);
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
