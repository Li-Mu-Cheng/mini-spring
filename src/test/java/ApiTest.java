import bean.UserService;
import org.example.BeanDefinition;
import org.example.BeanFactory;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void testBeanFactory(){

        // 初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("UserService" , beanDefinition);

        // 获取 bean
        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();
    }
}
