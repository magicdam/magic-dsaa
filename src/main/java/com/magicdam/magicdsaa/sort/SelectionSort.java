package com.magicdam.magicdsaa.sort;

import java.util.List;

/**
 * 选择排序
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 */
class SelectionSort extends Sort{
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
    public void sort(Comparable[] array) {
        int j,maxNumberIndex;
        Comparable t,numMax;
        for(int i=0;i<array.length-1;i++){
            maxNumberIndex=i;
            numMax= array[maxNumberIndex];
            for(j=i+1;j<array.length;j++){
                if(array[j].compareTo(numMax)<0){
                    maxNumberIndex=j;
                    numMax=array[j];
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
    public void sort(List<? extends Comparable> list) {
        List<Comparable> listC=(List<Comparable>)list;
        int j,maxNumberIndex,size=listC.size();
        Comparable t;
        Comparable numMax;
        for(int i=0;i<size-1;i++){
            maxNumberIndex=i;
            numMax= listC.get(maxNumberIndex);
            for(j=i+1;j<size;j++){
                if(listC.get(j).compareTo(numMax)<0){
                    maxNumberIndex=j;
                    numMax=listC.get(j);
                }
            }
            if(maxNumberIndex!=i){
                t=listC.get(maxNumberIndex);
                listC.set(maxNumberIndex,listC.get(i));
                listC.set(i,t);
            }
        }
    }

}
