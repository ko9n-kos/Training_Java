package com.testng.task;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase2 extends Greeting {

    @BeforeClass
    public void sayHello(){
        greeting();
    }

    @Test (enabled = true)
    @Parameters({"Is human can fly?"})
    public void testBoolean(boolean isHumanCanFly){
        Assert.assertFalse(isHumanCanFly, "Unfortunately we can't fly :-( ");


    }

    @Test (enabled = true)
    @Parameters({"emptyString", "wtf"})
    public void testFail(String emptyString, boolean wtf){
        Assert.assertFalse(wtf, emptyString);

    }

}
