package model;
import java.util.Date;
public class Member extends Orang{
    protected String username,password,email;
    protected int id_member;
    public Member(String nama, String address,Date tgl_lahir, String username,String password,int id_member,String email) {
        super(nama, address,tgl_lahir);
        this.username=username;
        this.password=password;
        this.id_member=id_member;
        this.email=email;
    }
    @Override
    public String getUsername(){
        return username;
    }
    @Override
    public String getPassword(){
        return password;
    }
    @Override
    public int getId(){
        return id_member;
    }
    
}
