package com.cxp.lambda.utils;

import com.cxp.lambda.mode.Parent;

/**
 * 文 件 名: Factory
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 15:32
 * 描    述: 工厂类接口
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface Factory<T extends Parent> {
    T create(String name,int age);
}

