package cn.xz.dubbo.consumer.event;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xizhou
 */
@Slf4j
public class EventServiceNotifyImpl implements EventServiceNotify {

    @Override
    public void oninvoke() {
        log.warn("invoke:{}");
    }

    @Override
    public void onreturn(String ret) {
    log.warn("return:{}, {}", ret);
    }

    @Override
    public void onthrow(Throwable ex) {
        log.warn("throw:{}, {}", ex);
    }
}
