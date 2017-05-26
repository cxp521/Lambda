package com.cxp.lambda.demo;

/**
 * 文 件 名: Test1
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 15:03
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test1 {
    public static void main(String[] args){
        //传统方式使用接口
        Transform<String ,Integer> transform1 = new Transform<String, Integer>() {
            @Override
            public Integer transform(String s) {
                return Integer.valueOf(s);
            }
        } ;

        //Lamda方式使用接口,就是这么简单粗暴，没脾气
        Transform<String,Integer> transform2=s ->Integer.valueOf(s);

        //------------------------------------------------------------------------------------------------

        //传统方式实现Runnable
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是传统方式的Runnable");
            }
        });
        thread1.start();

        //Lambda方式实现Runnable
        Thread thread2=new Thread(()->System.out.print("我是Lambda方式的Runnable"));
        thread2.start();
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

