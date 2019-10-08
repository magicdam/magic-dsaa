package com.magicdam.magicdsaa.sort;

import java.util.List;

public abstract class Sort {
    private static BubbleSort bubbleSort=new BubbleSort();
    private static SelectionSort selectionSort=new SelectionSort();

    public static BubbleSort getBubbleSort(){
        return bubbleSort;
    }
    public static SelectionSort getSelectionSort(){
        return selectionSort;
    }

    public abstract void sort(byte[] array);

    public abstract void sort(char[] array);

    public abstract void sort(short[] array);

    public abstract void sort(int[] array);

    public abstract void sort(long[] array);

    public abstract void sort(Object[] array);

    public abstract void sort(List list);

}
