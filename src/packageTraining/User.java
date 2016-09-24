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

    User newUsername = new User();
    newUsername.username;

    User newUser=new User("TestUsername", "TestPassword");
    }
}
