package com.coding.SpringProject;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void drive() {
		System.out.println("Car is working fine .....");
	}
}
