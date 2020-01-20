package com.example.bootorderserviceprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: BootOrderServiceProviderApplication
 * @Description: 启动类
 * 		引入		1）dubbo-start
 * 				2）dubbo其他依赖
 * 		@EnableDubbo：开启注解的dubbo服务
 * @author: YangXinLei
 * @date: 2020年1月20日 上午10:34:52
 */
@EnableDubbo      //开启基于注解的dubbo功能
@SpringBootApplication
public class BootOrderServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootOrderServiceProviderApplication.class, args);
    }

}
