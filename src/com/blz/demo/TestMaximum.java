package com.blz.demo;

import java.io.PrintStream;

public class TestMaximum <T extends Comparable<T>>{
    private T x,y,z;
//constructor
    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
//checking max of three Generic data
    public static<T extends Comparable<T>> T testMaximum(T...values){
        T max=values[0];
        for(int i =1;i<values.length;i++){
            if(values[i].compareTo(max)>0){
                max=values[i];
            }
        }
        System.out.println("the maximum of");
        for(int i =0;i<values.length;i++){
            System.out.print(values[i]+"\t");
        }
        printMax(max);
        return max;
    }
    public static <T>void printMax(T max){
        System.out.println("is\t"+max);
    }
}
