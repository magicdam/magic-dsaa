package com.magicdam.magicdsaa;

import java.util.List;

/**
 * 工具类
 */
public class Util {

    /**
     * 全是静态方法，无需实例化
     */
    private Util(){}

    //交换数组中的元素
    public static void swap(byte[] array,int a,int b){
        byte t=array[a];
        array[a]=array[b];
        array[b]=t;
    }

    public static void swap(char[] array,int a,int b){
        char t=array[a];
        array[a]=array[b];
        array[b]=t;
    }

    public static void swap(short[] array,int a,int b){
        short t=array[a];
        array[a]=array[b];
        array[b]=t;
    }

    public static void swap(int[] array,int a,int b){
        int t=array[a];
        array[a]=array[b];
        array[b]=t;
    }

    public static void swap(long[] array,int a,int b){
        long t=array[a];
        array[a]=array[b];
        array[b]=t;
    }

    public static void swap(Comparable[] array,int a,int b){
        Comparable t=array[a];
        array[a]=array[b];
        array[b]=t;
    }

    public static void swap(List list, int a, int b){
        Object t=list.get(a);
        list.set(a,list.get(b));
        list.set(b,t);
    }

    //判断是否是奇数
    public static boolean isOdd(byte number){
        return (number&0x01)==1;
    }

    public static boolean isOdd(char number){
        return (number&0x0001)==1;
    }

    public static boolean isOdd(short number){
        return (number&0x0001)==1;
    }

    public static boolean isOdd(int number){
        return (number&0x00000001)==1;
    }

    public static boolean isOdd(long number){
        return (number&0x0000000000000001)==1;
    }

    public static boolean isOdd(Number number){
        return (number.intValue()&0x0000000000000001)==1;
    }
}
