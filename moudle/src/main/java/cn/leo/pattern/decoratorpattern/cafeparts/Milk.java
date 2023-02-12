package cn.leo.pattern.decoratorpattern.cafeparts;

import cn.leo.pattern.decoratorpattern.Drink;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		setDes(" 牛奶 ");
		setPrice(2.0f);
	}

}
