package cn.xz.dubbo.api;

import java.util.function.Consumer;

/**
 * 参数回调
 * @author xizhou
 */
public interface CallbackService {
    void callback(String mag, Consumer<String> callback);
}
