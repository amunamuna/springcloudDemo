

## Eureka 注册中心

注册中心 eureka-server：
 http://127.0.0.1:8761/

## 负载均衡

### Ribbon 

Ribbon 是使用 restTemplate 进行调用，并进行客户端负载均衡。

### Feign 

Feign 是对 Ribbon的封装，使用注解的方式，调用起来更简单，主流使用。
@FeignClient(value = "PRODUCT-DATA-SERVICE")

视图微服务 product-view-service-feign：
 http://127.0.0.1:8012/products

数据微服务 product-data-service
 http://127.0.0.1:8001/products ，http://127.0.0.1:8002/products

## zipkin 服务链路追踪服务器

视图微服务 product-view-service-feign

链路追踪服务器 zipkin
 http://localhost:9411/zipkin/dependency/ 

### 配置服务器

配置服务器 config-server
 http://localhost:8030/version/dev

## 消息总线bus

视图微服务 product-view-service-feign

RabbitMQ :
管理界面：
http://127.0.0.1:15672/
账号： guest
密码： guest

刷新git 里的版本号
运行 FreshConfigUtil， 使用 post 的方式访问 http://localhost:8012/actuator/bus-refresh

## 断路器 Hystrix 

视图微服务 product-view-service-feign

@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)

监控地址
http://localhost:8020/hystrix

## 网关Zuul

访问只需要记住网关的地址和端口号就行。

http://localhost:8040/api-data/products

http://localhost:8040/api-view/products