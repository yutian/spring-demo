package com.space127.mvc.servlet3.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @auther : Cenjinhao
 * @date : 2020/7/15 14:56
 * @desc :
 */
public class WebServletInitializer implements WebApplicationInitializer {


    @Override
    public void onStartup(ServletContext servletContext) {
        System.out.println("--------init----------------");
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfig.class);
//        ctx.refresh();

        DispatcherServlet dispatcherServlet = new DispatcherServlet(ctx);
        ServletRegistration.Dynamic registration = servletContext.addServlet("app",dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/app/*");
    }
}
