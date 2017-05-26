package com.cxp.lambda.mode;

/**
 * 文 件 名: Boy
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 15:31
 * 描    述:男孩类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Boy extends Parent {

    public Boy(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSome() {
        System.out.println("我是个男孩");
    }
}
