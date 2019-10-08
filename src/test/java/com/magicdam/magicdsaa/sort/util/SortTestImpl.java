package com.magicdam.magicdsaa.sort.util;

import com.magicdam.magicdsaa.sort.Sort;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.number.OrderingComparison.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortTestImpl implements SortTest {

    private final static int ARRAY_LENGTH=1024;
    private final static int SORT_TIMES=10;

    private Sort sort=null;

    public SortTestImpl(Sort sort){
        this.sort=sort;
    }

    public void sortByte() {
        sort.sort(new byte[0]);
        sort.sort(new byte[]{1});
        byte[] array=new byte[ARRAY_LENGTH];
        for(int times=0;times<SORT_TIMES;times++) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (byte) new Random().nextInt();
            }
            sort.sort(array);
            for (int i = 1; i < array.length; i++) {
                assertThat(array[i], greaterThanOrEqualTo(array[i - 1]));
            }
//            System.out.println(Arrays.toString(array));
        }
    }

    public void sortChar() {
        sort.sort(new char[0]);
        sort.sort(new char[]{1});
        char[] array=new char[ARRAY_LENGTH];
        for(int times=0;times<SORT_TIMES;times++) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (char) new Random().nextInt();
            }
            sort.sort(array);
            for (int i = 1; i < array.length; i++) {
                assertThat(array[i], greaterThanOrEqualTo(array[i - 1]));
            }
//            System.out.println(Arrays.toString(array));
        }
    }

    public void sortShort() {
        sort.sort(new short[0]);
        sort.sort(new short[]{1});
        short[] array=new short[ARRAY_LENGTH];
        for(int times=0;times<SORT_TIMES;times++) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (short) new Random().nextInt();
            }
            sort.sort(array);
            for (int i = 1; i < array.length; i++) {
                assertThat(array[i], greaterThanOrEqualTo(array[i - 1]));
            }
//            System.out.println(Arrays.toString(array));
        }
    }

    public void sortInt() {
        sort.sort(new int[0]);
        sort.sort(new int[]{1});
        int[] array=new int[ARRAY_LENGTH];
        for(int times=0;times<SORT_TIMES;times++) {
            for (int i = 0; i < array.length; i++) {
                array[i] = new Random().nextInt();
            }
            sort.sort(array);
            for (int i = 1; i < array.length; i++) {
                assertThat(array[i], greaterThanOrEqualTo(array[i - 1]));
            }
//            System.out.println(Arrays.toString(array));
        }
    }

    public void sortLong() {
        sort.sort(new long[0]);
        sort.sort(new long[]{1});
        long[] array=new long[ARRAY_LENGTH];
        for(int times=0;times<SORT_TIMES;times++) {
            for (int i = 0; i < array.length; i++) {
                array[i] = new Random().nextLong();
            }
            sort.sort(array);
            for (int i = 1; i < array.length; i++) {
                assertThat(array[i], greaterThanOrEqualTo(array[i - 1]));
            }
//            System.out.println(Arrays.toString(array));
        }
    }

    public void sortObject() {
        {
            sort.sort(new Byte[0]);
            sort.sort(new Byte[]{1});
            Byte[] array=new Byte[ARRAY_LENGTH];
            for(int times=0;times<SORT_TIMES;times++) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = (byte)new Random().nextInt();
                }
                sort.sort(array);
                for (int i = 1; i < array.length; i++) {
                    assertThat(array[i], greaterThanOrEqualTo(array[i - 1]));
                }
//            System.out.println(Arrays.toString(array));
            }
        }

        {
            sort.sort(new Character[0]);
            sort.sort(new Character[]{1});
            Character[] array=new Character[ARRAY_LENGTH];
            for(int times=0;times<SORT_TIMES;times++) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = (char)new Random().nextInt();
                }
                sort.sort(array);
                for (int i = 1; i < array.length; i++) {
                    assertThat(array[i], greaterThanOrEqualTo(array[i - 1]));
                }
//            System.out.println(Arrays.toString(array));
            }
        }

        {
            sort.sort(new Short[0]);
            sort.sort(new Short[]{1});
            Short[] array=new Short[ARRAY_LENGTH];
            for(int times=0;times<SORT_TIMES;times++) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = (short)new Random().nextInt();
                }
                sort.sort(array);
                for (int i = 1; i < array.length; i++) {
                    assertThat(array[i], greaterThanOrEqualTo(array[i - 1]));
                }
//            System.out.println(Arrays.toString(array));
            }
        }

        {
            sort.sort(new Integer[0]);
            sort.sort(new Integer[]{1});
            Integer[] array=new Integer[ARRAY_LENGTH];
            for(int times=0;times<SORT_TIMES;times++) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = new Random().nextInt();
                }
                sort.sort(array);
                for (int i = 1; i < array.length; i++) {
                    assertThat(array[i], greaterThanOrEqualTo(array[i - 1]));
                }
//            System.out.println(Arrays.toString(array));
            }
        }

        {
            sort.sort(new Long[0]);
            sort.sort(new Long[]{1l});
            Long[] array=new Long[ARRAY_LENGTH];
            for(int times=0;times<SORT_TIMES;times++) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = new Random().nextLong();
                }
                sort.sort(array);
                for (int i = 1; i < array.length; i++) {
                    assertThat(array[i], greaterThanOrEqualTo(array[i - 1]));
                }
//            System.out.println(Arrays.toString(array));
            }
        }
    }

    public void sortList() {
        {
            List<Byte> list = new ArrayList();
            sort.sort(list);
            list.add(0, (byte) 1);
            sort.sort(list);
            list.clear();
            for (int times = 0; times < 10; times++) {
                for (int i = 0; i < ARRAY_LENGTH; i++) {
                    list.add((byte) new Random().nextInt());
                }
                sort.sort(list);
                for (int i = 1; i < ARRAY_LENGTH; i++) {
                    assertThat(list.get(i), greaterThanOrEqualTo(list.get(i - 1)));
                }
//            System.out.println(list);
            }
        }

        {
            List<Character> list = new ArrayList();
            sort.sort(list);
            list.add(0, (char) 1);
            sort.sort(list);
            list.clear();
            for (int times = 0; times < 10; times++) {
                for (int i = 0; i < ARRAY_LENGTH; i++) {
                    list.add((char) new Random().nextInt());
                }
                sort.sort(list);
                for (int i = 1; i < ARRAY_LENGTH; i++) {
                    assertThat(list.get(i), greaterThanOrEqualTo(list.get(i - 1)));
                }
//            System.out.println(list);
            }
        }

        {
            List<Short> list = new ArrayList();
            sort.sort(list);
            list.add(0, (short) 1);
            sort.sort(list);
            list.clear();
            for (int times = 0; times < 10; times++) {
                for (int i = 0; i < ARRAY_LENGTH; i++) {
                    list.add((short) new Random().nextInt());
                }
                sort.sort(list);
                for (int i = 1; i < ARRAY_LENGTH; i++) {
                    assertThat(list.get(i), greaterThanOrEqualTo(list.get(i - 1)));
                }
//            System.out.println(list);
            }
        }

        {
            List<Long> list = new ArrayList();
            sort.sort(list);
            list.add(0, 1l);
            sort.sort(list);
            list.clear();
            for (int times = 0; times < 10; times++) {
                for (int i = 0; i < ARRAY_LENGTH; i++) {
                    list.add(new Random().nextLong());
                }
                sort.sort(list);
                for (int i = 1; i < ARRAY_LENGTH; i++) {
                    assertThat(list.get(i), greaterThanOrEqualTo(list.get(i - 1)));
                }
//            System.out.println(list);
            }
        }
    }

}