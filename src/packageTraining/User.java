package packageTraining;


import org.testng.Assert;
import org.testng.annotations.Test;


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

    @Test
    public void Test() {
        User newUser = new User();
        System.out.println(newUser.username);
        User newUser1 = new User("TestUsername", "TestPassword");
        Assert.assertEquals(newUser1.getUsername(), "TestUsername");
        User newUser2 = new User(newUser1);
        Assert.assertEquals(newUser2.password, newUser1.password);
    }
}
