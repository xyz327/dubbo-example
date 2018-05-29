# dubbo:protocol
> 服务提供者协议配置。对应的配置类： `com.alibaba.dubbo.config.ProtocolConfig`。

***如果需要支持多协议，可以声明多个 `<dubbo:protocol>` 标签，并在 `<dubbo:service>` 中通过 protocol 属性指定使用的协议。***


|属性|对应url参数名|类型|是否必填|缺省值|作用|说明|
|---|---|---|---|---|---|---|
|id| |string|	可选	|dubbo|	配置关联|	协议BeanId，可以在<dubbo:service protocol="">中引用此ID，如果ID不填，缺省和name属性值一样，重复则在name后加序号。|
|name|<protocol>|	string|	必填|	dubbo|	性能调优|	协议名称|
|port|	<port>|	int|	可选	|dubbo协议缺省端口为20880，rmi协议缺省端口为1099，http和hessian协议缺省端口为80；如果配置为-1 或者 没有配置port，则会分配一个没有被占用的端口。Dubbo 2.4.0+，分配的端口在协议缺省端口的基础上增长，确保端口段可控。|	服务发现|	服务端口|