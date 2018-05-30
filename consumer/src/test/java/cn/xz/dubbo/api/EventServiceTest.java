package cn.xz.dubbo.api;

import cn.xz.dubbo.api.event.EventService;
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
public class EventServiceTest {

    @Autowired
    EventService eventService;
    @org.junit.Test
    public void callback() throws Exception {
        String s = eventService.testEvent();
        log.warn("test::::{}", s);
    }
}