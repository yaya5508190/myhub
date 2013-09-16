package com.proxy;

public class Tank2 extends Tank{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		super.move();
		long end = System.currentTimeMillis();
		System.out.println("time" + (end - start));
	}

}
