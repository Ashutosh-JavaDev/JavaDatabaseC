import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Libary_Mangement", "root",
                    "@Radhakrishna297");
            String FirstName = "";
            String LastName = "";
            String Email = "";
            int Phone;
            String Course = "";
            int Batch;
            String Gender = "";

            String str = "";

            while (true) {
                System.out.println("Press Stop to Stop Inserting\nelse Insert Data");
                str = sc.nextLine();
                if (str.equalsIgnoreCase("Stop")) {
                    return;
                } else {
                    System.out.print("First Name: \n");
                    FirstName = sc.nextLine();
                    System.out.print("Last Name: \n");
                    LastName = sc.nextLine();
                    System.out.print("Email: \n");
                    Email = sc.nextLine();
                    System.out.print("Phone: \n");
                    Phone = sc.nextInt();
                    System.out.print("Course \n");
                    Course = sc.nextLine();
                    System.out.print("Batch \n");
                    Batch = sc.nextInt();
                    System.out.print("Gender \n");
                    Gender = sc.nextLine();
                }

                PreparedStatement ps = con.prepareStatement("insert into Registration values(?,?,?,?,?,?,?)");
                ps.setString(1, FirstName);
                ps.setString(2, LastName);
                ps.setString(3, Email);
                ps.setInt(4, Phone);
                ps.setString(5, Course);
                ps.setInt(6, Batch);
                ps.setString(7, Gender);

                int count = ps.executeUpdate();
                if (count > 0) {
                    System.out.println("Data inserted Successfully");
                } else {
                    System.out.println("Data Not Been Inserted");
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
