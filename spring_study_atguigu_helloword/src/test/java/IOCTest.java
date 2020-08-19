import com.jiajia.study.bean.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zjiajia
 * @Date 2020/8/18 20:56
 */


public class IOCTest {

    /**
     * 测试 从容器中获取bean 的实例
     */
    @Test
    public void testIoc(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = (Person)classPathXmlApplicationContext.getBean("person");
        System.out.println(person);
    }

    /**
     * 测试 根据bean类型从 容器中获取实例
     * 如果容器中含有多个该类型的 实例，就会报错
     */
    @Test
    public void testIoc2(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        Person bean = classPathXmlApplicationContext.getBean(Person.class);
        System.out.println(bean);
    }

    /**
     * 测试 通过构造方法来给bean 赋值
     */
    @Test
    public void testIoc3(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        Object person3 = classPathXmlApplicationContext.getBean("person3");
        System.out.println(person3);
    }
}
