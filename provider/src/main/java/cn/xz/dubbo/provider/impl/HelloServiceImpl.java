package cn.xz.dubbo.provider.impl;

import cn.xz.dubbo.api.HelloService;

/**
 * @author xizhou
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello dubbo";
    }
}
