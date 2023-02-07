package com.coding.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        
    	Vehicle v= (Vehicle) context.getBean("vehicle");
    	v.drive();
//        Car car= new Car();
//        car.drive();
    }
}
