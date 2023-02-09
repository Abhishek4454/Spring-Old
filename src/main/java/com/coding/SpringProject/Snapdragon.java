package com.coding.SpringProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements MobileProcessor{

	public void process() {
		System.out.println("Snapdragon processor used here....");
		
	}

}
