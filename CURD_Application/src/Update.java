import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Scanner;

class updation {
    public static void update() {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jbdc:mysql://localhost:3306/Libary_Mangement", "root",
                    "@Radhakrishna297");
            System.out.println("Enter the Student ID whose Data want to Update");
            int Student = sc.nextInt();
            Statement smt = con.createStatement();
            ResultSet re = smt.executeQuery("Select*from Registration");
            int count = 0;
            while (re.next()) {
                count++;
            }
            // return count;
            System.out.println(
                    "Press 1:To Update First Name\nPress 2: To Update Last Name\nPress 3:To Update Email\nPress 4:To Update Phone Number\nPress 5:To Update Course\nPress 6:To Update Batch\nPress 7:To Update Gender");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (count > 0) {
                        System.out.println("Enter the New First Name of the Student");
                        String newUpdation = sc.nextLine();
                        PreparedStatement ps = con.prepareStatement("Update Registration set FirstName='" + newUpdation
                                + "' where STU_ID='" + Student + "' ");
                        int val = ps.executeUpdate();
                        if (val > 0) {
                            System.out.println("Data Updated Succesfully");
                        } else {
                            System.out.println("Data has Not been Updated");
                        }
                    }
                    else{
                        System.out.println("No Student is Found with this Student ID");
                    }
                    break;
                case 2:
                    if (count > 0) {
                        System.out.println("Enter the New Last Name of the Student");
                        String newUpdation = sc.nextLine();
                        PreparedStatement ps = con.prepareStatement("Update Registration set LastName='" + newUpdation
                                + "' where STU_ID='" + Student + "' ");
                        int val = ps.executeUpdate();
                        if (val > 0) {
                            System.out.println("Data Updated Succesfully");
                        } else {
                            System.out.println("Data has Not been Updated");
                        }
                    }
                    else{
                        System.out.println("No Student is Found with this Student ID");
                    }
                    break;
                    case 3:
                    if (count > 0) {
                        System.out.println("Enter the New Email of the Student");
                        String newUpdation = sc.nextLine();
                        PreparedStatement ps = con.prepareStatement("Update Registration set Email='" + newUpdation
                                + "' where STU_ID='" + Student + "' ");
                        int val = ps.executeUpdate();
                        if (val > 0) {
                            System.out.println("Data Updated Succesfully");
                        } else {
                            System.out.println("Data has Not been Updated");
                        }
                    }
                    else{
                        System.out.println("No Student is Found with this Student ID");
                    }
                    break;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

public class Update {
    public static void main(String[] args) {

    }
}
