package com.heyx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication   启动应用程序
 * @SpringBootConfiguration 标注在类上表示SpringBoot配置类
 * @Configure 配置类
 *
 * @EnableAutoConfiguration 开启自动配置，SpringBoot帮助我们自动配置
 * @AutoConfigurationPackage 自动配置包
 *
 * @Import(AutoConfigurationPackages.Registrar.class)
 * Spring底层注解，给容器导入一个组件，导入组件由
 *      AutoConfigurationPackages.Registrar.class所在包及下面子包里所有的组建扫描到Spring容器;
 *
 * @Import(AutoConfigurationImportSelector.class)
 * 导入哪些组件的选择器;将所有需要导入的组件以全类名的方式返回;这些组件会被放入容器中；
 * 会给容器中导入非常多的自动配置类（xxx AutoConfiguration）;就是给容器中导入这个场景需要的所有组件，并配置好；
 * 免去我们手动编写配置注入功能组件等工作；
 *
 * @ImportResource({"classpath:beans.xml"})导入Spring配置文件
 *
 */

//@ImportResource({"classpath:beans.xml"})

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
