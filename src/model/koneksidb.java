package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksidb {
    String host,username,pass;
    Statement st=null;
    public koneksidb(){
        this.host="jdbc:mysql://localhost:3306/labmanagement";
        this.username="root";
        this.pass="";
    }
    public com.mysql.jdbc.Connection getConnection(){
        com.mysql.jdbc.Connection con;
        try{
            con=(com.mysql.jdbc.Connection) DriverManager.getConnection(host, username, pass);
            System.out.println("Connect!");
            return con;
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database not connected!");
            return null;
        }
    }
    
    public void executeQuery(String query){
        try{
            com.mysql.jdbc.Connection con=getConnection();
            st=con.createStatement();
            if(st.executeUpdate(query)==1){
                JOptionPane.showMessageDialog(null, "Sukses!");
            }
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed!");
        }
    }
}