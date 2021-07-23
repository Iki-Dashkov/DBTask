import classes.Passwords;
import classes.User;
import classes.UsersList;

public class main {

    public static void main(String[] args) {

        Passwords pass1 = new Passwords();
        pass1.add("passwordsQ1");
        //pass1.add("pass2");

        //System.out.println("qwe"+pass1.changePassword("user1"));

        User user1 = new User("user1",pass1,"name");
        //User user2 = new User("user2","pass2","name2");
        //User user3 = new User("user3","pass3","name1changes");


        UsersList uList = new UsersList();
        uList.add(user1);
        //uList.add(user2);
        //uList.add(user3);
        System.out.println(uList);
        //uList.remove("user1");
        //System.out.println(uList);
        //System.out.println("search "+uList.search("user34"));
        System.out.println("check "+pass1.checkPassword());
    }
}
