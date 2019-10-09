package com.magicdam.magicdsaa.sort;

import java.util.Arrays;
import java.util.List;

/**
 * 归并排序
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(n)
 * 稳定性：稳定
 */
public class MergeSort extends Sort{
    @Override
    public void sort(byte[] array) {
        if(array.length==0)
            return;
        divideAndConquer(array,0,array.length-1);
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

    private static void divideAndConquer(byte[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        divideAndConquer(array,left,mid);
        divideAndConquer(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(char[] array) {
        if(array.length==0)
            return;
        divideAndConquer(array,0,array.length-1);
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

    private static void divideAndConquer(char[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        divideAndConquer(array,left,mid);
        divideAndConquer(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(short[] array) {
        if(array.length==0)
            return;
        divideAndConquer(array,0,array.length-1);
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

    private static void divideAndConquer(short[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        divideAndConquer(array,left,mid);
        divideAndConquer(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(int[] array) {
        if(array.length==0)
            return;
        divideAndConquer(array,0,array.length-1);
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

    private static void divideAndConquer(int[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        divideAndConquer(array,left,mid);
        divideAndConquer(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(long[] array) {
        if(array.length==0)
            return;
        divideAndConquer(array,0,array.length-1);
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

    private static void divideAndConquer(long[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        divideAndConquer(array,left,mid);
        divideAndConquer(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(Object[] array) {
        if(array.length==0)
            return;
        divideAndConquer(array,0,array.length-1);
    }

    private static void merge(Object[] array,int left,int mid,int right) {
        int i,j,k;
        Comparable num1,num2;
        Object[] bytesLeft = Arrays.copyOfRange(array,left,mid+1);
        Object[] bytesRight = Arrays.copyOfRange(array,mid+1,right+1);
        i=0;j=0;k=left;
        while (i<bytesLeft.length && j<bytesRight.length){
            num1= (Comparable) bytesLeft[i];
            num2= (Comparable) bytesRight[j];
            if(num1.compareTo(num2)<=0){
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

    private static void divideAndConquer(Object[] array,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        divideAndConquer(array,left,mid);
        divideAndConquer(array,mid+1,right);
        merge(array,left,mid,right);
    }

    @Override
    public void sort(List list) {
        if(list.size()==0)
            return;
        divideAndConquer(list,0,list.size()-1);
    }

    private static void merge(List list,int left,int mid,int right) {
        int i,j,k;
        Comparable num1,num2;
        List bytesLeft=list.subList(left,mid+1);
        List bytesRight=list.subList(mid+1,right+1);
        i=0;j=0;k=left;
        while (i<bytesLeft.size() && j<bytesRight.size()){
            num1= (Comparable) bytesLeft.get(i);
            num2= (Comparable) bytesRight.get(j);
            if(num1.compareTo(num2)<=0){
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

    private static void divideAndConquer(List list,int left,int right){
        if(left==right)
            return;
        int mid=left+(right-left)/2;
        divideAndConquer(list,left,mid);
        divideAndConquer(list,mid+1,right);
        merge(list,left,mid,right);
    }
}
