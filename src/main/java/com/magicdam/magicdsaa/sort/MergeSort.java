package com.magicdam.magicdsaa.sort;

import java.util.Arrays;
import java.util.List;

/**
 * 归并排序
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(n)
 * 稳定性：稳定
 */
class MergeSort extends Sort{
    @Override
    public void sort(byte[] array) {
        if(array.length==0)
            return;
        partition(array,0,array.length-1);
    }

    private static void merge(byte[] array,int left,int mid,int right) {
        int i,j,k;
        byte[] bytesLeft = Arrays.copyOfRange(array,left,mid+1);
        byte[] bytesRight = Arrays.copyOfRange(array,mid+1,right+1);
        i=0;j=0;k=left;
        while (i<bytesLeft.length && j<bytesRight.length){
            if(bytesLeft[i]<=bytesRight[j]){
                array[k]=bytesLeft[i];
                i++;
            }
            else{
                array[k]=bytesRight[j];
                j++;
            }
            k++;
        }
        while (i<bytesLeft.length){
            array[k]=bytesLeft[i];
            i++;
            k++;
        }
        while (j<bytesRight.length){
            array[k]=bytesRight[j];
            j++;
            k++;
        }
    }

    private static void partition(byte[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        partition(array,left,mid);
        partition(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(char[] array) {
        if(array.length==0)
            return;
        partition(array,0,array.length-1);
    }

    private static void merge(char[] array,int left,int mid,int right) {
        int i,j,k;
        char[] bytesLeft = Arrays.copyOfRange(array,left,mid+1);
        char[] bytesRight = Arrays.copyOfRange(array,mid+1,right+1);
        i=0;j=0;k=left;
        while (i<bytesLeft.length && j<bytesRight.length){
            if(bytesLeft[i]<=bytesRight[j]){
                array[k]=bytesLeft[i];
                i++;
            }
            else{
                array[k]=bytesRight[j];
                j++;
            }
            k++;
        }
        while (i<bytesLeft.length){
            array[k]=bytesLeft[i];
            i++;
            k++;
        }
        while (j<bytesRight.length){
            array[k]=bytesRight[j];
            j++;
            k++;
        }
    }

    private static void partition(char[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        partition(array,left,mid);
        partition(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(short[] array) {
        if(array.length==0)
            return;
        partition(array,0,array.length-1);
    }

    private static void merge(short[] array,int left,int mid,int right) {
        int i,j,k;
        short[] bytesLeft = Arrays.copyOfRange(array,left,mid+1);
        short[] bytesRight = Arrays.copyOfRange(array,mid+1,right+1);
        i=0;j=0;k=left;
        while (i<bytesLeft.length && j<bytesRight.length){
            if(bytesLeft[i]<=bytesRight[j]){
                array[k]=bytesLeft[i];
                i++;
            }
            else{
                array[k]=bytesRight[j];
                j++;
            }
            k++;
        }
        while (i<bytesLeft.length){
            array[k]=bytesLeft[i];
            i++;
            k++;
        }
        while (j<bytesRight.length){
            array[k]=bytesRight[j];
            j++;
            k++;
        }
    }

    private static void partition(short[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        partition(array,left,mid);
        partition(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(int[] array) {
        if(array.length==0)
            return;
        partition(array,0,array.length-1);
    }

    private static void merge(int[] array,int left,int mid,int right) {
        int i,j,k;
        int[] bytesLeft = Arrays.copyOfRange(array,left,mid+1);
        int[] bytesRight = Arrays.copyOfRange(array,mid+1,right+1);
        i=0;j=0;k=left;
        while (i<bytesLeft.length && j<bytesRight.length){
            if(bytesLeft[i]<=bytesRight[j]){
                array[k]=bytesLeft[i];
                i++;
            }
            else{
                array[k]=bytesRight[j];
                j++;
            }
            k++;
        }
        while (i<bytesLeft.length){
            array[k]=bytesLeft[i];
            i++;
            k++;
        }
        while (j<bytesRight.length){
            array[k]=bytesRight[j];
            j++;
            k++;
        }
    }

    private static void partition(int[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        partition(array,left,mid);
        partition(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(long[] array) {
        if(array.length==0)
            return;
        partition(array,0,array.length-1);
    }

    private static void merge(long[] array,int left,int mid,int right) {
        int i,j,k;
        long[] bytesLeft = Arrays.copyOfRange(array,left,mid+1);
        long[] bytesRight = Arrays.copyOfRange(array,mid+1,right+1);
        i=0;j=0;k=left;
        while (i<bytesLeft.length && j<bytesRight.length){
            if(bytesLeft[i]<=bytesRight[j]){
                array[k]=bytesLeft[i];
                i++;
            }
            else{
                array[k]=bytesRight[j];
                j++;
            }
            k++;
        }
        while (i<bytesLeft.length){
            array[k]=bytesLeft[i];
            i++;
            k++;
        }
        while (j<bytesRight.length){
            array[k]=bytesRight[j];
            j++;
            k++;
        }
    }

    private static void partition(long[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        partition(array,left,mid);
        partition(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(Comparable[] array) {
        if(array.length==0)
            return;
        partition(array,0,array.length-1);
    }

    private static void merge(Comparable[] array,int left,int mid,int right) {
        int i,j,k;
        Comparable[] bytesLeft = Arrays.copyOfRange(array,left,mid+1);
        Comparable[] bytesRight = Arrays.copyOfRange(array,mid+1,right+1);
        i=0;j=0;k=left;
        while (i<bytesLeft.length && j<bytesRight.length){
            if(bytesLeft[i].compareTo(bytesRight[j])<=0){
                array[k]=bytesLeft[i];
                i++;
            }
            else{
                array[k]=bytesRight[j];
                j++;
            }
            k++;
        }
        while (i<bytesLeft.length){
            array[k]=bytesLeft[i];
            i++;
            k++;
        }
        while (j<bytesRight.length){
            array[k]=bytesRight[j];
            j++;
            k++;
        }
    }

    private static void partition(Comparable[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        partition(array,left,mid);
        partition(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(List<? extends Comparable> list) {
        if(list.size()==0)
            return;
        List<Comparable> listC=(List<Comparable>)list;
        partition(listC,0,list.size()-1);
    }

    private static void merge(List<Comparable> list,int left,int mid,int right) {
        int i,j,k;
        List<Comparable> bytesLeft=list.subList(left,mid+1);
        List<Comparable> bytesRight=list.subList(mid+1,right+1);
        i=0;j=0;k=left;
        while (i<bytesLeft.size() && j<bytesRight.size()){
            if(bytesLeft.get(i).compareTo(bytesRight.get(j))<=0){
                list.set(k,bytesLeft.get(i));
                i++;
            }
            else{
                list.set(k,bytesRight.get(j));
                j++;
            }
            k++;
        }
        while (i<bytesLeft.size()){
            list.set(k,bytesLeft.get(i));
            i++;
            k++;
        }
        while (j<bytesRight.size()){
            list.set(k,bytesRight.get(j));
            j++;
            k++;
        }
    }

    private static void partition(List<Comparable> list,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        partition(list,left,mid);
        partition(list,mid+1,right);
        merge(list,left,mid,right);
    }
}
