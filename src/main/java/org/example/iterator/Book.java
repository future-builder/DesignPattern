package org.example.iterator;

/**
 * @version 1.0
 * @Author MaYong
 * @Date 2023/8/19 8:45
 * @注释 book实体类
 */
public class Book {
    /**
     * 名称
     */
    private String name;

    public Book(String name) {
        this.name =  name;
    }
    /**
     * 获取名称
     * @return name
     */
    public String getName() {
        return this.name;
    }
}
