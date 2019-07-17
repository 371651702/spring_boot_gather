package com.xinhui.wdl.algorithm.controller;


/**
 * @author dongliang.wang
 * @createTime 2019/7/16
 **/
public class DirectInsertController {

    public static void main(String[] args) {
        int[] array = {36,56,12,7};
        directInsertSort(array);
        for (int number : array) {
            System.out.println(number);
        }
    }

    /**
     * 比较并交换排序
     * @param array 排序后的数组
     */
    private static void directInsertSort(int[] array) {
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp;
                    tmp = array [i];
                    array [i] = array [j];
                    array [j] = tmp;

                }
            }
        }
        System.out.println(System.nanoTime() - startTime);
    }

}
