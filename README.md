# dubbo-example
dubbo example

由于要切换到apache的原因 dubbo的spring的xml文件的xsd schema属性有所变化,配置不对时spring启动时会报错  
```
BeanDefinitionParsingException: Configuration problem: Unable to locate Spring NamespaceHandler for XML schema namespace [http://dubbo.apache.org/schema/dubbo]
```
> 2.6.1  
```xml
<beans xmlns:dubbo="http://code.alibabatech.com/schema/dubbo"
xsi:schemaLocation="http://code.alibabatech.com/schema/dubbo http://code.alibabatech.com/schema/dubbo/dubbo.xsd"
>
</beans>
```
> 2.6.1之后
```xml
<beans xmlns:dubbo="http://dubbo.apache.org/schema/dubbo"
xsi:schemaLocation="http://dubbo.apache.org/schema/dubbo http://dubbo.apache.org/schema/dubbo/dubbo.xsd"
>
</beans>
```

## xml 属性
 
 |标签名|说明|
 |:----:|:---:|
 |[dubbo:application](./doc/application.md) | 配置当前应用信息，不管该应用是提供者还是消费者|   
 |[dubbo:protocol](./doc/protocol.md) | 配置提供服务的协议信息，协议由提供方指定，消费方被动接受|   
 |[dubbo:registry](./doc/registry.md)| 用于配置连接注册中心相关信息|
 
 
## 方法参数回调
> 接口
```java
public interface CallbackService {
    void callback(String mag, Consumer<String> callback);
}
```
> 服务提供者
```java
public class CallbackServiceImpl implements CallbackService {
    @Override
    public void callback(String msg, Consumer<String> callback) {
        callback.accept(msg+"---"+System.currentTimeMillis());
    }
}
```
```xml
  <bean id="callbackService" class="dubbo.provider.impl.CallbackServiceImpl"/>
  <dubbo:service interface="cn.xz.dubbo.api.CallbackService" ref="callbackService" callbacks="1000">
    <dubbo:method name="callback">
      <dubbo:argument index="1" callback="true"/>
      <!--也可以通过指定类型的方式-->
      <!--<dubbo:argument type="java.util.function.Consumer" callback="true" />-->
    </dubbo:method>
  </dubbo:service>
```
> 服务消费者
```xml
<dubbo:reference id="callbackService" interface="cn.xz.dubbo.api.CallbackService"/>
```