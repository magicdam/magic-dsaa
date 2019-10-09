package com.magicdam.magicdsaa.sort;

import java.util.List;

/**
 * 选择排序
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 */
public class SelectionSort extends Sort{
    @Override
    public void sort(byte[] array) {
        int j,maxNumberIndex;
        byte t;
        for(int i=0;i<array.length-1;i++){
            maxNumberIndex=i;
            for(j=i+1;j<array.length;j++){
                if(array[j]<array[maxNumberIndex]){
                    maxNumberIndex=j;
                }
            }
            if(maxNumberIndex!=i){
                t=array[maxNumberIndex];
                array[maxNumberIndex]=array[i];
                array[i]=t;
            }
        }
    }

    @Override
    public void sort(char[] array) {
        int j,maxNumberIndex;
        char t;
        for(int i=0;i<array.length-1;i++){
            maxNumberIndex=i;
            for(j=i+1;j<array.length;j++){
                if(array[j]<array[maxNumberIndex]){
                    maxNumberIndex=j;
                }
            }
            if(maxNumberIndex!=i){
                t=array[maxNumberIndex];
                array[maxNumberIndex]=array[i];
                array[i]=t;
            }
        }
    }

    @Override
    public void sort(short[] array) {
        int j,maxNumberIndex;
        short t;
        for(int i=0;i<array.length-1;i++){
            maxNumberIndex=i;
            for(j=i+1;j<array.length;j++){
                if(array[j]<array[maxNumberIndex]){
                    maxNumberIndex=j;
                }
            }
            if(maxNumberIndex!=i){
                t=array[maxNumberIndex];
                array[maxNumberIndex]=array[i];
                array[i]=t;
            }
        }
    }

    @Override
    public void sort(int[] array) {
        int j,maxNumberIndex;
        int t;
        for(int i=0;i<array.length-1;i++){
            maxNumberIndex=i;
            for(j=i+1;j<array.length;j++){
                if(array[j]<array[maxNumberIndex]){
                    maxNumberIndex=j;
                }
            }
            if(maxNumberIndex!=i){
                t=array[maxNumberIndex];
                array[maxNumberIndex]=array[i];
                array[i]=t;
            }
        }
    }

    @Override
    public void sort(long[] array) {
        int j,maxNumberIndex;
        long t;
        for(int i=0;i<array.length-1;i++){
            maxNumberIndex=i;
            for(j=i+1;j<array.length;j++){
                if(array[j]<array[maxNumberIndex]){
                    maxNumberIndex=j;
                }
            }
            if(maxNumberIndex!=i){
                t=array[maxNumberIndex];
                array[maxNumberIndex]=array[i];
                array[i]=t;
            }
        }
    }

    @Override
    public void sort(Object[] array) {
        int j,maxNumberIndex;
        Object t;
        Comparable num,numMax;
        for(int i=0;i<array.length-1;i++){
            maxNumberIndex=i;
            numMax= (Comparable) array[maxNumberIndex];
            for(j=i+1;j<array.length;j++){
                num= (Comparable) array[j];
                if(num.compareTo(numMax)<0){
                    maxNumberIndex=j;
                    numMax=num;
                }
            }
            if(maxNumberIndex!=i){
                t=array[maxNumberIndex];
                array[maxNumberIndex]=array[i];
                array[i]=t;
            }
        }
    }

    @Override
    public void sort(List list) {
        int j,maxNumberIndex,size=list.size();
        Object t;
        Comparable num,numMax;
        for(int i=0;i<size-1;i++){
            maxNumberIndex=i;
            numMax= (Comparable) list.get(maxNumberIndex);
            for(j=i+1;j<size;j++){
                num= (Comparable) list.get(j);
                if(num.compareTo(numMax)<0){
                    maxNumberIndex=j;
                    numMax=num;
                }
            }
            if(maxNumberIndex!=i){
                t=list.get(maxNumberIndex);
                list.set(maxNumberIndex,list.get(i));
                list.set(i,t);
            }
        }
    }

}
