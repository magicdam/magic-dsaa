package com.magicdam.magicdsaa.sort.util;

import com.magicdam.magicdsaa.sort.Sort;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

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

        byte[] array=new byte[]{1};
        sort.sort(array);
        assertThat((byte)1,equalTo(array[0]));

        array=new byte[ARRAY_LENGTH];
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

        char[] array=new char[]{1};
        sort.sort(array);
        assertThat((char)1,equalTo(array[0]));

        array=new char[ARRAY_LENGTH];
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

        short[] array=new short[]{1};
        sort.sort(array);
        assertThat((short)1,equalTo(array[0]));

        array=new short[ARRAY_LENGTH];
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

        int[] array=new int[]{1};
        sort.sort(array);
        assertThat(1,equalTo(array[0]));

        array=new int[ARRAY_LENGTH];
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

        long[] array=new long[]{1};
        sort.sort(array);
        assertThat((long)1,equalTo(array[0]));

        array=new long[ARRAY_LENGTH];
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

            Byte[] array=new Byte[]{1};
            sort.sort(array);
            assertThat((byte)1,equalTo(array[0]));

            array=new Byte[ARRAY_LENGTH];
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

            Character[] array=new Character[]{1};
            sort.sort(array);
            assertThat((char)1,equalTo(array[0]));

            array=new Character[ARRAY_LENGTH];
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

            Short[] array=new Short[]{1};
            sort.sort(array);
            assertThat((short)1,equalTo(array[0]));

            array=new Short[ARRAY_LENGTH];
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

            Integer[] array=new Integer[]{1};
            sort.sort(array);
            assertThat(1,equalTo(array[0]));

            array = new Integer[ARRAY_LENGTH];
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

            Long[] array=new Long[]{1l};
            sort.sort(array);
            assertThat((long)1,equalTo(array[0]));

            array=new Long[ARRAY_LENGTH];
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
            assertThat((byte)1,equalTo(list.get(0)));

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
            assertThat((char)1,equalTo(list.get(0)));

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
            assertThat((short)1,equalTo(list.get(0)));

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

            list.add(0, (long) 1);
            sort.sort(list);
            assertThat((long)1,equalTo(list.get(0)));

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