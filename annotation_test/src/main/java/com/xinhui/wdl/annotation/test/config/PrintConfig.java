package com.xinhui.wdl.annotation.test.config;

import com.xinhui.wdl.annotation.test.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author dongliang.wang
 * @createTime 2019/7/12
 **/
@Configuration
public class PrintConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public Person person1(){
        return new Person();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public Person person2(){
        return new Person();
    }
}
