package com.testcaseinfo.testcase;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Claire
 * @create 2020/11/7
 * @since 1.0.0
 */
public class LoginTest {
    protected static HashMap<String,Object>dataMap=new HashMap<String,Object>();

    @Test
    void loginTest(){
        dataMap.put("login","登录成功");
//        System.out.println(dataMap.get("login"));
    }
    @Nested
    class PayTest{
        @Test
        void payTest(){
            if (null!=dataMap.get("buy")){
                System.out.println("正在支付，请等待");
                System.out.println(dataMap.get("buy"));
            }else{
                System.out.println("你还没购买课程，请先去购买课程");
            }
        }
    }
    @Nested//通过这个解释器可以在一个类里写操作,写法是倒序，除了主类，执行也是倒序的
    class BuyTest{
        @Test
        void buyTest(){
            if(dataMap.get("login").equals("登录成功")){
                System.out.println("登录成功啦，可以购买东西啦");
                dataMap.put("buy","购买了Hogwarts的教程");
            }else {
                System.out.println("登录失败，重新登录吧");
            }

        }
    }



}
