package com.junit5.example;

import org.junit.jupiter.api.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈Fixtures〉
 *
 * @author Claire
 * @create 2020/11/8
 * @since 1.0.0
 */
public class Fixture {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll 执行");
    }
    @AfterAll
    public static void afterAll(){System.out.println("afterAll 执行");}
    @BeforeEach
    public void beforeEach(){System.out.println("beforeEach 执行");}
    @AfterEach
    public void afterEach(){System.out.println("afterEach 执行");}
    @Test
    public void testMethod01(){System.out.println("testMethod01 执行");}
    @Test
    public void testMethod02(){System.out.println("testMethod02 执行");}
    @Test
    public void testMethod03(){System.out.println("testMethod03 执行");}
}
