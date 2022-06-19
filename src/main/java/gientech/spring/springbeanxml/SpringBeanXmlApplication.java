package gientech.spring.springbeanxml;

import gientech.spring.springbeanxml.model.User;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBeanXmlApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBeanXmlApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> favorites = new ArrayList<>();
        favorites.add("run");
        favorites.add("sing");
        User user = new User("zhangsan", 18, favorites);
        System.out.println(user.toString());

        User user1 = new User();
        user1.setName("lisi");
        user1.setAge(19);
        user1.setFavorites(favorites);
        System.out.println(user1.toString());

        ApplicationContext ac = new ClassPathXmlApplicationContext("config/ApplicationContext.xml");
        // 通过构造器注入
        System.out.println(ac.getBean("user"));
        // 通过setter注入
        System.out.println(ac.getBean("user1"));
    }
}
