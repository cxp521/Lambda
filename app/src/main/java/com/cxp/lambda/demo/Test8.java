package com.cxp.lambda.demo;

import java.util.function.Function;

/**
 * 文 件 名: Test8
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 16:25
 * 描    述: Function接口：接受一个参数，返回单一的结果。默认的方法（andThen）可将多个函数串在一起，形成复合Funtion（有输入，有输出）结果  接受一个参数，返回一个参数
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test8 {
    public static void main(String[] args) {
        functionTest();
    }
    public static void functionTest(){
        Function<String, Integer> toInteger = Integer::valueOf;
        //toInteger的执行结果作为第二个backToString的输入
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        String result=backToString.apply("123456");
        System.out.println(result);
        Function<Integer, Integer> add =(i) ->{
            System.out.println("frist input:" + i);
            return i * 2;
        };
        Function<Integer, Integer> zero = add.andThen((i) -> {
            System.out.println("second input:" + i);
            return i * 0;
        });
        Integer res = zero.apply(9);
        System.out.println(res);
    }
}
