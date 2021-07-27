import classes.Password;
import classes.PasswordsList;
import classes.User;
import classes.UsersList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class main {

    public static void main(String[] args) {

        User user1 = new User("victoriA1","qwertyu8I","Jane");
        //user1.getPasswords().add("qwertyu7I");
        user1.getPasswords().add("zxcvbnm7I");
        User user2 = new User("user2","","Kate");
        UsersList userList = new UsersList();
        userList.add(user1);
        userList.add(user2);
        System.out.println(userList);
        userList.removeUser("user2");
        System.out.println(userList);
        System.out.println(user1.getPasswords().isSimilar());





    }
}
