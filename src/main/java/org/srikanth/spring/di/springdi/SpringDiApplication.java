package org.srikanth.spring.di.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.srikanth.spring.di.springdi.controllers.ConstructorInjectedController;
import org.srikanth.spring.di.springdi.controllers.GetterInjectedController;
import org.srikanth.spring.di.springdi.controllers.MyController;
import org.srikanth.spring.di.springdi.controllers.PropertyInjectedController;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
        //GetterInjectedController controller = (GetterInjectedController)ctx.getBean("getterInjectedController");

        System.out.println(ctx.getBean(MyController.class).hello());

        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());

    }
}
