package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;



public class test {


    public static void main(String[] args) throws Exception {
        //加载配置文件

        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        //通过 配置文件中  bean 的  id 获得对象
        person p = context.getBean("person", person.class);
        p.hello();
        Class  clazz = Class.forName("demo.student");
        student stu = (student) clazz.newInstance();
        stu.sout();
        System.out.println("21312");

    }
}
