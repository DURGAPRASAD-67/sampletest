package com.example;

import org.junit.Assert;
import org.junit.Test;

public class TestMayaAI {

    @Test
    public void testDatabaseStatus() {
        MayaAI mayaAI = new MayaAI();
        boolean isActive = mayaAI.checkDatabaseStatus("2000000018", "Thub@123");
        Assert.assertTrue("Database should be active", isActive);
    }
}
