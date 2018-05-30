package cn.xz.dubbo.provider.impl;

import cn.xz.dubbo.api.CallbackService;
import java.util.function.Consumer;

/**
 * @author xizhou
 */
public class CallbackServiceImpl implements CallbackService {

    @Override
    public void callback(String msg, Consumer<String> callback) {
        callback.accept(msg+"---"+System.currentTimeMillis());
    }
}
