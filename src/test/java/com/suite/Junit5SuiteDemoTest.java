package com.suite;

import com.testcaseinfo.testcase.Junit5DemoTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Claire
 * @create 2020/11/7
 * @since 1.0.0
 */
@RunWith(JUnitPlatform.class)
//@SelectPackages({
//        "com.testcaseinfo"})
//@IncludePackages({
//        "com.testcaseinfo.testcase1",
//        "com.testcaseinfo.testcase2"})
@SelectClasses({
        Junit5DemoTest.class
})
@IncludeTags({
        "testdemo"
})
public class Junit5SuiteDemoTest {
}
