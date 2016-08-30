package org.irgroup.datastructure;

import java.lang.reflect.Array;

/**
 * Created by focuschange on 2016. 8. 30..
 */
public class MinHeapTest {
    int entryCount = 15;
    MinHeap heap;
    MinHeapStringEntry[] entries = (MinHeapStringEntry[]) Array.newInstance(MinHeapStringEntry.class, entryCount + 1);

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

        heap.insert(new MinHeapStringEntry("bbb"));
        heap.insert(new MinHeapStringEntry("ddd"));
        heap.insert(new MinHeapStringEntry("aaa"));
        heap.insert(new MinHeapStringEntry("ccc"));
        heap.insert(new MinHeapStringEntry("yyy"));
        heap.insert(new MinHeapStringEntry("ttttt"));
        heap.insert(new MinHeapStringEntry("xxxx"));
        heap.insert(new MinHeapStringEntry("ooo"));
        heap.insert(new MinHeapStringEntry("ooo"));

        heap.build();
        heap.print();

        System.out.println("list...");
        while (heap.count() > 0) {
            MinHeapStringEntry e = (MinHeapStringEntry) heap.remove();
            System.out.println(e);
        }
    }

}