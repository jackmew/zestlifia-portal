package org.zestlifia.zPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Hello world!
 *
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@Controller
public class App extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        System.out.println( "zestlifia portal main !" );

        SpringApplication.run(App.class, args);
    }
    // static resources
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/zestlifia-portal/**").addResourceLocations("/WEB-INF/app/");
    }
    @RequestMapping("/")
    public String start(){
        System.out.println("zestlifia portal is running");
        return "redirect:/zestlifia-portal/portal/index.html";
    }
}
