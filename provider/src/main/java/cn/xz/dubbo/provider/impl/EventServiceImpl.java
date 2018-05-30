package cn.xz.dubbo.provider.impl;

import cn.xz.dubbo.api.CallbackService;
import cn.xz.dubbo.api.event.EventService;
import java.util.function.Consumer;

/**
 * @author xizhou
 */
public class EventServiceImpl implements EventService {


    @Override
    public String testEvent() {
        return "return ----";

    }
}
