package com.space127.mvc.servlet3;

import org.apache.catalina.startup.Tomcat;

/**
 * @auther : Cenjinhao
 * @date : 2020/7/15 15:08
 * @desc :
 */
public class MyApplication {

    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        tomcat.addWebapp("/","E:\\project\\spring-demo\\");
        //Tomcat9需要加上这个配置，参考：https://stackoverflow.com/questions/48998387/code-works-with-embedded-apache-tomcat-8-but-not-with-9-whats-changed/49011424
        tomcat.getConnector(); // Trigger the creation of the default connector
        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
