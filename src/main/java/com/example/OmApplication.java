package com.example;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.pojo.Person;
import com.fasterxml.jackson.core.JsonProcessingException;

@SpringBootApplication
public class OmApplication {

	@Autowired
	public static  MyObjectMapper myobjectMapper;
	public static void main(String[] args) throws JsonProcessingException, IOException {
		ApplicationContext context = SpringApplication.run(OmApplication.class, args);
		myobjectMapper = context.getBean(MyObjectMapper.class);
       System.out.println(myobjectMapper);
       Person  me = new Person();
       me.setAge("47");
       me.setName("邱张华");
       System.out.println(myobjectMapper.writeValueAsString(me));
       
       String json = "{\"name\":\"Daniel\",\"age\":22}";
       
       Person p2 = myobjectMapper.readValue(json, Person.class);
	  System.out.println(p2);
	}
}
