package com.demo.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Config 
{

	public Book getObject(int option)
	{
		String genres;;
        if(option==1)
        {
        	genres="fantasy";
        }
        else if(option==2)
        {
        	genres="mystery";
        }
        else if(option==3)
        {
        	genres="fiction";
        }
        else
        {
        	genres="incorrectOption";
        }
        
        ApplicationContext context=new ClassPathXmlApplicationContext("DependencyInjection.xml");
		return((Book)context.getBean(genres));
	}
}
