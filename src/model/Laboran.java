package model;
import java.util.Date;
public class Laboran extends Orang {
    protected String username,password;
    protected int id_laboran;
    public Laboran(String nama, String address,Date tgl_lahir, String username,String password,int id_laboran) {
        super(nama, address,tgl_lahir);
        this.username=username;
        this.password=password;
        this.id_laboran=id_laboran;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public int getId(){
        return id_laboran;
    }
}
