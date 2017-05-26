package com.cxp.lambda.mode;

/**
 * 文 件 名: Girl
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 15:35
 * 描    述: 女孩类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Girl extends Parent {
    public Girl(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSome() {
        System.out.println("我是个女孩");
    }
}
