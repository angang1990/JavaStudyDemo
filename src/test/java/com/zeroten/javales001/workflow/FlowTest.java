package com.zeroten.javales001.workflow;

import org.testng.annotations.Test;

import java.util.Random;

/**
 * @author angang @create 2019-12-23 14:48
 */
public class FlowTest {
    @Test
    public void testXh(){
        boolean notContinue = true;
        while(notContinue){
            int r = new Random().nextInt(1000);
            if ( r % 30 == 0) {
                System.out.println("随机数："+ r + "能被30整除，不再执行循环");
                notContinue = false;
            }else {
                System.out.println("随机数："+r);
            }
        }
    }

    @Test
    public void testWhile(){
        boolean notContinue = true;
        do {
            int r = new Random().nextInt(1000);
            if (r % 30 ==0) {
                System.out.println("随机数："+ r + "能被30整除，不再执行循环");
                notContinue = false;
            }else {
                System.out.println("随机数1："+r);
            }

        }while (notContinue);
    }

    @Test
    public void testSwitch() {
        int  cmdN = 1;
        switch (cmdN) {
            case 1:
                System.out.println("扫地");
                break;
            case 2:
                System.out.println("开灯");
                break;
            case 3:
                System.out.println("关灯");
                break;
            case 4:
                System.out.println("播放音乐");
            case 5:
                System.out.println("关闭音乐");
                break;
            default:
                System.out.println("不能识别的指令");
        }

    }
}
