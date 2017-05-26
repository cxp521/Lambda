package com.cxp.lambda.demo;

/**
 * 文 件 名: Test6
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 16:15
 * 描    述:访问权限之成员_静态   Lambda表达式内部对静态变量和成员变量是可读可写的
 */
public class Test6 {
    public int num1 = 6;
    public static int num2 = 8;
    private int getSum(){
        Sum sum = value -> {
            num1 = 10;
            num2 = 10;
            return  num1 + num2;
        };
        return sum.add(1);
    }

    /**
     * 函数式接口
     */
    @FunctionalInterface
    interface Sum{
        int add(int value);
    }
}
