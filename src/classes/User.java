package classes;

public class User {
    String login;
    //String password;
    Passwords passwords;
    String name;

    public User(String login, Passwords password, String name) {
        this.login = login;
        this.passwords = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + passwords + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
