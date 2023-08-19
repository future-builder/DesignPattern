package org.example.iterator;

/**
 * @version 1.0
 * @Author MaYong
 * @Date 2023/8/19 8:48
 * @注释 bookshelf 迭代器
 */
public class BookShelfIterator implements Iterator{
    /**
     * bookShelf
     */
    private BookShelf bookShelf;

    /**
     * 集合类下标
     */
    private int index = 0;

    /**
     * 有参构造方法
     * @param bookShelf
     */
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
