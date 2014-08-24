package com.gvolpe.difun.domain;

public class ElectricEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Starting electric engine...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping electric engine...");
	}

}
