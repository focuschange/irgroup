package org.irgroup.datastructure;

/**
 * Created by focuschange on 2016. 8. 30..
 */
public class MinHeapStringEntry implements Comparable{
    String data;

    public MinHeapStringEntry(String val) {
        this.data = val;
    }

    @Override
    public int compareTo(Object o) {
        return this.data.compareTo(((MinHeapStringEntry) o).data);
    }

    @Override
    public String toString() {
        return data;
    }

}
