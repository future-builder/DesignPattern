package org.example.iterator;

/**
 * @version 1.0
 * @Author MaYong
 * @Date 2023/8/19 8:38
 * @注释 集合接口
 */
public interface Aggregate {
    /**
     * 获取当前对象的迭代器
     * @return 迭代器
     */
    public abstract Iterator iterator();
}
