import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;
class updateDetail{
    public void Updatedetail(){
        Scanner sc=new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/3306/Libary_Mangement", "root", "@Radhakrishna297");
            System.out.println("Code is Running");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class UpdateDetail {
    
}
