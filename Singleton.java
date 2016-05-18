package com.xlm.designpatten;

public class Singleton {

	public static void main(String[] args) {
		Form1 f11 = Form1.getInstance();
		Form1 f12 = Form1.getInstance();
		if (f11 == f12) {
			System.out.println("懒汉单例，两个对象一样");
		} else {
			System.out.println("懒汉单例，两个对象不一样");
		}
		Form2 f21 = Form2.getInstance();
		Form2 f22 = Form2.getInstance();
		if (f21 == f22) {
			System.out.println("饿汉单例，两个对象一样");
		} else {
			System.out.println("饿汉单例，两个对象不一样");
		}
	}
}

// 懒汉 应该锁住
class Form1 {
	private static Form1 form1;

	private Form1() {}

	public static synchronized Form1 getInstance() {
		if (form1 == null)
			form1 = new Form1();
		return form1;
	}
}

// 饿汉
class Form2 {
	private static Form2 form2 = new Form2();

	private Form2() {}

	public static Form2 getInstance() {
		return form2;
	}
}