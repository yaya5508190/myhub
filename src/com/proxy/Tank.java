package com.proxy;

import java.util.Random;

public class Tank implements Moveable {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Tank Moving...");
		System.out.println("my seconde linux commit");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
