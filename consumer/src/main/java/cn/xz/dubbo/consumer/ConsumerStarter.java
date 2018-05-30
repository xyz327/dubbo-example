package cn.xz.dubbo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xizhou
 */

@SpringBootApplication
@ImportResource("classpath:META-INF/dubbo-consumer.xml")
@Slf4j
public class ConsumerStarter implements InitializingBean{
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
}