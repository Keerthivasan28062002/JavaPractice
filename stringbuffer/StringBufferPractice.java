package com.stringbuffer;

public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Welcome");
        sb.append(" Buddy");
        System.out.println(sb);
        sb.insert(7," to Java");
        System.out.println(sb);
        sb.replace(0,7,"Hello");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
