# dubbo:registry
> 注册中心配置。对应的配置类： `com.alibaba.dubbo.config.RegistryConfig`。

***同时如果有多个不同的注册中心，可以声明多个 `<dubbo:registry>` 标签，并在 `<dubbo:service>` 或 `<dubbo:reference>` 的 registry 属性指定使用的注册中心。***

|属性|对应url参数名|类型|是否必填|缺省值|作用|说明|
|---|---|---|---|---|---|---|
|id| |string|	可选|	|	配置关联|	注册中心引用BeanId，可以在`<dubbo:service registry="">`或`<dubbo:reference registry="">`中引用此ID|
|address|	`<host:port>`|	string|	必填|	 	|服务发现|	注册中心服务器地址，如果地址没有端口缺省为9090，同一集群内的多个地址用逗号分隔，如：ip:port,ip:port，不同集群的注册中心，请配置多个`<dubbo:registry>`标签|
|protocol|	`<protocol>`|	string|	可选	|dubbo|	服务发现|	注同中心地址协议，支持dubbo, http, local三种协议，分别表示，dubbo地址，http地址，本地注册中心|
|port|	`<port>`|	int|	可选	|9090|	服务发现|	注册中心缺省端口，当address没有带端口时使用此端口做为缺省值|
|username|	`<username>`|	string|	可选|		|服务治理|	登录注册中心用户名，如果注册中心不需要验证可不填|
|password|	`<password>`|	string|	可选|		|服务治理|	登录注册中心密码，如果注册中心不需要验证可不填|
|transport|	registry.transporter|	string|	可选|	netty|	性能调优|	网络传输方式，可选mina,netty|
|timeout|	registry.timeout|	int|	可选|	5000|	性能调优|	注册中心请求超时时间(毫秒)|
|session|	registry.session|	int|	可选|	60000|	性能调优|	注册中心会话超时时间(毫秒)，用于检测提供者非正常断线后的脏数据，比如用心跳检测的实现，此时间就是心跳间隔，不同注册中心实现不一样。|
|file|	registry.file|	string|	可选|		|服务治理	|使用文件缓存注册中心地址列表及服务提供者列表，应用重启时将基于此文件恢复，注意：两个注册中心不能使用同一文件存储|
|wait|	registry.wait|	int|	可选|	0|	性能调优|	停止时等待通知完成时间(毫秒)|
|check|	check|	boolean|	可选|	true|	服务治理|	注册中心不存在时，是否报错|
|register|	register|	boolean|	可选	|true|	服务治理|	是否向此注册中心注册服务，如果设为false，将只订阅，不注册|
|subscribe|	subscribe|	boolean|	可选|	true|	服务治理|	是否向此注册中心订阅服务，如果设为false，将只注册，不订阅|
|dynamic|	dynamic|	boolean|	可选|	true|	服务治理|	服务是否动态注册，如果设为false，注册后将显示后disable状态，需人工启用，并且服务提供者停止时，也不会自动取消册，需人工禁用。|
