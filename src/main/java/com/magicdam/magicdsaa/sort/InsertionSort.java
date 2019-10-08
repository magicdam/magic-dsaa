package com.magicdam.magicdsaa.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort extends Sort{
    InsertionSort(){}

    @Override
    public void sort(byte[] array) {
        int j=0;
        byte t=0,num=0;
        for(int i=1;i<array.length;i++){
            num=array[i];
            for(j=i;j>0 && num<array[j-1];j--){
                t=array[j];
                array[j]=array[j-1];
                array[j-1]=t;
            }
        }
    }

    @Override
    public void sort(char[] array) {
        int j=0;
        char t=0,num=0;
        for(int i=1;i<array.length;i++){
            num=array[i];
            for(j=i;j>0 && num<array[j-1];j--){
                t=array[j];
                array[j]=array[j-1];
                array[j-1]=t;
            }
        }
    }

    @Override
    public void sort(short[] array) {
        int j=0;
        short t=0,num=0;
        for(int i=1;i<array.length;i++){
            num=array[i];
            for(j=i;j>0 && num<array[j-1];j--){
                t=array[j];
                array[j]=array[j-1];
                array[j-1]=t;
            }
        }
    }

    @Override
    public void sort(int[] array) {
        int j=0;
        int t=0,num=0;
        for(int i=1;i<array.length;i++){
            num=array[i];
            for(j=i;j>0 && num<array[j-1];j--){
                t=array[j];
                array[j]=array[j-1];
                array[j-1]=t;
            }
        }
    }

    @Override
    public void sort(long[] array) {
        int j=0;
        long t=0,num=0;
        for(int i=1;i<array.length;i++){
            num=array[i];
            for(j=i;j>0 && num<array[j-1];j--){
                t=array[j];
                array[j]=array[j-1];
                array[j-1]=t;
            }
        }
    }

    @Override
    public void sort(Object[] array) {
        int j=0;
        Object t=null;
        Comparable num=null;
        for(int i=1;i<array.length;i++){
            num= (Comparable) array[i];
            for(j=i;j>0 && num.compareTo(array[j-1])<0;j--){
                t=array[j];
                array[j]=array[j-1];
                array[j-1]=t;
            }
        }
    }

    @Override
    public void sort(List list) {
        int j=0,size=list.size();
        Object t=null;
        Comparable num=null;
        for(int i=1;i<size;i++){
            num= (Comparable) list.get(i);
            for(j=i;j>0 && num.compareTo(list.get(j-1))<0;j--){
                t=list.get(j);
                list.set(j,list.get(j-1));
                list.set(j-1,t);
            }
        }
    }

}
