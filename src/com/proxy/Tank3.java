package com.proxy;

public class Tank3 implements Moveable {
	Tank t;
	
	public Tank3(Tank t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		t.move();
		long end = System.currentTimeMillis();
		System.out.println("time" + (end - start));
	}
}
