package com.magicdam.magicdsaa.sort;

import com.magicdam.magicdsaa.sort.util.SortTestImpl;
import com.magicdam.magicdsaa.sort.util.SortTest;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest implements SortTest {

    private static Sort SORT=Sort.getBubbleSort();

    private SortTestImpl sortTestImpl;

    @Before
    public void setUp(){
        sortTestImpl =new SortTestImpl(SORT);
    }

    @Override
    @Test
    public void sortByte() {
        sortTestImpl.sortByte();
    }

    @Override
    @Test
    public void sortChar() {
        sortTestImpl.sortChar();
    }

    @Override
    @Test
    public void sortShort() {
        sortTestImpl.sortShort();
    }

    @Override
    @Test
    public void sortInt() {
        sortTestImpl.sortInt();
    }

    @Override
    @Test
    public void sortLong() {
        sortTestImpl.sortLong();
    }

    @Override
    @Test
    public void sortObject() {
        sortTestImpl.sortObject();
    }

    @Override
    @Test
    public void sortList() {
        sortTestImpl.sortList();
    }
}
