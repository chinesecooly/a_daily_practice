package com.chinesecooly;

/**
 * @author chinesecooly
 * 那么 i=i>a?i:a;对吗
 */
public class day01 {
    public static void main(String[] args) {
        float a =1f;
        int i=2;
    }
}
/**
 *赋值语句右结合性，所以先计算三目运算表达式，表达式 求值类型不一致时进行自动类型转换，
 *转换后三目表达式的值为float类型的2，再回到赋值表达式，需要一个int型，无法进行自动类型转换。
 */