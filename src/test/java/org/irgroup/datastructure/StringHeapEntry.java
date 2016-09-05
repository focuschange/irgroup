package org.irgroup.datastructure;

/**
 * <pre>
 *      org.irgroup.datastructure
 *        |_ MinHeapStringEntry.java
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
public class StringHeapEntry implements Comparable{
    String data;

    public StringHeapEntry(String val) {
        this.data = val;
    }

    @Override
    public int compareTo(Object o) {
        return this.data.compareTo(((StringHeapEntry) o).data);
    }

    @Override
    public String toString() {
        return data;
    }

}
