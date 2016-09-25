package packageTraining;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by AID on 24.09.2016.
 */
public class User {
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(User user) {
        this.username = user.username;
        this.password = user.password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static void main(String[] args) {

        User newUser = new User();
        System.out.println(newUser.username);

        User newUser1 = new User("TestUsername", "TestPassword");
        System.out.println(newUser1);
        User newUser2 = new User(newUser1);
        System.out.println(newUser2);
    }
}
