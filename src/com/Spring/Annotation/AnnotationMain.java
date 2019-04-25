package com.Spring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain
{

	public static void main(String[] args) 
	{
		//call or create bead_id/object using xml
		//ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		
		//claling from configuration file or class
		ApplicationContext context=new AnnotationConfigApplicationContext(AnnotatcionConfig.class);
		System.out.println("Config Loaded");
		
		
		//call or create bead_id/object from perticular Class
		AnnotationClass ac=context.getBean("ac",AnnotationClass.class);	
		
		//call or create bead_id/object in configuration Class
		//AnnotationClass ac=context.getBean("annotationBean",AnnotationClass.class);
		System.out.println("The College Created By Spring : "+ac);
		ac.test();
		
	}

}
