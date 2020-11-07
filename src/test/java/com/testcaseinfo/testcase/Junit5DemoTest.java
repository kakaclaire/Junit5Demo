package com.testcaseinfo.testcase;
import org.junit.jupiter.api.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈Junit5实例〉
 *
 * @author Claire
 * @create 2020/11/7
 * @since 1.0.0
 */
@DisplayName("juint5演示类")
public class Junit5DemoTest {

    @BeforeAll
    public static void before(){
        System.out.println("before");
    }
    @BeforeEach
    public void beforeeach(){
        System.out.println("beforeeach");
    }

    @Test
    @DisplayName("fun   测试方法")
//    @RepeatedTest(5)    //Junit5 中不需要修饰符
    @Tag("testdemo")
    void fun(){
        System.out.println("fun");
    }

    @Test
    @Disabled
    @DisplayName("fun1  测试方法")
    void fun1(){
        System.out.println("fun1");
    }

    @Test
    @Tag("testdemo")
    @DisplayName("fun2  测试方法")
    void fun2(){
        System.out.println("fun2");
    }

    @AfterEach
    public void aftereach(){
        System.out.println("aftereach");
    }
    @AfterAll
    public static void after(){
        System.out.println("after");
    }


}
