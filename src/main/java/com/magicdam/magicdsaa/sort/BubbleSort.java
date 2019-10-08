package com.magicdam.magicdsaa.sort;

import java.util.List;

public class BubbleSort extends Sort {

    BubbleSort(){}

    @Override
    public void sort(byte[] array) {
        int j=0;
        byte t=0;
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
        int j=0;
        char t=0;
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
        int j=0;
        short t=0;
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
        int j=0,t=0;
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
        int j=0;
        long t=0;
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
        int j=0;
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
        int j=0,size=list.size();
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

//    public static void main(String[] args) {
//    }
}
