package com.junit5.demo;

import com.util.Calculator;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 〈一句话功能简述〉<br>
 * 〈Fixtures〉
 *加减共用了类全局变量result，所以加减并发会出现此类问题，将其变为方法内部变量就不会出现此类问题
 * @author Claire
 * @create 2020/11/8
 * @since 1.0.0
 */
@Epic("Epic 计算器项目")
@Feature("Feature 冒烟测试用例")
public class Junit5Demo_5_1_Allure {

    @Test
    @Order(1)
    @Description("Description")
    @Story("Story 加法测试")
    @DisplayName("DisplayName 加法测试")
    @Severity(SeverityLevel.BLOCKER)//级别
    @Issue("www.baidu.com")
    @Link(name="Link 社区贴",type ="mylink",url="https://ceshiren.com/t/topic/7718/2")
    public void addTest() {
        final int result01 = Calculator.add(4, 2);
        System.out.println(result01);


        int result02 = Calculator.add(5, 2);
        System.out.println(result02);

        int result03 = Calculator.add(6, 2);
        System.out.println(result03);
        Allure.addAttachment("pic","image/png",this.getClass().getResourceAsStream("/160160.png"),".png" );

        assertAll("计算结果校验",
                () -> assertEquals(6, result01),
                () -> assertEquals(5, result02),
                () -> assertEquals(7, result03)
        );


    }

    @Test
    @Order(2)
    public void subTractTest() {
        int result = Calculator.subtract(4, 2);
        System.out.println(result);
        assertEquals(2, result);
    }

    @Test
    @Order(3)
    public void multiplyTest() {
        int result = Calculator.multiply(4, 2);
        System.out.println(result);
        assertEquals(8, result);
    }

    @Test
    public void divideTest() {
        int result = Calculator.divide(4, 2);
        System.out.println(result);
        assertEquals(2, result);
    }
    @BeforeEach//每个方法前执行
    public void clear(){
        Calculator.clear();
    }


    @Test
    @Order(5)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        System.out.println(result);
        assertEquals(3, result);
    }

}
