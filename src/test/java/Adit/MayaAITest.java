package Adit;

import org.junit.Assert;
import org.junit.Test;

public class MayaAITest {

    @Test
    public void testDatabaseStatus() {
        // Directly hardcoding the roll number and password
        String rollNo = "2000000018";
        String password = "Thub@123";

        MayaAI mayaAI = new MayaAI();
        boolean isActive = mayaAI.checkDatabaseStatus(rollNo, password);
        Assert.assertTrue("Expected database status to be 'Active'", isActive);
    }
}
