package com.xinhui.wdl.java.spi.service.impl;

import com.xinhui.wdl.java.spi.service.IShout;

/**
 * @author dongliang.wang
 * @createTime 2019/7/12
 **/
public class Cat implements IShout {
    @Override
    public void shout() {
        System.out.println("cat cat cat");
    }
}
