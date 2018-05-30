package cn.xz.dubbo.consumer.event;

/**
 * @author xizhou
 */
public interface EventServiceNotify {

    public void oninvoke();

    public void onreturn(String ret);

    public void onthrow(Throwable ex);
}
