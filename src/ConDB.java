import java.sql.Connection;
import java.sql.DriverManager;

public class ConDB {
    public static Connection getConnection(){
        String dbRoot,dbHost,dbName,dbURL;
        String hostUser,hostPassword;

        
        try{
            dbRoot = "jdbc:mysql://";
            dbHost = "localhost:3306/";
            dbName = "attendance_system";
            dbURL = dbRoot + dbHost + dbName;
            
            hostUser = "root";
            hostPassword = "";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, hostUser, hostPassword);
            
            return conn;
        }catch(Exception e){
            System.out.println(e);
        }
        
        return null;
    }
}
