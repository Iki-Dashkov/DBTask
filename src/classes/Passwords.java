package classes;

import java.util.ArrayList;

public class Passwords {
    ArrayList<String> list = new ArrayList<String >();
    User user;

    //todo addPassword
    public boolean add(String password){
        //checkPassword();
        return list.add(password);
    }
    //todo changePassword
    public boolean changePassword(String newPassword) {
        for (int i = 0; i <this.list.size(); i++) {
            if (newPassword == list.get(i)) {
                System.out.println("same with privious passwords");
                return false;
            }
        }
        return add(newPassword);
    }
    //todo ckeckingPassword
    public boolean checkPassword(){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()<8||list.get(i).isEmpty()){
                System.out.println("no length or empty");
                return false;
            }
            if(!list.get(i).matches(".*[A-Z]+.*")){
                System.out.println("no Big letters");
                return false;
            }
            if(!list.get(i).matches(".*[0-9]+.*")){
                System.out.println("no digits");
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + list.get(list.size()-1) ;
    }
}
