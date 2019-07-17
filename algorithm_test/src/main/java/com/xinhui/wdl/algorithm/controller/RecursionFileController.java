package com.xinhui.wdl.algorithm.controller;


import java.io.File;

/**
 * @author dongliang.wang
 * @createTime 2019/7/15
 **/
public class RecursionFileController {

    public static void main(String[] args) {
        File file = new File("\\src");
        printFile(file);
    }

    private static void printFile(File file) {
        if (null != file && file.length() > 0) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File doc : files) {
                    if (null != doc && doc.isDirectory()) {
                        printFile(doc);
                    } else {
                        System.out.println(doc);
                    }
                }
            } else {
                System.out.println(file);
            }
        }
    }
}
