package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class test {


    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        //通过 配置文件中  bean 的  id 获得对象
        person p = context.getBean("person", person.class);
        p.hello();

    }
}
