package com.xinhui.wdl.algorithm.controller;

/**
 * @author dongliang.wang
 * @createTime 2019/7/15
 **/
public class PlusAndSumController {
    public static void main(String[] args) {
        System.out.println("计算结果: " + plusSum(5));
    }

    private static int plusSum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + plusSum(i - 1);
        }
    }

}
