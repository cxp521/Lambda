package com.cxp.lambda.demo;

import java.util.function.Consumer;

/**
 * 文 件 名: Test7
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 16:19
 * 描    述: consumer接口：对输入的参数进行操作。有输入没输出  接受一个参数，不返回参数
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test7 {
    public static void main(String[] args) {
        //接受一个参数，不返回参数
        consumerTest();
    }
    private static void consumerTest(){
        Consumer<Integer> add=(num)->{
            System.out.println("old value:" + num);
            num+=5;
            System.out.println("new value:" + num);
        };
        add.accept(10);
    }
}
