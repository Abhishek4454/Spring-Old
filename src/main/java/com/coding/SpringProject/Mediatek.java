package com.coding.SpringProject;

import org.springframework.stereotype.Component;

@Component
public class Mediatek implements MobileProcessor{

	public void process() {
		System.out.println("Meditek processor used here....");
		
	}

}
