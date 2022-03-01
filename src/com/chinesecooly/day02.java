package com.chinesecooly;

/**
 * @author chinesecooly
 * 请问i的值是多少，并说说你的理解
 */
public class day02 {
    public static void main(String[] args) {
        int i=1;
        i=i++;
    }
}
/**
 * 结果为1，inc指令将局部变量表中的a变成了2，但又进行了一次store命令，将操作数栈中原来a的值1存到了局部变量表
 */