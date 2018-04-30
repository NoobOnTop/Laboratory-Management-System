package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListArray {
        koneksidb datacon = new koneksidb();
        private Connection con;
        
    public ArrayList<Member> getListDataMembers(){
        ArrayList<Member> listArrayDataLogin = new ArrayList<>();
        con=datacon.getConnection();
        Statement st;
        ResultSet rs;
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM member");
            Member member;
            while(rs.next()){
                member = new Member(rs.getString("nama"),rs.getString("address"),rs.getDate("tgl_lahir"), rs.getString("username"),rs.getString("password"),rs.getInt("id_member"));
                listArrayDataLogin.add(member);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listArrayDataLogin;
    }
    public ArrayList<Laboran> getListDataLaboran(){
        ArrayList<Laboran> listArrayDataLogin = new ArrayList<>();
        con=datacon.getConnection();
        Statement st;
        ResultSet rs;
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM laboran");
            Laboran laboran;
            while(rs.next()){
                laboran = new Laboran(rs.getString("nama"),rs.getString("address"),rs.getDate("tgl_lahir"), rs.getString("username"),rs.getString("password"),rs.getInt("id_laboran"));
                listArrayDataLogin.add(laboran);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listArrayDataLogin;
    }
}
