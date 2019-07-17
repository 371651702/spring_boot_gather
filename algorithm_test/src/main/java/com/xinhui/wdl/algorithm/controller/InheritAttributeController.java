package com.xinhui.wdl.algorithm.controller;

import java.util.Arrays;
import java.util.List;

/**
 * @author dongliang.wang
 * @createTime 2019/7/15
 **/
public class InheritAttributeController {
    private int i = 2;

    static class InnerClass extends InheritAttributeController{
        private int i = 3;
    }

    public static void main(String[] args) {
        //new InnerClass调用的是子类的
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.i);

        //new InheritAttributeController调用的是父类的
        InheritAttributeController f = new InnerClass();
        System.out.println(f.i);

    }
}
