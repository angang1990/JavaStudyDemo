package com.zeroten.javales001.workflow;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author angang @create 2019-12-23 15:55
 */
public class TestTdd {
    @Test
    public void test(){
        int age = 10;
        String result = tddTest (age);
        Assert.assertEquals("少年",result);
    }

    private String tddTest (int age) {
        if (age <= 6) {
            return "儿童";
        }else if (age <= 17) {
            return "少年";
        }else if (age <= 40) {
            return "青年";
        }else if (age <= 59) {
            return "中年";
        }else {
            return "老年";
        }
    }
}
