package com.cxp.lambda.demo;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 文 件 名: Test19
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 19:01
 * 描    述: 懒操作
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test19 {
    public static void main(String[] args) {
        streamCreateTest();
    }
    public static void streamCreateTest() {
        Stream<Long> stream = Stream.generate(new NatureSeq());
        System.out.println("元素个数："+stream.map((param) -> {
            return param;
        }).limit(1000).count());

    }

    //递增序列
    static  class NatureSeq implements Supplier<Long> {
        long value = 0;

        @Override
        public Long get() {
            value++;
            return value;
        }
    }
}
