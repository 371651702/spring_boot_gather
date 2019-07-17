package com.xinhui.wdl.algorithm.controller;

/**
 * @author dongliang.wang
 * @createTime 2019/7/17
 **/
public class StringApiController {

    public static void main(String[] args) {
        String str = "sdfgsg";

        String[] split = str.split("s");
        for (String substr : split) {
            System.out.println(substr);
        }
    }
}
