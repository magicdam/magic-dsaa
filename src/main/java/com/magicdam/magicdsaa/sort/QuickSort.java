package com.magicdam.magicdsaa.sort;

import com.magicdam.magicdsaa.Util;
import java.util.List;
/**
 * 快速排序
 * 时间复杂度O(nlogn)
 * 空间复杂度O(n)
 * 稳定性：不稳定
 */
class QuickSort extends Sort{
    @Override
    public void sort(byte[] array) {
        int length=array.length;
        if(length<2)
            return;
        doSort(array,0,length-2,length-1);
    }

    private static void doSort(byte[] array,int left,int right,int pivot){
        if(right<left){
            return;
        }
        int l=left,r=right;
        while (true) {
            while (array[l] < array[pivot] && l < pivot) {
                l++;
            }
            while (array[r] >= array[pivot] && r > l) {
                r--;
            }
            if (l == pivot) {
                doSort(array, left, right - 1, pivot - 1);
                return;
            } else if (l == r) {
                Util.swap(array, r, pivot);
                doSort(array, left, r - 2, r - 1);
                doSort(array, r + 1, right, pivot);
                return;
            } else {
                Util.swap(array, l, r);
            }
        }
    }

    @Override
    public void sort(char[] array) {
        int length=array.length;
        if(length<2)
            return;
        doSort(array,0,length-2,length-1);
    }

    private static void doSort(char[] array,int left,int right,int pivot){
        if(right<left){
            return;
        }
        int l=left,r=right;
        while (true) {
            while (array[l] < array[pivot] && l < pivot) {
                l++;
            }
            while (array[r] >= array[pivot] && r > l) {
                r--;
            }
            if (l == pivot) {
                doSort(array, left, right - 1, pivot - 1);
                return;
            } else if (l == r) {
                Util.swap(array, r, pivot);
                doSort(array, left, r - 2, r - 1);
                doSort(array, r + 1, right, pivot);
                return;
            } else {
                Util.swap(array, l, r);
            }
        }
    }

    @Override
    public void sort(short[] array) {
        int length=array.length;
        if(length<2)
            return;
        doSort(array,0,length-2,length-1);
    }

    private static void doSort(short[] array,int left,int right,int pivot){
        if(right<left){
            return;
        }
        int l=left,r=right;
        while (true) {
            while (array[l] < array[pivot] && l < pivot) {
                l++;
            }
            while (array[r] >= array[pivot] && r > l) {
                r--;
            }
            if (l == pivot) {
                doSort(array, left, right - 1, pivot - 1);
                return;
            } else if (l == r) {
                Util.swap(array, r, pivot);
                doSort(array, left, r - 2, r - 1);
                doSort(array, r + 1, right, pivot);
                return;
            } else {
                Util.swap(array, l, r);
            }
        }
    }

    @Override
    public void sort(int[] array) {
        int length=array.length;
        if(length<2)
            return;
        doSort(array,0,length-2,length-1);
    }

    private static void doSort(int[] array,int left,int right,int pivot){
        if(right<left){
            return;
        }
        int l=left,r=right;
        while (true) {
            while (array[l] < array[pivot] && l < pivot) {
                l++;
            }
            while (array[r] >= array[pivot] && r > l) {
                r--;
            }
            if (l == pivot) {
                doSort(array, left, right - 1, pivot - 1);
                return;
            } else if (l == r) {
                Util.swap(array, r, pivot);
                doSort(array, left, r - 2, r - 1);
                doSort(array, r + 1, right, pivot);
                return;
            } else {
                Util.swap(array, l, r);
            }
        }
    }

    @Override
    public void sort(long[] array) {
        int length=array.length;
        if(length<2)
            return;
        doSort(array,0,length-2,length-1);
    }

    private static void doSort(long[] array,int left,int right,int pivot){
        if(right<left){
            return;
        }
        int l=left,r=right;
        while (true) {
            while (array[l] < array[pivot] && l < pivot) {
                l++;
            }
            while (array[r] >= array[pivot] && r > l) {
                r--;
            }
            if (l == pivot) {
                doSort(array, left, right - 1, pivot - 1);
                return;
            } else if (l == r) {
                Util.swap(array, r, pivot);
                doSort(array, left, r - 2, r - 1);
                doSort(array, r + 1, right, pivot);
                return;
            } else {
                Util.swap(array, l, r);
            }
        }
    }


    @Override
    public void sort(Comparable[] array) {
        int length=array.length;
        if(length<2)
            return;
        doSort(array,0,length-2,length-1);
    }

    private static void doSort(Comparable[] array,int left,int right,int pivot){
        if(right<left){
            return;
        }
        int l=left,r=right;
        while (true) {
            while (array[l].compareTo(array[pivot])<0  && l < pivot) {
                l++;
            }
            while (array[r].compareTo(array[pivot])>=0 && r > l) {
                r--;
            }
            if (l == pivot) {
                doSort(array, left, right - 1, pivot - 1);
                return;
            } else if (l == r) {
                Util.swap(array, r, pivot);
                doSort(array, left, r - 2, r - 1);
                doSort(array, r + 1, right, pivot);
                return;
            } else {
                Util.swap(array, l, r);
            }
        }
    }

    @Override
    public void sort(List<? extends Comparable> list) {
        int length=list.size();
        if(length<2)
            return;
        List<Comparable> listC=(List<Comparable>)list;
        doSort(listC,0,length-2,length-1);
    }

    private static void doSort(List<Comparable> list,int left,int right,int pivot){
        if(right<left){
            return;
        }
        int l=left,r=right;
        while (true) {
            while (list.get(l).compareTo(list.get(pivot))<0  && l < pivot) {
                l++;
            }
            while (list.get(r).compareTo(list.get(pivot))>=0 && r > l) {
                r--;
            }
            if (l == pivot) {
                doSort(list, left, right - 1, pivot - 1);
                return;
            } else if (l == r) {
                Util.swap(list, r, pivot);
                doSort(list, left, r - 2, r - 1);
                doSort(list, r + 1, right, pivot);
                return;
            } else {
                Util.swap(list, l, r);
            }
        }
    }
}
