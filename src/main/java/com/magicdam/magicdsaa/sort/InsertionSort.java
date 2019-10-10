package com.magicdam.magicdsaa.sort;

import java.util.List;

/**
 * 插入排序
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
class InsertionSort extends Sort{
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
    public void sort(Comparable[] array) {
        int j;
        Comparable t,num;
        for(int i=1;i<array.length;i++){
            num=array[i];
            for(j=i;j>0 && num.compareTo(array[j-1])<0;j--){
                t=array[j];
                array[j]=array[j-1];
                array[j-1]=t;
            }
        }
    }

    @Override
    public void sort(List<? extends Comparable> list) {
        List<Comparable> listC=(List<Comparable>)list;
        int j,size=listC.size();
        Comparable t,num;
        for(int i=1;i<size;i++){
            num = listC.get(i);
            for(j=i;j>0 && num.compareTo(listC.get(j-1))<0;j--){
                t=listC.get(j);
                listC.set(j,listC.get(j-1));
                listC.set(j-1,t);
            }
        }
    }

}
