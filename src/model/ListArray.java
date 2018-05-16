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
                member = new Member(rs.getString("nama_member"),rs.getString("address"),rs.getDate("tgl_lahir"), rs.getString("username"),rs.getString("password"),rs.getInt("id_member"));
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
                laboran = new Laboran(rs.getString("nama_laboran"),rs.getString("address"),rs.getDate("tgl_lahir"), rs.getString("username"),rs.getString("password"),rs.getInt("id_laboran"));
                listArrayDataLogin.add(laboran);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listArrayDataLogin;
    }
    public ArrayList<Barang> getListDataBarang(){
        ArrayList<Barang> listArrayDataLogin = new ArrayList<>();
        con=datacon.getConnection();
        Statement st;
        ResultSet rs;
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM barang");
            Barang barang;
            while(rs.next()){
                barang = new Barang(rs.getInt("id_barang"),rs.getString("nama_barang"),rs.getInt("harga"), rs.getInt("depreciation"),rs.getString("deskripsi"),rs.getDate("tgl_masuk"),rs.getString("status_peminjmana"),rs.getString("kondisi"));
                listArrayDataLogin.add(barang);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listArrayDataLogin;
    }
    
    public ArrayList<Peminjaman> getListDataPeminjaman(){
        ArrayList<Peminjaman> listArrayDataLogin = new ArrayList<>();
        con=datacon.getConnection();
        Statement st;
        ResultSet rs;
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM peminjaman");
            Peminjaman peminjaman;
            while(rs.next()){
                peminjaman = new Peminjaman(rs.getInt("id_peminjaman"),rs.getInt("id_barang"),rs.getInt("id_laboran"), rs.getInt("id_member"),rs.getInt("lama_peminjaman"),rs.getInt("fee"),rs.getDate("tgl_peminjaman"),rs.getDate("tgl_pengembalian"));
                listArrayDataLogin.add(peminjaman);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listArrayDataLogin;
    }
}
