package com.coding.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	@Qualifier("mediatek")
	private MobileProcessor processor;

	public MobileProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}
	
	public void print() {
		processor.process();
 	}
	
	
	
}
