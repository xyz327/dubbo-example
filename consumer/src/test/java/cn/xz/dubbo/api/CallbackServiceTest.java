package cn.xz.dubbo.api;

import cn.xz.dubbo.consumer.ConsumerStarter;
import java.util.function.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xizhou
 */
@SpringBootTest(classes = ConsumerStarter.class)
@RunWith(SpringRunner.class)
@Slf4j
public class CallbackServiceTest {

    @Autowired
    CallbackService callbackService;
    @org.junit.Test
    public void callback() throws Exception {
        callbackService.callback("hello callback", new Consumer<String>() {
            @Override
            public void accept(String msg) {
                log.warn("in callback: {}", msg);
            }
        });
    }
}