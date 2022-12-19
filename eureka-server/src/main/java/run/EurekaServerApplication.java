package run;
// нужно помещать SpringBootApplication в пакеты, иначе будет ошибка
// ** WARNING ** : Your ApplicationContext is unlikely to start due to a `@ComponentScan` of the default package.
// Когда класс не включает объявление пакета, считается, что он находится в «пакете по умолчанию».
// Использование «пакета по умолчанию» обычно не рекомендуется, и его следует избегать.
// Это может вызвать определенные проблемы для приложений Spring Boot,
// использующих аннотации @ComponentScan, @EntityScan или @SpringBootApplication,
// поскольку будет прочитан каждый класс из каждого jar-файла.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}