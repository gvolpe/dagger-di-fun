package com.gvolpe.difun.ioc;

import com.gvolpe.difun.domain.Car;
import com.gvolpe.difun.domain.ElectricCar;
import com.gvolpe.difun.domain.ElectricEngine;
import com.gvolpe.difun.domain.Engine;

import dagger.Module;
import dagger.Provides;

@Module(injects = Car.class, library = true)
public class CarModule {

	@Provides
	Engine provideEngine() {
		return new ElectricEngine();
	}

	@Provides
	Car provideCar(ElectricCar car) {
		return car;
	}

}
