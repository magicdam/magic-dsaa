package com.magicdam.magicdsaa.sort;

import java.util.List;

/**
 * 冒泡排序
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class BubbleSort extends Sort {

    BubbleSort(){}

    @Override
    public void sort(byte[] array) {
        int j;
        byte t;
        for(int i=0;i<array.length;i++){
            for(j=array.length-1;j>=i+1;j--){
                if(array[j]<array[j-1]){
                    t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            }
        }
    }

    @Override
    public void sort(char[] array) {
        int j;
        char t;
        for(int i=0;i<array.length;i++){
            for(j=array.length-1;j>=i+1;j--){
                if(array[j]<array[j-1]){
                    t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            }
        }
    }

    @Override
    public void sort(short[] array) {
        int j;
        short t;
        for(int i=0;i<array.length;i++){
            for(j=array.length-1;j>=i+1;j--){
                if(array[j]<array[j-1]){
                    t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            }
        }
    }

    @Override
    public void sort(int[] array){
        int j,t;
        for(int i=0;i<array.length;i++){
            for(j=array.length-1;j>=i+1;j--){
                if(array[j]<array[j-1]){
                    t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            }
        }
    }

    @Override
    public void sort(long[] array){
        int j;
        long t;
        for(int i=0;i<array.length;i++){
            for(j=array.length-1;j>=i+1;j--){
                if(array[j]<array[j-1]){
                    t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            }
        }
    }

    @Override
    public void sort(Object[] array) {
        int j;
        Object t;
        Comparable num1,num2;
        for(int i=0;i<array.length;i++){
            for(j=array.length-1;j>=i+1;j--){
                num1= (Comparable) array[j];
                num2= (Comparable) array[j-1];
                if(num1.compareTo(num2)<0){
                    t = array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            }
        }
    }

    @Override
    public void sort(List list) {
        int j,size=list.size();
        Object t;
        Comparable num1,num2;
        for(int i=0;i<size;i++){
            for(j=size-1;j>=i+1;j--){
                num1= (Comparable) list.get(j);
                num2= (Comparable) list.get(j-1);
                if(num1.compareTo(num2)<0){
                    t = list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,t);
                }
            }
        }
    }
}
