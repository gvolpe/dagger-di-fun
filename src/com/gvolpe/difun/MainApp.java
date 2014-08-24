package com.gvolpe.difun;

import com.gvolpe.difun.domain.Car;
import com.gvolpe.difun.ioc.CarModule;

import dagger.ObjectGraph;

public class MainApp {

	public static void main(String[] args) {
		ObjectGraph graph = ObjectGraph.create(new CarModule());
		Car car = graph.get(Car.class);
		car.move();
	}

}
