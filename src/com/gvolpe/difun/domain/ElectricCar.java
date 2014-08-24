package com.gvolpe.difun.domain;

import javax.inject.Inject;

public class ElectricCar implements Car {

	private Engine engine;
	
	@Inject
	public ElectricCar(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void move() {
		engine.start();
		System.out.println("Electric car move...");
		engine.stop();
	}

}
