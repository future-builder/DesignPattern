package org.example.adapter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withYear(2022);
        LocalDate localDate = now.withMonth(2);

        // 获取当前月份的第一天
        LocalDate firstDay = localDate.withDayOfMonth(1);
        System.out.println("第一天：" + firstDay);

        // 获取当前月份的最后一天
        LocalDate lastDay = localDate.withDayOfMonth(localDate.lengthOfMonth());
        System.out.println("最后一天：" + lastDay);
    }
}
