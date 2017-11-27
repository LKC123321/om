package com.example.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author HASEE
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person implements Serializable {
private static final long serialVersionUID = 4464233896798170487L;
private String name;
private String age;
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}


}
