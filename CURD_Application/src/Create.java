import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner("System.in");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Libary_Management", "root",
                "@Radhakrishna297");
        String FirstName = "";
        String LastName = "";
        String Email = "";
        int Phone;
        String Course = "";
        int Batch;
        String Gender = "";
        while (true) {
            System.out.print("First Name: \n");
            FirstName=sc.nextLine();
            System.out.print("Last Name: \n");
            LastName=sc.nextLine();
            System.out.print("Email: \n");
            Email=sc.nextLine();
            System.out.print("Phone: \n");
            Phone=sc.nextInt();
            System.out.print("Course \n");
            Course=sc.nextLine();
            System.out.print("Batch \n");
            Batch=sc.nextInt();
            System.out.print("Gender \n");
            Gender=sc.nextLine();

            PreparedStatement ps = con.prepareStatement("insert into Registration values(?,?,?,?,?,?,?,?)");
            int count = ps.executeUpdate();
            if (count > 0) {
                System.out.println("Data inserted Successfully");
            } else {
                System.out.println("Data Not Been Inserted");
            }
        }
    }
}
