package run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

// Эта аннотация говорит о том, что этот микросервис клиент Eureka. Есть и другие службы обнаружения
// consul , zookeeper, к примеру, @EnableDiscoveryClient будет говорить Spring что этот микросервис
// вообще работает со службами обнаружения, а конкретно @EnableEurekaClient даст эффект, что
// данный микросервис будет виден только службой Eureka. Эту аннотацию можно убрать...
@EnableEurekaClient

public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
