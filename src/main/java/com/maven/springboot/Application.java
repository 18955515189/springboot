package com.maven.springboot;

import com.maven.springboot.servlet.InfoServlet;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

/**
 * Created by Administrator on 2019/4/13.
 */
@SpringBootApplication
@EnableCaching
//@ServletComponentScan
public class Application extends SpringBootServletInitializer {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("itcast.queue");
    }

    @Bean
    public ServletRegistrationBean infoServletBean(){
        return new ServletRegistrationBean(new InfoServlet(),"/servlet/info");
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}