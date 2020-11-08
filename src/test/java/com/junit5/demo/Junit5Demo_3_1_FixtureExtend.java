package com.junit5.demo;

import org.junit.jupiter.api.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈Fixtures〉
 *
 * @author Claire
 * @create 2020/11/8
 * @since 1.0.0
 */
public class Junit5Demo_3_1_FixtureExtend extends Junit5Demo_3_1_Fixture {
    @BeforeAll
    public static void beforechildAll() {
        System.out.println("beforechildAll 执行");
    }

    @AfterAll
    public static void afterchildAll() {
        System.out.println("afterchildAll 执行");
    }

    @BeforeEach
    public void beforechildEach() {
        System.out.println("beforechildEach 执行");
    }

    @AfterEach
    public void afterchildEach() {
        System.out.println("afterchildEach 执行");
    }

    @Test
    public void testchildMethod01() {
        System.out.println("testchildMethod01 执行");
    }

    @Test
    public void testchildMethod02() {
        System.out.println("testchildMethod02 执行");
    }

    @Test
    public void testchildMethod03() {
        System.out.println("testchildMethod03 执行");
    }
}
