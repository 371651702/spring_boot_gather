package com.xinhui.wdl.algorithm.controller;
import	java.net.URL;
import	java.util.TreeMap;
import	java.io.FileReader;
import	java.util.SortedMap;
import	java.util.jar.JarEntry;
import	java.util.jar.JarFile;
import	java.io.InputStreamReader;
import	java.io.BufferedReader;
import java.io.*;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.IntStream;

/**
 * @author dongliang.wang
 * @createTime 2019/7/16
 **/
public class ArraysDemoController {

    public static void main(String[] args){
        List<String> asList = Arrays.asList("a", "b", "c");
        //通过Arrays.asList("a", "b", "c")创建的list是
        //java.util.Arrays.ArrayList包下的ArrayList没有add和delete方法
        //asList.add("d");方法抛出UnsupportedOperationException异常


        //下面set方法是替换  打印结果是a,b,d 把下标为2的值替换为c
        asList.set(2,"d");

        //获取指定元素的下标
//        int a = asList.indexOf("b");

//        for (String str : asList) {
//            System.out.println(str);
//        }
        //下面两个功能相同
//        asList.forEach(System.out::println);

//        Spliterator<String> spliterator = asList.spliterator();
//        spliterator.forEachRemaining(System.out::println);

        int[] arr = { 26, 19, 7, 37, 27, 57, 67, 99, 87, 17};
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);






    }
}
