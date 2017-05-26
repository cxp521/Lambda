package com.cxp.lambda.demo;

import java.util.function.Supplier;

/**
 * 文 件 名: Test10
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 16:46
 * 描    述: Supplier接口：返回一个给定类型的结果。不需要输入参数，无输入有输出
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test10 {
    public static void main(String[] args) {
        supplierTest();
    }
    private static void supplierTest(){
        Supplier<String> supplier = () -> "我就是输出";
        String s = supplier.get();
        System.out.println(s);
    }
}
