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
     *
     * 1.数据库驱动加载接口实现类的加载
     * JDBC加载不同类型数据库的驱动
     * 2.日志门面接口实现类加载
     * SLF4J加载不同提供商的日志实现类
     * 3.Spring中大量使用了SPI,比如：对servlet3.0规范对ServletContainerInitializer的实现、
     * 自动类型转换Type Conversion SPI(Converter SPI、Formatter SPI)等
     * 4.Dubbo中也大量使用SPI的方式实现框架的扩展, 不过它对Java提供的原生SPI做了封装，允许用户扩展实现Filter接口
     * 5.spring cloud SPI使用 https://blog.csdn.net/qq_27529917/article/details/80861178
     */
    public static void main(String[] args) {
        ServiceLoader<IShout> loader = ServiceLoader.load(IShout.class);
        loader.forEach(IShout::shout);
    }
}
