package org.example.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author MaYong
 * @Date 2023/8/19 8:49
 * @注释
 */
public class BookShelf implements Aggregate {
    /**
     * book集合
     */
    private List<Book> books = new ArrayList<>();

    /**
     * 最后一个元素的下标
     */
    private int last = -1;

    /**
     * 获取指定位置的元素
     * @param index
     * @return
     */
    public Book getBookAt(int index) {
        if (index >= books.size()) {
            throw new IndexOutOfBoundsException();
        }
        return books.get(index);
    }

    /**
     * 添加book元素
     * @param book
     * @return
     */
    public boolean appendBook(Book book) {
        last++;
        return books.add(book);
    }

    /**
     * 获取集合长度
     * @return
     */
    public int getLength() {
        return last+1;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
