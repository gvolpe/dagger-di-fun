package com.gvolpe.difun.domain;

import javax.inject.Inject;

public class DieselCar implements Car {

	private Engine engine;
	
	@Inject
	public DieselCar(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void move() {
		engine.start();
		System.out.println("Diesel car move...");
		engine.stop();
	}

}
