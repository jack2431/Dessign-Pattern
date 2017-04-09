package com.ch1.strategy;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();		

		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		modelDuck.performQuack();
	}

}
