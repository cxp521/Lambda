package com.cxp.lambda.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 文 件 名: Test13
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 18:14
 * 描    述: 过滤(filter)：结合Predicate接口，Filter对流对象中的所有元素进行过滤,该操作是一个中间操作，这意味着你可以在操作返回结果的基础上进行其他操作
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test13 {
    public static void main(String[] args) {
        //创建一个集合
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        sreamFilterTest(list);
    }

    public static void sreamFilterTest(List<String> lists){ //要明确这list的泛型类型，否则jvm不能根据上下文确定参数类型
        lists.stream().filter((s -> s.startsWith("a"))).forEach(System.out::println);//将开头是a的过滤出来

        //等价于以上操作
        Predicate<String> predicate = (s) -> s.startsWith("a");//将开头是a的过滤出来
        lists.stream().filter(predicate).forEach(System.out::println);

        //连续过滤
        Predicate<String> predicate1 = (s -> s.endsWith("1"));//将开头是a，并且结尾是1的过滤出来
        lists.stream().filter(predicate).filter(predicate1).forEach(System.out::println);
    }
}
