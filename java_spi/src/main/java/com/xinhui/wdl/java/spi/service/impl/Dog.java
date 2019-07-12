package com.xinhui.wdl.java.spi.service.impl;

import com.xinhui.wdl.java.spi.service.IShout;

/**
 * @author dongliang.wang
 * @createTime 2019/7/12
 **/
public class Dog implements IShout {
    @Override
    public void shout() {
        System.out.println("dog dog dog");
    }
}
