package cn.xz.dubbo.consumer;

import cn.xz.dubbo.api.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xizhou
 */

@SpringBootApplication
@ImportResource("META-INF/dubbo-consumer.xml")
@Slf4j
public class ConsumerStarter implements InitializingBean{
    @Autowired
    HelloService helloService;
    public static void main(String[] args){
        SpringApplication.run(ConsumerStarter.class, args);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        try {
            log.warn("");
        //    invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void invoke() {
        String hello = helloService.hello();
        log.warn("hello service: {}", hello);
    }
}