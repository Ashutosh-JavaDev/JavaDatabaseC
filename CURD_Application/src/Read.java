import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
class fetchStatement{
    public void readValue(){
        try{
            Class .forName("com.cj.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Libary_Mangemant", "root", "@Radhakrishna");
            System.out.println("Program Run Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
}
public class Read{

}
