package com.springbasics.springbasics.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//(3) Use @Component and @Autowired annotations to in Loosely Coupled code for dependency management
//
//(4) Get a Spring Bean from application context and display its properties.
//
//(5) Demonstrate how you will resolve ambiguity while auto wiring bean (Hint : @Primary)
//
//(6) Perform Constructor Injection in a Spring Bean
interface Journey {
	void startJourneyBy();
}
@Primary
@Component
class Car implements Journey {


	public void startJourneyBy() {
		System.out.println("Journey by car");

	}

}
@Component
class Bike implements Journey{


	public void startJourneyBy() {
		System.out.println("Journey by bike");

	}
}
@Component
@SpringBootApplication
public class SpringBasicsApplication {
	@Autowired
	Journey journey;
	SpringBasicsApplication (Journey journey) //constructor injection
	{

		this.journey=journey;
	}
	public void run()
	{
		journey.startJourneyBy();
	}

	public static void main(String[] args) {
		//SpringBasicsApplication springBasicsApplication=new SpringBasicsApplication(new Bike());

	ApplicationContext applicationContext= SpringApplication.run(SpringBasicsApplication.class, args);
		SpringBasicsApplication springBasicsApplication=applicationContext.getBean(SpringBasicsApplication.class);
		springBasicsApplication.run();
	}

}
