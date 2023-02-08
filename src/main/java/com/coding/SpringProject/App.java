package com.coding.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        
//    	Vehicle v= (Vehicle) context.getBean("bike");
    	Vehicle v1= (Vehicle) context.getBean("car");
//
//    	v.drive();
    	v1.drive();
//        Car car= new Car();
//        car.drive();
//    	Tyre t= (Tyre) context.getBean("tyre");
//    	System.out.println(t);
    }
}
