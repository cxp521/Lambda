package com.cxp.lambda.demo;

/**
 * 文 件 名: Test2
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 15:25
 * 描    述: 方法引用之实例方法引用
 *
 * 在lambda表达式中，方法引用是一种简化写法，引用的方法就是Lambda表达式的方法体的实现
 * 语法结构：ObjectRef:: methodName
 * 左边是类名或者实例名，中间的“：：”是方法引用符号，右边是相应的方法名
 * 方法引用一般分为三类：
 * 静态方法引用，实例方法引用，构造方法引用
 *
 */
public class Test2 {
    public static void main(String[] args){
        //传统方式
        Transform<String ,Integer> transform1 = new Transform<String, Integer>() {
            @Override
            public Integer transform(String s) {
                return new Obj().strToInt(s);
            }
        };
        int result1 = transform1.transform("100");
        System.out.println("传统："+result1);
        //Lambda方式
        Obj obj = new Obj();
        Transform<String,Integer> transform2=obj::strToInt;
        int result2 = transform2.transform("200");
        System.out.println("Lambda:"+result2);
    }

    /**
     * 函数式接口
     * @param <A>
     * @param <B>
     */
    interface Transform<A,B>{
        B transform(A a);
    }
    /**
     * 实例对象类
     */
    static class Obj{
        public int strToInt(String str){
            return Integer.valueOf(str);
        }
    }
}


