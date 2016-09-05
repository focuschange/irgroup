package org.irgroup.datastructure;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

/**
 * <pre>
 *      org.irgroup.datastructure
 *        |_ MaxHeapTest.java
 * </pre>
 * <p>
 * <pre>
 *
 * </pre>
 *
 * @Author : 이상호 (focuschange@gmail.com)
 * @Date : 2016. 9. 5.
 * @Version : 1.0
 */

public class MaxHeapTest {

	int entryCount = 20;
	StringHeapEntry[] entries;
	MaxHeap heap;

	@Before
	public void setUp() throws Exception {
		entries = (StringHeapEntry[]) Array.newInstance(StringHeapEntry.class, entryCount + 1);
		heap = new MaxHeap(entries, 0, entryCount);
	}

	@Test
	public void insert() throws Exception {

		heap.insert(new StringHeapEntry("abbb"));
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