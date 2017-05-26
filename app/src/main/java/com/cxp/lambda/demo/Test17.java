package com.cxp.lambda.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 文 件 名: Test17
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 18:52
 * 描    述: 计数(count):用来统计流中元素的总数
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test17 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        streamCountTest(list);
    }

    private static void streamCountTest(List<String> list){
        long count = list.stream().filter(s -> s.startsWith("b")).count();
        System.out.println("以'b'开头的数量："+ count);
    }
}
