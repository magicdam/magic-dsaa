package com.magicdam.magicdsaa.sort;

import java.util.List;

/**
 * 堆排序
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 */
public class HeapSort extends Sort{
    @Override
    public void sort(byte[] array) {
        int i,j,k,size=array.length;
        byte t;
        boolean over;
        for(i=1;i<size;i++){
            k=i;
            while ((j=(k+1)/2-1)>=0) {
                if (array[k] > array[j]) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                }
                else{
                    break;
                }
                k=j;
            }
        }
        for(i=size;i>0;i--){
            t=array[0];
            array[0]=array[i-1];
            array[i-1]=t;
            k=0;
            while ((j=k*2+1)<i-1) {
                over = ((j+1)>=i-1);
                if (array[j] > array[k] && (over || array[j+1]<=array[j])) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                    k=j;
                }
                else if(!over && array[j+1]>array[k]){
                    t = array[k];
                    array[k] = array[j+1];
                    array[j+1] = t;
                    k=j+1;
                }
                else{
                    break;
                }
            }
        }
    }

    @Override
    public void sort(char[] array) {
        int i,j,k,size=array.length;
        char t;
        boolean over;
        for(i=1;i<size;i++){
            k=i;
            while ((j=(k+1)/2-1)>=0) {
                if (array[k] > array[j]) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                }
                else{
                    break;
                }
                k=j;
            }
        }
        for(i=size;i>0;i--){
            t=array[0];
            array[0]=array[i-1];
            array[i-1]=t;
            k=0;
            while ((j=k*2+1)<i-1) {
                over = ((j+1)>=i-1);
                if (array[j] > array[k] && (over || array[j+1]<=array[j])) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                    k=j;
                }
                else if(!over && array[j+1]>array[k]){
                    t = array[k];
                    array[k] = array[j+1];
                    array[j+1] = t;
                    k=j+1;
                }
                else{
                    break;
                }
            }
        }
    }

    @Override
    public void sort(short[] array) {
        int i,j,k,size=array.length;
        short t=0;
        boolean over;
        for(i=1;i<size;i++){
            k=i;
            while ((j=(k+1)/2-1)>=0) {
                if (array[k] > array[j]) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                }
                else{
                    break;
                }
                k=j;
            }
        }
        for(i=size;i>0;i--){
            t=array[0];
            array[0]=array[i-1];
            array[i-1]=t;
            k=0;
            while ((j=k*2+1)<i-1) {
                over = ((j+1)>=i-1);
                if (array[j] > array[k] && (over || array[j+1]<=array[j])) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                    k=j;
                }
                else if(!over && array[j+1]>array[k]){
                    t = array[k];
                    array[k] = array[j+1];
                    array[j+1] = t;
                    k=j+1;
                }
                else{
                    break;
                }
            }
        }
    }

    @Override
    public void sort(int[] array) {
        int i,j,k,size=array.length;
        int t=0;
        boolean over;
        for(i=1;i<size;i++){
            k=i;
            while ((j=(k+1)/2-1)>=0) {
                if (array[k] > array[j]) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                }
                else{
                    break;
                }
                k=j;
            }
        }
        for(i=size;i>0;i--){
            t=array[0];
            array[0]=array[i-1];
            array[i-1]=t;
            k=0;
            while ((j=k*2+1)<i-1) {
                over = ((j+1)>=i-1);
                if (array[j] > array[k] && (over || array[j+1]<=array[j])) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                    k=j;
                }
                else if(!over && array[j+1]>array[k]){
                    t = array[k];
                    array[k] = array[j+1];
                    array[j+1] = t;
                    k=j+1;
                }
                else{
                    break;
                }
            }
        }
    }

    @Override
    public void sort(long[] array) {
        int i,j,k,size=array.length;
        long t=0;
        boolean over;
        for(i=1;i<size;i++){
            k=i;
            while ((j=(k+1)/2-1)>=0) {
                if (array[k] > array[j]) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                }
                else{
                    break;
                }
                k=j;
            }
        }
        for(i=size;i>0;i--){
            t=array[0];
            array[0]=array[i-1];
            array[i-1]=t;
            k=0;
            while ((j=k*2+1)<i-1) {
                over = ((j+1)>=i-1);
                if (array[j] > array[k] && (over || array[j+1]<=array[j])) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                    k=j;
                }
                else if(!over && array[j+1]>array[k]){
                    t = array[k];
                    array[k] = array[j+1];
                    array[j+1] = t;
                    k=j+1;
                }
                else{
                    break;
                }
            }
        }
    }

    @Override
    public void sort(Object[] array) {
        int i,j,k,size=array.length;
        Object t=null;
        Comparable num1=null,num2=null,num3=num1;
        boolean over;
        for(i=1;i<size;i++){
            k=i;
            while ((j=(k+1)/2-1)>=0) {
                num1= (Comparable) array[k];
                num2= (Comparable) array[j];
                if (num1.compareTo(num2)>0) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                }
                else{
                    break;
                }
                k=j;
            }
        }
        for(i=size;i>0;i--){
            t=array[0];
            array[0]=array[i-1];
            array[i-1]=t;
            k=0;
            while ((j=k*2+1)<i-1) {
                over = ((j+1)>=i-1);
                num2= (Comparable) array[j];
                num1= (Comparable) array[k];
                if(!over){
                    num3= (Comparable) array[j+1];
                }
                if (num2.compareTo(num1)>0 && (over || num3.compareTo(num2)<=0)) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                    k=j;
                }
                else if(!over && num3.compareTo(num1)>0){
                    t = array[k];
                    array[k] = array[j+1];
                    array[j+1] = t;
                    k=j+1;
                }
                else{
                    break;
                }
            }
        }
    }

    @Override
    public void sort(List list) {
        int i,j,k,size=list.size();
        Object t=null;
        Comparable num1=null,num2=null,num3=num1;
        boolean over;
        for(i=1;i<size;i++){
            k=i;
            while ((j=(k+1)/2-1)>=0) {
                num1= (Comparable) list.get(k);
                num2= (Comparable) list.get(j);
                if (num1.compareTo(num2)>0) {
                    t = list.get(k);
                    list.set(k,list.get(j));
                    list.set(j,t);
                }
                else{
                    break;
                }
                k=j;
            }
        }
        for(i=size;i>0;i--){
            t=list.get(0);
            list.set(0,list.get(i-1));
            list.set(i-1,t);
            k=0;
            while ((j=k*2+1)<i-1) {
                over = ((j+1)>=i-1);
                num2= (Comparable) list.get(j);
                num1= (Comparable) list.get(k);
                if(!over){
                    num3= (Comparable) list.get(j+1);
                }
                if (num2.compareTo(num1)>0 && (over || num3.compareTo(num2)<=0)) {
                    t = list.get(k);
                    list.set(k,list.get(j));
                    list.set(j,t);
                    k=j;
                }
                else if(!over && num3.compareTo(num1)>0){
                    t = list.get(k);
                    list.set(k,list.get(j+1));
                    list.set(j+1,t);
                    k=j+1;
                }
                else{
                    break;
                }
            }
        }
    }
}
