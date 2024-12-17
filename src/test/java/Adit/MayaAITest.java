package Adit;

import org.junit.Assert;
import org.junit.Test;

public class MayaAITest {

    @Test
    public void testDatabaseStatus() {
        MayaAI mayaAI = new MayaAI();
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver"
        boolean isActive = mayaAI.checkDatabaseStatus("2000000018", "Thub@123");
        Assert.assertTrue("Database should be active", isActive);
    }
}
