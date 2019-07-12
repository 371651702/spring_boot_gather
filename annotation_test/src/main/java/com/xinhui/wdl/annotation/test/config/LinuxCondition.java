package com.xinhui.wdl.annotation.test.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author dongliang.wang
 * @createTime 2019/7/12
 **/
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        String env = environment.getProperty("os.name");
        String os = "linux";
        return env.contains(os);
    }
}
