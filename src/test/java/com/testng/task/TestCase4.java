package com.testng.task;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase4 extends Greeting {

    @BeforeClass
    public void sayHello(){
        greeting();
    }


    @Test(enabled = true)
    @Parameters({"sentence1", "sentence1", "sentence3"})
    public void containsString(String sentence1, String sentence2, String sentence3){
        Assert.assertEquals(sentence1,sentence2,sentence3);
    }



    @Test (enabled = true)
    @Parameters({"a", "b", "c"})
    public void testEvenNumber(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(dividesByTwo(sum));

    }





}
