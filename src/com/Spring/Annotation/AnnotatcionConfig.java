package com.Spring.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.Spring.Annotation")
public class AnnotatcionConfig 
{
	@Bean
	public Student student()
	{
		//Student stud=new Student();
		//return stud;
		 //or
		
		return new Student();
	}
	
	@Bean							//default
	public AnnotationClass ac() //method name : ac - bean_id
	{
		//AnnotationClass ac=new AnnotationClass(new Student());
		AnnotationClass ac1=new AnnotationClass(student());
		return ac1;
	}
	/*
	 @Bean(name="annotationBean")			//change or rename default name
	public AnnotationClass ac()
	{
		AnnotationClass ac1=new AnnotationClass();
		return ac1;
	}
	 */
	
	/*
	 @Bean(name={"annotationBean","AnotherName"})		//calling using multiple name
	public AnnotationClass ac()
	{
		AnnotationClass ac1=new AnnotationClass();
		return ac1;
	}
	 */

}
