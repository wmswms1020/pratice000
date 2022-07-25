package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 50000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		Goods computer = new Goods();
		computer.name = "삼보";
		computer.price = 500000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
	}

}
