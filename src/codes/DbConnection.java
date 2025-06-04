
package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class DbConnection {
    private static Connection conn = null;
    
    public static Connection connect(){
        
        
        try
        {
//            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mynewdb","root","");
        }
        catch(Exception ex)
        {
            System.out.println(e.getMessage());
        }
        return conn; 
    }
    
    
    public static void tableload(String query, JTable table){
        try{
            
            if(conn==null)
                connect();
            //String selectquary = "select Vno,type,color,employee from vehicle"; 
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void execute(String query){
        try{
            
            if(conn == null)
                connect();
            
            PreparedStatement pst =conn.prepareStatement(query);
            pst.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    

    
}
