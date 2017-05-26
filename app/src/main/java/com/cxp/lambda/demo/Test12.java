package com.cxp.lambda.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 文 件 名: Test12
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 17:25
 * 描    述: 映射(map)：结合Function接口，该操作能将流对象中的每一个元素映射为另一个元素，实现元素类型的转换
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        streamMapTest(list);
    }

    private static void streamMapTest(List<String> list){
        list.stream().map(String::toUpperCase).sorted((s, t1) -> t1.compareTo(s)).forEach(System.out::println);
        System.out.println("- - - - - - ");
        //自定义映射规则
        Function<String,String> function = s -> {return  s + ".map3";};
        list.stream().map(function).forEach(System.out::println);
    }
}
