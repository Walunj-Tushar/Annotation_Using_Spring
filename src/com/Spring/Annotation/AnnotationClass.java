package com.Spring.Annotation;

import org.springframework.stereotype.Component;

//@Component("ac")
public class AnnotationClass 
{
	//dependancy injection
		private Student stud;
		
	public AnnotationClass(Student stud)
	{
		this.stud = stud;
	}

	public void test()
	{
		stud.StudentInfo();
		System.out.println("calling fron test class");
	}
	
}
