package com.magicdam.magicdsaa.sort;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;

public class SortMeasuringTime {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始运行...");
        long time1,time2;
        time1 = System.nanoTime();
        test();
        time2 = System.nanoTime();
        System.out.println("运行结束，总耗时："+timeFormat(time2-time1));
    }

    public static void test(){
        long[][] times=new long[7][11];
        //不宜太多，防止GC造成影响
        int[] INTS=new int[10000];
        Random random=new Random();

        //j=0时预热一下，不参与计算平均值
        for(int j=0;j<11;j++) {
            for (int i = 0; i < INTS.length; i++) {
                INTS[i] = random.nextInt();
            }
            times[0][j]=sort(Sort.getBubbleSort(), INTS);
            times[1][j]=sort(Sort.getSelectionSort(), INTS);
            times[2][j]=sort(Sort.getInsertionSort(), INTS);
            times[3][j]=sort(Sort.getHeapSort(), INTS);
            times[4][j]=sort(Sort.getMergeSort(), INTS);
            times[5][j]=sort(Sort.getQuickSort(), INTS);
            times[6][j]=sort(Sort.getQuickSort(), INTS);
        }

        TreeMap<Long, String> treeMap=new TreeMap();
        treeMap.put(calcAverage(times[0]),"冒泡排序");
        treeMap.put(calcAverage(times[1]),"选择排序");
        treeMap.put(calcAverage(times[2]),"插入排序");
        treeMap.put(calcAverage(times[3]),"堆排序");
        treeMap.put(calcAverage(times[4]),"归并排序");
        treeMap.put(calcAverage(times[5]),"快速排序");
        treeMap.put(calcAverage(times[6]),"Arrays排序");
        for(Long item:treeMap.keySet()){
            System.out.println(treeMap.get(item) + "：" + timeFormat(item));
        }
    }

    public static long calcAverage(long times[]){
        long total = 0;
        for (int i = 1; i < times.length; i++) {
            total += times[i];
        }
        long timeAverage = total / times.length;
        return timeAverage;
    }

    public static long sort(Sort sort,int[] INTS){
        long time=0;
        int[] ints = Arrays.copyOf(INTS, INTS.length);
        long time1, time2;
        time1 = System.nanoTime();
        sort.sort(ints);
        time2 = System.nanoTime();
        time=time2-time1;
        return time;
    }

    public static long sort(int[] INTS){
        long time=0;
        int[] ints = Arrays.copyOf(INTS, INTS.length);
        long time1, time2;
        time1 = System.nanoTime();
        Arrays.sort(ints);
        time2 = System.nanoTime();
        time=time2-time1;
        return time;
    }

    public static String timeFormat(long time){
        BigDecimal bigDecimal;
        if(time>=1000000000){
            bigDecimal=BigDecimal.valueOf(time/1000000000d);
            bigDecimal=bigDecimal.setScale(3,BigDecimal.ROUND_HALF_UP);
            return bigDecimal.toString()+"s";
        }
        else if(time>=1000000){
            bigDecimal=BigDecimal.valueOf(time/1000000d);
            bigDecimal=bigDecimal.setScale(3,BigDecimal.ROUND_HALF_UP);
            return bigDecimal.toPlainString()+"ms";
        }
        else if(time>=1000){
            bigDecimal=BigDecimal.valueOf(time/1000d);
            bigDecimal=bigDecimal.setScale(3,BigDecimal.ROUND_HALF_UP);
            return bigDecimal.toString()+"us";
        }
        else{
            return time+"ns";
        }
    }

}
