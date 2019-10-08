package com.magicdam.magicdsaa.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort extends Sort{
    @Override
    public void sort(byte[] array) {
        int j=0,maxNumberIndex=0;
        byte t=0;
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
        int j=0,maxNumberIndex=0;
        char t=0;
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
        int j=0,maxNumberIndex=0;
        short t=0;
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
        int j=0,maxNumberIndex=0;
        int t=0;
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
        int j=0,maxNumberIndex=0;
        long t=0;
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
        int j=0,maxNumberIndex=0;
        Object t=null;
        Comparable num=null,numMax=null;
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
        int j=0,maxNumberIndex=0,size=list.size();
        Object t=null;
        Comparable num=null,numMax=null;
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

//    public static void main(String[] args) {
////        byte[] bytes=new byte[]{6,4,3,3,5};
////        Sort sort=Sort.getSelectionSort();
////        sort.sort(bytes);
////        System.out.println(Arrays.toString(bytes));
//
////        Byte[] bytes=new Byte[]{6,4,3,3,5};
////        Sort sort=Sort.getSelectionSort();
////        sort.sort(bytes);
////        System.out.println(Arrays.toString(bytes));
//
//        List<Integer> byteList=new ArrayList();
//        byteList.add(6);
//        byteList.add(4);
//        byteList.add(3);
//        byteList.add(3);
//        byteList.add(5);
//        Sort sort=Sort.getSelectionSort();
//        sort.sort(byteList);
//        System.out.println(byteList);
//    }
}
