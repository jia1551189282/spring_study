import com.jiajia.study.bean.Car;
import com.jiajia.study.bean.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zjiajia
 * @Date 2020/8/19 14:01
 */
public class IOCTest2 {


    private ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ioc2.xml");

    /**
     * 测试 引用类型不赋值的话，初始值都是null
     */
    @Test
    public void test1(){
        Object person4 = classPathXmlApplicationContext.getBean("person4");
        System.out.println(person4);
    }

    /**
     * 测试，默认给了值的也设置位null
     */
    @Test
    public void test2(){
        Object person4_2 = classPathXmlApplicationContext.getBean("person4_2");
        System.out.println(person4_2);

    }

    /**
     * 测试  为bean 中javaBean属性赋值  方式一
     */
    @Test
    public void test3(){
        Object person = classPathXmlApplicationContext.getBean("person4_3_1");
        System.out.println(person);
    }

    /**
     * 测试  为bean 中javaBean的属性赋值 方式二
     * 从bean中的属性,获取到car,和从容器获取car是同一个
     */
    @Test
    public void test4(){
        Person person_4_3_2 = (Person)classPathXmlApplicationContext.getBean("person4_3_2");
        System.out.println(person_4_3_2.getCar());

        Car car = (Car)classPathXmlApplicationContext.getBean("car");
        System.out.println(car == person_4_3_2.getCar());

    }

    /**
     * 测试 通过继承实现bean 配置的重用
     */
    @Test
    public void test6(){
        Person person6_2 =(Person) classPathXmlApplicationContext.getBean("person6_2");
        System.out.println(person6_2);
    }
}
