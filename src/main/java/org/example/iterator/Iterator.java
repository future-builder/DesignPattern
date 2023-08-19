package org.example.iterator;

/**
 * @version 1.0
 * @Author MaYong
 * @Date 2023/8/19 8:42
 * @注释 迭代器jiekou
 */
public interface Iterator {

    /**
     * 是否还有下一个元素
     * @return true or false
     */
    public abstract boolean hasNext();

    /**
     * 返回当前元素并移动下标至下一个元素
     * @return 当前元素对象
     */
    public abstract Object next();
}
