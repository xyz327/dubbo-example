package cn.xz.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xizhou
 */
@SpringBootApplication
@ImportResource("META-INF/dubbo-provider.xml")
public class ProviderStarter {
    public static void main(String[] args){
        SpringApplication.run(ProviderStarter.class, args);
    }
}
