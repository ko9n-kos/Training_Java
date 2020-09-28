package com.testng.task;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 extends Greeting {

    @BeforeClass
    public void sayHello(){
        greeting();
    }

    @Test (enabled = true)
    @Parameters({"string1", "string2"})
    public void testStrings(String string1, String string2){
        Assert.assertNotEquals(string1, string2);

    }

    @Test (enabled = true)
    @Parameters({"a", "b", "c"})
    public void testContains(double a, double b, double c){
        Assert.assertEquals(a, b, c);

    }




}
