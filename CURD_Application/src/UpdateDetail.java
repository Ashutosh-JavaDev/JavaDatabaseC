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
            int student=sc.nextInt();
            Statement smt=con.createStatement();
            String query=("Select STU_ID = ? from Registration");
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            ps.setString(1,student);
            if(rs.next()){
                System.out.println(
                    "Press 1:To Update First Name\nPress 2: To Update Last Name\nPress 3:To Update Email\nPress 4:To Update Phone Number\nPress 5:To Update Course\nPress 6:To Update Batch\nPress 7:To Update Gender");
                    int choice=sc.nextInt();
                    switch(choice){
                        case 1:

                    }
            }
            else{
                System.out.println("No Student is Found with this student ID in the Table");
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
