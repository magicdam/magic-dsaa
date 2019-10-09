package com.magicdam.magicdsaa;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UtilTest {

    private final static int ARRAY_LENGTH=4;
    private final static int TEST_TIMES=10;

    @Test
    public void swapByte() {
        byte[] array2,array1=new byte[ARRAY_LENGTH];
        Random random=new Random();
        for(int i=0;i<ARRAY_LENGTH;i++){
            array1[i]=(byte)(random.nextInt());
        }
        boolean different=false;
        for(int times=0;times<TEST_TIMES || !different;times++) {
            array2 = array1.clone();
            int a = random.nextInt(ARRAY_LENGTH);
            int b = random.nextInt(ARRAY_LENGTH);
            if(a!=b){
                different=true;
            }
            Util.swap(array2, a, b);
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                if (i == a) {
                    assertThat(array1[i], equalTo(array2[b]));
                } else if (i == b) {
                    assertThat(array1[i], equalTo(array2[a]));
                } else {
                    assertThat(array1[i], equalTo(array2[i]));
                }
            }
            array1=array2;
        }
    }

    @Test
    public void swapChar() {
        char[] array2,array1=new char[ARRAY_LENGTH];
        Random random=new Random();
        for(int i=0;i<ARRAY_LENGTH;i++){
            array1[i]=(char)(random.nextInt());
        }
        boolean different=false;
        for(int times=0;times<TEST_TIMES || !different;times++) {
            array2 = array1.clone();
            int a = random.nextInt(ARRAY_LENGTH);
            int b = random.nextInt(ARRAY_LENGTH);
            if(a!=b){
                different=true;
            }
            Util.swap(array2, a, b);
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                if (i == a) {
                    assertThat(array1[i], equalTo(array2[b]));
                } else if (i == b) {
                    assertThat(array1[i], equalTo(array2[a]));
                } else {
                    assertThat(array1[i], equalTo(array2[i]));
                }
            }
            array1=array2;
        }
    }

    @Test
    public void swapShort() {
        short[] array2,array1=new short[ARRAY_LENGTH];
        Random random=new Random();
        for(int i=0;i<ARRAY_LENGTH;i++){
            array1[i]=(short)(random.nextInt());
        }
        boolean different=false;
        for(int times=0;times<TEST_TIMES || !different;times++) {
            array2 = array1.clone();
            int a = random.nextInt(ARRAY_LENGTH);
            int b = random.nextInt(ARRAY_LENGTH);
            if(a!=b){
                different=true;
            }
            Util.swap(array2, a, b);
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                if (i == a) {
                    assertThat(array1[i], equalTo(array2[b]));
                } else if (i == b) {
                    assertThat(array1[i], equalTo(array2[a]));
                } else {
                    assertThat(array1[i], equalTo(array2[i]));
                }
            }
            array1=array2;
        }
    }

    @Test
    public void swapInt() {
        int[] array2,array1=new int[ARRAY_LENGTH];
        Random random=new Random();
        for(int i=0;i<ARRAY_LENGTH;i++){
            array1[i]=random.nextInt();
        }
        boolean different=false;
        for(int times=0;times<TEST_TIMES || !different;times++) {
            array2 = array1.clone();
            int a = random.nextInt(ARRAY_LENGTH);
            int b = random.nextInt(ARRAY_LENGTH);
            if(a!=b){
                different=true;
            }
            Util.swap(array2, a, b);
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                if (i == a) {
                    assertThat(array1[i], equalTo(array2[b]));
                } else if (i == b) {
                    assertThat(array1[i], equalTo(array2[a]));
                } else {
                    assertThat(array1[i], equalTo(array2[i]));
                }
            }
            array1=array2;
        }
    }

    @Test
    public void swapLong() {
        long[] array2,array1=new long[ARRAY_LENGTH];
        Random random=new Random();
        for(int i=0;i<ARRAY_LENGTH;i++){
            array1[i]=random.nextLong();
        }
        boolean different=false;
        for(int times=0;times<TEST_TIMES || !different;times++) {
            array2 = array1.clone();
            int a = random.nextInt(ARRAY_LENGTH);
            int b = random.nextInt(ARRAY_LENGTH);
            if(a!=b){
                different=true;
            }
            Util.swap(array2, a, b);
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                if (i == a) {
                    assertThat(array1[i], equalTo(array2[b]));
                } else if (i == b) {
                    assertThat(array1[i], equalTo(array2[a]));
                } else {
                    assertThat(array1[i], equalTo(array2[i]));
                }
            }
            array1=array2;
        }
    }

    @Test
    public void swapObject() {
        Integer[] array2,array1=new Integer[ARRAY_LENGTH];
        Random random=new Random();
        for(int i=0;i<ARRAY_LENGTH;i++){
            array1[i]=random.nextInt();
        }
        boolean different=false;
        for(int times=0;times<TEST_TIMES || !different;times++) {
            array2 = array1.clone();
            int a = random.nextInt(ARRAY_LENGTH);
            int b = random.nextInt(ARRAY_LENGTH);
            if(a!=b){
                different=true;
            }
            Util.swap(array2, a, b);
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                if (i == a) {
                    assertThat(array1[i], equalTo(array2[b]));
                } else if (i == b) {
                    assertThat(array1[i], equalTo(array2[a]));
                } else {
                    assertThat(array1[i], equalTo(array2[i]));
                }
            }
            array1=array2;
        }
    }

    @Test
    public void swapList() {
        ArrayList<Integer> list2,list1=new ArrayList();
        Random random=new Random();
        for(int i=0;i<ARRAY_LENGTH;i++){
            list1.add(random.nextInt());
        }
        boolean different=false;
        for(int times=0;times<TEST_TIMES || !different;times++) {
            list2 = (ArrayList<Integer>) list1.clone();
            int a = random.nextInt(ARRAY_LENGTH);
            int b = random.nextInt(ARRAY_LENGTH);
            if(a!=b){
                different=true;
            }
            Util.swap(list2, a, b);
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                if (i == a) {
                    assertThat(list1.get(i), equalTo(list2.get(b)));
                } else if (i == b) {
                    assertThat(list1.get(i), equalTo(list2.get(a)));
                } else {
                    assertThat(list1.get(i), equalTo(list2.get(i)));
                }
            }
            list1=list2;
        }
    }

    @Test
    public void isOddByte(){
        Random random=new Random();
        for(int i=0;i<TEST_TIMES;i++){
            byte number=(byte)random.nextInt();
            boolean realOdd=(number%2!=0);
            boolean resultOdd=Util.isOdd(number);
            assertThat(realOdd, equalTo(resultOdd));
        }
    }

    @Test
    public void isOddChar(){
        Random random=new Random();
        for(int i=0;i<TEST_TIMES;i++){
            char number=(char)random.nextInt();
            boolean realOdd=(number%2!=0);
            boolean resultOdd=Util.isOdd(number);
            assertThat(realOdd, equalTo(resultOdd));
        }
    }

    @Test
    public void isOddShort(){
        Random random=new Random();
        for(int i=0;i<TEST_TIMES;i++){
            short number=(short)random.nextInt();
            boolean realOdd=(number%2!=0);
            boolean resultOdd=Util.isOdd(number);
            assertThat(realOdd, equalTo(resultOdd));
        }
    }

    @Test
    public void isOddInt(){
        Random random=new Random();
        for(int i=0;i<TEST_TIMES;i++){
            int number=random.nextInt();
            boolean realOdd=(number%2!=0);
            boolean resultOdd=Util.isOdd(number);
            assertThat(realOdd, equalTo(resultOdd));
        }
    }

    @Test
    public void isOddLong(){
        Random random=new Random();
        for(int i=0;i<TEST_TIMES;i++){
            long number=random.nextLong();
            boolean realOdd=(number%2!=0);
            boolean resultOdd=Util.isOdd(number);
            assertThat(realOdd, equalTo(resultOdd));
        }
    }

    @Test
    public void isOddNumber(){
        Random random=new Random();
        for(int i=0;i<TEST_TIMES;i++){
            Byte number=(byte)random.nextInt();
            boolean realOdd=(number%2!=0);
            boolean resultOdd=Util.isOdd(number);
            assertThat(realOdd, equalTo(resultOdd));
        }
        for(int i=0;i<TEST_TIMES;i++){
            Character number=(char)random.nextInt();
            boolean realOdd=(number%2!=0);
            boolean resultOdd=Util.isOdd(number);
            assertThat(realOdd, equalTo(resultOdd));
        }
        for(int i=0;i<TEST_TIMES;i++){
            Short number=(short)random.nextInt();
            boolean realOdd=(number%2!=0);
            boolean resultOdd=Util.isOdd(number);
            assertThat(realOdd, equalTo(resultOdd));
        }
        for(int i=0;i<TEST_TIMES;i++){
            Integer number=random.nextInt();
            boolean realOdd=(number%2!=0);
            boolean resultOdd=Util.isOdd(number);
            assertThat(realOdd, equalTo(resultOdd));
        }
        for(int i=0;i<TEST_TIMES;i++){
            Long number=random.nextLong();
            boolean realOdd=(number%2!=0);
            boolean resultOdd=Util.isOdd(number);
            assertThat(realOdd, equalTo(resultOdd));
        }
    }
}