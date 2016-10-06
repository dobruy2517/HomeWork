package packageTraining;


import org.junit.Assert;
import org.junit.Test;

public class TestUser {

    private String username;
    private String password;

    public TestUser() {
        this.username = "TestUsername";
        this.password= "TestPassword";
    }

    public TestUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public TestUser(TestUser testUser) {
        this.username = testUser.username;
        this.password = testUser.password;
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


}
