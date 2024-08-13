import com.lee.spring6.iocxml.bean.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    //创建Logger对象
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {

    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //根据id获取bean
        User user = (User) context.getBean("user");
        System.out.println("根据id获取user：" + user);

        //根据type获取bean
        User user2 = context.getBean(User.class);
        System.out.println("根据类型获取bean：" + user2);

        //根据id和type获取bean
        User user3 = context.getBean("user", User.class);
        System.out.println("根据id和类型获取bean：" + user3);
    }
}
