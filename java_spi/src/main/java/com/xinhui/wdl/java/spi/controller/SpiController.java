package com.xinhui.wdl.java.spi.controller;

import com.xinhui.wdl.java.spi.service.IShout;

import java.util.ServiceLoader;

/**
 * @author dongliang.wang
 * @createTime 2019/7/12
 **/
public class SpiController {

    /**
     * SPI全称Service Provider Interface创建步骤  https://www.jianshu.com/p/46b42f7f593c
     * 1.resources下面创建META-INF/SERVICES 这是jdk默认的加载路径
     * 2.在META-INF/SERVICES下面以接口全限定名创建文件
     * 3.在接口全限定名创建的文件中编写实现类的全限定名
     * 优势:实现解耦
     * 缺点:1)ServiceLoader也算是使用的延迟加载，但是基本只能通过遍历全部获取，也就是接口的实现类全部加载并实例化一遍。
     * 如果你并不想用某些实现类，它也被加载并实例化了，这就造成了浪费
     * 2)获取某个实现类的方式不够灵活，只能通过Iterator形式获取，不能根据某个参数来获取对应的实现类
     * 3)多个并发多线程使用ServiceLoader类的实例是不安全的
     * @param args 启动时的配置参数
     */
    public static void main(String[] args) {
        ServiceLoader<IShout> loader = ServiceLoader.load(IShout.class);
        loader.forEach(IShout::shout);
    }
}
