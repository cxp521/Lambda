package com.cxp.lambda.demo;


import java.util.Objects;
import java.util.function.Predicate;

/**
 * 文 件 名: Test9
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 16:36
 * 描    述: Predicate接口：输入一个参数，返回一个boolean值，内置了许多用于逻辑判断的默认方法  用于测试是否符合条件
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test9 {
    public static void main(String[] args) {
        predicateTest();
    }
    public static void predicateTest(){
        Predicate<String> predicateStr = s -> s.length()>8;
        boolean testResult = predicateStr.test("test");//需要api 24
        System.out.println(testResult);
        testResult = predicateStr.negate().test("test");//取反，也就是s.length<=8
        System.out.println(testResult);
        Predicate<Object> predicateObj = Objects::nonNull;
        Object obj = null;
        testResult = predicateObj.test(obj);//判断是否为空
        System.out.println(testResult);
    }
}
