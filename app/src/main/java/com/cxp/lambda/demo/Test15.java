package com.cxp.lambda.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 文 件 名: Test15
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 18:31
 * 描    述: 收集(collect):在对经过变换后，将变换的stream元素收集，比如将这些元素存在集合中，可以使用stream提供的collect方法
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test15 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        streamCollectTest(list);
    }

    private static void streamCollectTest(List<String> list){
        List<String> listNew = list.stream().filter(s -> s.startsWith("b")).sorted().collect(Collectors.toList());
        System.out.println(listNew );
    }
}
