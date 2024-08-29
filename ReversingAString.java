package com.corejava.strings;

public class ReversingAString {

    public static void main(String[] args){
        String st="hi";
        StringBuilder string=new StringBuilder(st);
        System.out.println(string.reverse().toString());
    }
}
