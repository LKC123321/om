package com.example;


import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.example.pojo.Person;
/**
 * {"name":邱张华,"age":47}
 * Person [name=zs, age=1]
 * @author HASEE
 *
 */

@Component
public class MyObjectMapper{
	//对象	to	json
	public String writeValueAsString(Person stu) {
		String name = stu.getName();
		String age = stu.getAge();
		return "{\"name\":"+name+",\"age\":"+age+"}";
	}
	//json	to 	对象
	public Person readValue(String json, Class<Person> class1){
		String name = "";
		String age = "";
		String str = json.substring(1, json.length()-1);
		String[] strs=str.split(",");
		String[] strs1 = strs[0].split(":");
		String[] strs2 = strs[1].split(":");
			name = strs1[1];
			age = strs2[1];
		Person person = new Person(name, age);
		return person;
	}
}
