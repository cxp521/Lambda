package com.cxp.lambda.demo;

import com.cxp.lambda.mode.Boy;
import com.cxp.lambda.mode.Girl;
import com.cxp.lambda.mode.Parent;
import com.cxp.lambda.utils.Factory;

/**
 * 文 件 名: Test3
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 15:30
 * 描    述: 方法引用之构造方法引用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test3 {
    public static void main(String[] args){
        //传统方式
        Factory factory1 = new Factory() {
            @Override
            public Parent create(String name, int age) {
                return new Boy(name,age);
            }
        };
        Boy boy = (Boy) factory1.create("小黑",18);
        factory1 = new Factory() {
            @Override
            public Parent create(String name, int age) {
                return new Girl(name,age);
            }
        };
        Girl girl = (Girl) factory1.create("小白",18);
        //Lambda方式
        Factory<Boy> boyFactory=Boy::new;
        Boy boy1 = boyFactory.create("小明",18);
        Factory<Girl> girlFactory = Girl::new;
        Girl girl1 = girlFactory.create("小红",18);
        System.out.println("传统：===============");
        boy.doSome();
        girl.doSome();
        System.out.println("Lambda：===============");
        boy1.doSome();
        girl1.doSome();
    }
}
