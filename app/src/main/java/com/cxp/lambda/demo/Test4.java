package com.cxp.lambda.demo;

/**
 * 文 件 名: Test4
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 15:41
 * 描    述: 方法引用之静态方法引用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test4 {
    public static void main(String[] args){
        //传统方式
        Transform<String ,Integer> transform1 = new Transform<String, Integer>() {
            @Override
            public Integer transform(String s) {
                return Test4.strToInt(s);
            }
        };
        int result1 = transform1.transform("100");
        System.out.println("传统："+result1);
        //Lambda方式
        Transform<String,Integer> transform2=Test4::strToInt;
        int result2 = transform2.transform("200");
        System.out.println("Lambda:"+result2);
    }

    static int strToInt(String str){
        return Integer.valueOf(str);
    }

    /**
     * 函数式接口
     * @param <A>
     * @param <B>
     */
    @FunctionalInterface
    interface Transform<A,B>{
        B transform(A a);
    }
}
