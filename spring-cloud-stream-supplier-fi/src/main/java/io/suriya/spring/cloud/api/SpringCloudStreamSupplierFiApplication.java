package io.suriya.spring.cloud.api;

import java.util.function.Consumer;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudStreamSupplierFiApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(SpringCloudStreamSupplierFiApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamSupplierFiApplication.class, args);
	}
	
	//transformer-in-0
	//transformer-out-0
	@Bean
	public Function<String,String> transformer(){
		return value -> value.toUpperCase();
	}
	
	//data-in-0
	//data-out-0
	@Bean
	public Function<String,String> data(){
		return value -> value;
	}

	//consumer-in-0
	@Bean
	public Consumer<String> consumer(){
		return value -> log.info("Value is {}",value);
	}
}
