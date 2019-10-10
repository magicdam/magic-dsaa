package com.magicdam.magicdsaa.sort;

import java.util.List;

/**
 * 堆排序
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 */
class HeapSort extends Sort{
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
    public void sort(Comparable[] array) {
        int i,j,k,size=array.length;
        Comparable t;
        boolean over;
        for(i=1;i<size;i++){
            k=i;
            while ((j=(k+1)/2-1)>=0) {
                if (array[k].compareTo(array[j])>0) {
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
                if (array[j].compareTo(array[k])>0 && (over || array[j+1].compareTo(array[j])<=0)) {
                    t = array[k];
                    array[k] = array[j];
                    array[j] = t;
                    k=j;
                }
                else if(!over && array[j+1].compareTo(array[k])>0){
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
    public void sort(List<? extends Comparable> list) {
        List<Comparable> listC=(List<Comparable>)list;
        int i,j,k,size=listC.size();
        Comparable t;
        boolean over;
        for(i=1;i<size;i++){
            k=i;
            while ((j=(k+1)/2-1)>=0) {
                if (listC.get(k).compareTo(listC.get(j))>0) {
                    t = listC.get(k);
                    listC.set(k,listC.get(j));
                    listC.set(j,t);
                }
                else{
                    break;
                }
                k=j;
            }
        }
        for(i=size;i>0;i--){
            t=listC.get(0);
            listC.set(0,listC.get(i-1));
            listC.set(i-1,t);
            k=0;
            while ((j=k*2+1)<i-1) {
                over = ((j+1)>=i-1);
                if (listC.get(j).compareTo(listC.get(k))>0 && (over || listC.get(j+1).compareTo(listC.get(j))<=0)) {
                    t = listC.get(k);
                    listC.set(k,listC.get(j));
                    listC.set(j,t);
                    k=j;
                }
                else if(!over && listC.get(j+1).compareTo(listC.get(k))>0){
                    t = listC.get(k);
                    listC.set(k,listC.get(j+1));
                    listC.set(j+1,t);
                    k=j+1;
                }
                else{
                    break;
                }
            }
        }
    }
}
