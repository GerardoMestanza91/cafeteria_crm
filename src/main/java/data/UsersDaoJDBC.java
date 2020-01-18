package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author gerry
 */
public class UsersDaoJDBC {

    String sql = "SELECT * FROM users WHERE user_name=? AND user_password=?";
    String url ="jdbc:mysql://localhost:3306/Cafeteria_CRM?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    String username = "root";
    String password = "password";
    
    public boolean checkUser(String uname, String upassword){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password );
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,uname );
            stmt.setString(2,upassword);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
            return true;
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    
    
    }
}
