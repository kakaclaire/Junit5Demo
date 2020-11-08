package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

/**
 * 〈一句话功能简述〉<br>
 * 〈Fixtures〉
 *加减共用了类全局变量result，所以加减并发会出现此类问题，将其变为方法内部变量就不会出现此类问题
 * @author Claire
 * @create 2020/11/8
 * @since 1.0.0
 */
public class Junit5Demo_4_2_Mixparallel {

    @RepeatedTest(10)
    public void addTest(){
        int result = Calculator.add(4,2);
        System.out.println(result);
        assertEquals(6,result);
    }
    @RepeatedTest(10)
    public void subTractTest(){
        int result = Calculator.subtract(4,2);
        System.out.println(result);
        assertEquals(2,result);
    }
}
