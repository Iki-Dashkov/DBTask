package classes;

import java.util.HashMap;
import java.util.Map;

public class UsersList {
    Map<String, User> map;

    public UsersList() {
        this.map = new HashMap<String, User>();
    }

    public boolean add(User user) {
        if(map.containsKey(user.login)){
            return false;
        }
        return this.map.put(user.login, user) == null ? false : true;
    }

    // todo remove user
    public boolean remove(String login){
        if((map.containsKey(login))){
            map.remove(login);
        }
        return false;
    }

    //todo search user by login
    public User search(String login){
        /*if(this.map.get(login)==null){
            System.out.println("User not found");
        }*/
        return this.map.get(login);
    }


    @Override
    public String toString() {
        String result = "";
        for (User user : map.values()) {
            result += user+System.lineSeparator();
        }
        return result;
    }
}
