package model;
import java.util.ArrayList;
public class CheckLogin {
    String username,password;
    public CheckLogin(String username, String password){
        this.username=username;
        this.password=password;
    }
    public boolean checkLoginMember(){
        ListArray listArray=new ListArray();
        ArrayList<Member> list = new ArrayList<>();
        list=listArray.getListDataMembers();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getUsername().equals(username) && list.get(i).getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    public boolean checkLoginLaboran(){
        ListArray listArray=new ListArray();
        ArrayList<Laboran> list = new ArrayList<>();
        list=listArray.getListDataLaboran();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getUsername().equals(username) && list.get(i).getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
