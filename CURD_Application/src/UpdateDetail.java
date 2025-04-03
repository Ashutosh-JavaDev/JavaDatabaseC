import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;

class updateDetail {
    public void Updatedetail() {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Libary_Mangement", "root",
                    "@Radhakrishna297");
            System.out.println("Enter the Student ID whose data want to Update");
            int student = sc.nextInt();
            String query = ("Select STU_ID = ? from Registration");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, student);
            ResultSet rs = ps.executeQuery();
            int count = 0;
            if (rs.next()) {
                rs.getInt(count);
            }
            if (count == 0) {
                System.out.println("No Student is Found with this student ID in the Table");
            }
            System.out.println(
                "Press 1:To Update First Name\nPress 2: To Update Last Name\nPress 3:To Update Email\nPress 4:To Update Phone Number\nPress 5:To Update Course\nPress 6:To Update Batch\nPress 7:To Update Gender");
        int choice = sc.nextInt();
        sc.nextLine();
        String ColumntoUpdate = " ";
           while(true){
           
        switch (choice) {
            case 1:
                ColumntoUpdate = "FirstName";
                break;
            case 2:
                ColumntoUpdate = "FirstName";
                break;
            case 3:
                ColumntoUpdate = "FirstName";
                break;
            case 4:
                ColumntoUpdate = "FirstName";
                break;
            case 5:
                ColumntoUpdate = "FirstName";
                break;
            case 6:
                ColumntoUpdate = "FirstName";
                break;
            case 7:
                ColumntoUpdate = "FirstName";
                break;
                default:
                System.out.println("Wrong press Choose wisely");
                continue;

        }
           }
            System.out.println("Enter the value want to Update in :" + ColumntoUpdate);
            String newUpdate = sc.nextLine();
            String UpdateQuery = ("Update Registration set " + ColumntoUpdate + "=? where STU_ID = ?");
            PreparedStatement pst = con.prepareStatement(UpdateQuery);
            pst.setString(1, newUpdate);
            pst.setInt(2, student);
            int value = pst.executeUpdate();
            if (value > 0) {
                System.out.println("Data Updated Successfully");
            } else {
                System.out.println("Data has Not Been Updated");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class UpdateDetail {
    public static void main(String[] args) {
        updateDetail ob = new updateDetail();
        ob.Updatedetail();
    }
}
