package com.corejava.strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args){
        String st1="na gas ai ";
        String st2="naga";
        String st3="NAGA";
        String st4="naGa";
        System.out.println(st1.equals(st2));
        System.out.println(st1.equalsIgnoreCase(st2));
        System.out.println(st1.contains("n"));
        System.out.println(st2.contains("n"));
        System.out.println(st1.startsWith("N"));
        System.out.println(st3.startsWith("NG"));
        System.out.println(st3.endsWith("GA"));
        System.out.println(st1.length());
        System.out.println(st1.trim());
        System.out.println(st1.toUpperCase());
        System.out.println(st3.toLowerCase());
        System.out.println(st1.toCharArray());
        System.out.println(st1.length());
        System.out.println(st1.trim());
        System.out.println(st1.indexOf('i'));
        System.out.println(st1.substring(2,6));
        System.out.println(Arrays.toString(st1.split(" ")));
        System.out.println(st1.charAt(3));

    }
}
