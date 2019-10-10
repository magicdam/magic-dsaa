package com.magicdam.magicdsaa.sort;

import java.util.List;

/**
 * 排序基类
 * 所有的排序算法实例从这里获取，是单例模式，且线程安全
 */
public abstract class Sort {
    //以下是排序类的实例
    private static BubbleSort bubbleSort=new BubbleSort();
    private static SelectionSort selectionSort=new SelectionSort();
    private static InsertionSort insertionSort=new InsertionSort();
    private static HeapSort heapSort=new HeapSort();
    private static MergeSort mergeSort=new MergeSort();
    private static QuickSort quickSort=new QuickSort();

    //以下是获取实例的方法
    /**
     * 获取冒泡排序类实例
     */
    public static BubbleSort getBubbleSort(){
        return bubbleSort;
    }
    /**
     * 获取选择排序类实例
     */
    public static SelectionSort getSelectionSort(){
        return selectionSort;
    }
    /**
     * 获取插入排序类实例
     */
    public static InsertionSort getInsertionSort(){
        return insertionSort;
    }
    /**
     * 获取堆排序类实例
     */
    public static HeapSort getHeapSort(){
        return heapSort;
    }
    /**
     * 获取归并排序类实例
     */
    public static MergeSort getMergeSort(){
        return mergeSort;
    }
    /**
     * 获取快速排序类实例
     */
    public static QuickSort getQuickSort(){
        return quickSort;
    }

    //以下是排序的接口，支持各种集合类型的排序，所有的排序类都要实现这些方法
    public abstract void sort(byte[] array);
    public abstract void sort(char[] array);
    public abstract void sort(short[] array);
    public abstract void sort(int[] array);
    public abstract void sort(long[] array);
    public abstract void sort(Comparable[] array);
    public abstract void sort(List<? extends Comparable> list);

    public static void main(String[] args) {
        System.out.println("你好");
    }
}
