package com.chinesecooly;

/**
 * @author chinesecooly
 * 那下面语句的输出结果
 *         System.out.println(c==d);//true
 *         System.out.println(e==f);//false
 *         System.out.println(e==f+0);//true
 *         System.out.println(c==(a+b));//true
 *         System.out.println(c.equals(a+b));//true
 *         System.out.println(g==(a+b));//true
 *         System.out.println(g.equals(a+b));//false
 */
public class day04 {
    public static void main(String[] args) {
        Integer a=1;
        Integer b=2;
        Integer c=3;
        Integer d=3;
        Integer e=128;
        Integer f=128;
        Long g=3L;
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(e==f+0);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
    }
}

/**
 * true,false,true,true,true,true,false
 */
