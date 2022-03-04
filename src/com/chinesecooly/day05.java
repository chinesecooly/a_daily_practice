package com.chinesecooly;

/**
 * @author chinesecooly
 */
public class day05 {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3=new String("hello");
        String str4="hel"+"lo";
        String str5="hel";
        String str6="lo";
        String str7=new String("lo");
        final String str8="lo";
        final String str9=new String("lo");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str1.intern()==str1);
        System.out.println(str3.intern()==str3);
        System.out.println(str1.intern()==str2);
        System.out.println(str1.intern()==str2.intern());
        System.out.println(str1.intern()==str3.intern());

        System.out.println(str1==str5+str6);
        System.out.println(str1==str5+"lo");
        System.out.println(str1=="hel"+"lo");
        System.out.println(str1==str5+str8);
        System.out.println(str1=="hel"+str8);
        System.out.println(str1==str5+str9);
        System.out.println(str1=="hel"+str9);
    }
}
/**
 * true
 * false
 * true
 * true
 * false
 * true
 * true
 * true
 * false
 * false
 * true
 * false
 * true
 * false
 * false
 */
