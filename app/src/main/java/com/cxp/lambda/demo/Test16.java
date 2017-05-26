package com.cxp.lambda.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 文 件 名: Test16
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 18:34
 * 描    述: 规约(reduce):允许我们用自己的方式计算元素或者将一个stream中元素以某种规律关联
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test16 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        streamReduceTest(list);
    }
    private static void streamReduceTest(List<String> list){
        Optional<String> optional = list.stream().sorted().reduce((s, s2) -> {
            System.out.println(s+"-"+s2);
            return s+"-"+s2;
        });
    }
}
