package com.csy.pig.common.core.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Data
@Configuration
@RefreshScope
@ConditionalOnExpression("!'${ignore}'.isEmpty()")
@ConfigurationProperties(prefix = "ignore")
public class FilterIgnorePropertiesConfig {

    private List<String> clients = new ArrayList<>();//网关不校验此处的终端
    private List<String> urls = new ArrayList<>();//放行的url不再被安全框架拦截
    private List<String> swaggerProviders = new ArrayList<>();//不聚合swagger
}
