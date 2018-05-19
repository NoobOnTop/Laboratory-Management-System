
package model;
import java.util.Date;
public abstract class Orang {
    public String nama,address;
    public Date tgl_lahir;
    public Orang(String nama,String address,Date tgl_lahir){
        this.nama=nama;
        this.address=address;
        this.tgl_lahir=tgl_lahir;
    }
    
    public String getNama(){
        return nama;
    }
    public String getaddress(){
        return address;
    }
    public Date getDate(){
        return tgl_lahir;
    }
    
    public abstract String getUsername();
    public abstract String getPassword();
    public abstract int getId();
}
