package org.irgroup.datastructure;

import java.lang.reflect.Array;

/**
 * <pre>
 *      org.irgroup.datastructure
 *        |_ MinHeapTest.java
 * </pre>
 * <p>
 * <pre>
 *
 * </pre>
 *
 * @Author : 이상호 (focuschange@gmail.com)
 * @Date : 2016. 8. 30.
 * @Version : 1.0
 */
public class MinHeapTest {
    int entryCount = 7;
    MinHeap heap;
    StringHeapEntry[] entries = (StringHeapEntry[]) Array.newInstance(StringHeapEntry.class, entryCount + 1);

    @org.junit.BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownAfterClass ()
    {
    }

    @org.junit.Before
    public void setUp()
    {
        heap = new MinHeap(entries, 0, entryCount);
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void all() throws Exception {

        heap.insert(new StringHeapEntry("bbb"));
        heap.insert(new StringHeapEntry("ddd"));
        heap.insert(new StringHeapEntry("aaa"));
        heap.insert(new StringHeapEntry("ccc"));
        heap.insert(new StringHeapEntry("yyy"));
        heap.insert(new StringHeapEntry("ttttt"));
        heap.insert(new StringHeapEntry("xxxx"));
        heap.insert(new StringHeapEntry("ooo"));
        heap.insert(new StringHeapEntry("ooo"));

        heap.build();
        heap.print();

        System.out.println("list...");
        while (heap.count() > 0) {
            StringHeapEntry e = (StringHeapEntry) heap.remove();
            System.out.println(e);
        }
    }

}