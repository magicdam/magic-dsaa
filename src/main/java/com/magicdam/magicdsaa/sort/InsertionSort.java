package com.magicdam.magicdsaa.sort;

import java.util.List;

/**
 * 插入排序
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class InsertionSort extends Sort{
    InsertionSort(){}

    @Override
    public void sort(byte[] array) {
        int j;
        byte t,num;
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
        int j;
        char t,num;
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
        int j;
        short t,num;
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
        int j;
        int t,num;
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
        int j;
        long t,num;
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
        int j;
        Object t;
        Comparable num;
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
        int j,size=list.size();
        Object t;
        Comparable num;
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
