package com.corejava.strings;

public class Strings {
    public static void main(String[] args){
        String st1=new String("naga");
        String st2=new String("sai");
        String st3="naga";
        String st4="sai";
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st1==st3); //False because == checks address not the data , st1 value stored at heap memory whereas st3 data is stored at String pool
        System.out.println(st1.equals(st3));

        // using Strings we can store special symbols , numeric values
        String st="123";
        System.out.println(st);
        String mailId="nagaprog@gmail.com";
        System.out.println(mailId);
        //concatination
        System.out.println(st1+st2+mailId);

        
    }
}
