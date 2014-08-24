package com.gvolpe.difun.domain;

import javax.inject.Inject;

public class DieselEngine implements Engine {

	@Inject
	public DieselEngine() {
	}
	
	@Override
	public void start() {
		System.out.println("Starting diesel engine...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping diesel engine...");
	}
	
}
