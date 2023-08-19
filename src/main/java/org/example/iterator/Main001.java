package org.example.iterator;

/**
 * @version 1.0
 * @Author MaYong
 * @Date 2023/8/19 9:09
 * @注释
 */
public class Main001 {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("《儒林外史》"));
        bookShelf.appendBook(new Book("《钢铁是怎样炼成的》"));
        bookShelf.appendBook(new Book("《西游记》"));
        bookShelf.appendBook(new Book("《红楼梦》"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = ((Book) iterator.next());
            System.out.println(book.getName());
        }
    }
}
