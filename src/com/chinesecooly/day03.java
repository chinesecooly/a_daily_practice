package com.chinesecooly;

/**
 * @author chinesecooly
那么以下式子的对错？
a=a+b;
c=c+d;
ch1=ch1+ch2;
a+=b;
c+=d;
l=a+b;
i=a+b;

ch1=a;
ch1=i;
ch1=127;

a=ch1;
a=ch2;
a=i;
a='a';

i=b;
i='a';
i=ch1;
 */
public class day03 {
    public static void main(String[] args) {
        byte a=127;
        byte b=127;
        byte c=1;
        byte d=2;
        char ch1= 128;
        char ch2=97;
        int i=0;
        long l;
    }
}
/**
 * 错
 * 错
 * 错
 * 对
 * 对
 * 对
 * 对
 * 错
 * 错
 * 对
 * 错
 * 错
 * 错
 * 对
 * 对
 * 对
 * 对
 */