import com.maven.springboot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.jms.Queue;

/**
 * Springboot Junit测试
 * Created by Administrator on 2019/4/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ErpTest {

    @Resource
    private Queue queue;

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Test
    public void testQueue(){
        this.jmsMessagingTemplate.convertAndSend(this.queue,"我是一个好消息：）");
    }
}
