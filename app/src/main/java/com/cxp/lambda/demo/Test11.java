package com.cxp.lambda.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 文 件 名: Test11
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 17:06
 * 描    述: 排序(sorted):结合Comparator,该操作返回一个排序过后的流的视图，原始流的顺序不会改变。通过Comparator来指定排序规则，默认是自然排序
 *
 * Lambda为java8带来了闭包，支持对集合对象的stream进行函数式操作， stream api被集成进了collection api  ，允许对集合对象进行批量操作。
 * Stream表示数据流，它没有数据结构，本身也不存储元素，其操作也不会改变源Stream，而是生成新Stream.作为一种操作数据的接口，它提供了过滤、排序、映射、规约等多种操作方法，
 * 这些方法按照返回类型被分为两类：凡是返回Stream类型的方法，称之为中间方法（中间操作），其余的都是完结方法（完结操作）。完结方法返回一个某种类型的值，而中间方法则返回新的Stream。
 * 中间方法的调用通常是链式的，该过程会形成一个管道，当完结方法被调用时会导致立即从管道中消费值，这里我们要记住：Stream的操作尽可能以“延迟”的方式运行，也就是我们常说的“懒操作”，
 * 这样有助于减少资源占用，提高性能。对于所有的中间操作（除sorted外）都是运行在延迟模式下。
 * Stream不但提供了强大的数据操作能力，更重要的是Stream既支持串行也支持并行，并行使得Stream在多核处理器上有着更好的性能。
 * Stream的使用过程有着固定的模式：
 * 1.创建Stream
 * 2.通过中间操作，对原始Stream进行“变化”并生成新的Stream
 * 3.使用完结操作，生成最终结果
 *
 */
public class Test11 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        streamSortedTest(list);
    }
    private static void streamSortedTest(List<String> list){
        //默认排序
        list.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
        System.out.println("- - - - - - - - -");
        //自定义排序
        list.stream().sorted(((s, t1) -> t1.compareTo(s))).filter(s -> s.startsWith("a")).forEach(System.out::println);
    }

}
