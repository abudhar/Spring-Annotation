package io.github.abudhar.spring_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfigApp {
	@Autowired
	private ConfigPropAnno properties;
	
	public void display(){
		System.out.println();
		System.out.println();
		System.out.println("------DISPLAY METHOD--------");
		System.out.println(properties.getName());
		System.out.println(properties.getDesc());
		System.out.println(properties.getUploadDir());
		System.out.println(properties.getSecurity().getUser());
		System.out.println(properties.getSecurity().getPassword());
		System.out.println(properties.getSecurity().getPermission());
		System.out.println(properties.getSecurity().getRoles());
		System.out.println("------DISPLAY METHOD--------");
		System.out.println();
		System.out.println();
	}
}
