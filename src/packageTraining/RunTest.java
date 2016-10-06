package packageTraining;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AID on 30.09.2016.
 */
public class RunTest {
    @Test
    public void Test() {
        TestUser newTestUser = new TestUser();
        TestUser newTestUser1 = new TestUser("TestUsername", "TestPassword");
        Assert.assertEquals(newTestUser1.getUsername(), "TestUsername");
        TestUser newTestUser2 = new TestUser(newTestUser1);
        Assert.assertEquals(newTestUser2.getPassword(), newTestUser1.getPassword());
    }

    public void jhks() {
        return;
    }
}
