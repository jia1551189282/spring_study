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
}
