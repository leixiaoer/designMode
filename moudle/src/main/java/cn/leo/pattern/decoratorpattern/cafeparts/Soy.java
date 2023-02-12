package cn.leo.pattern.decoratorpattern.cafeparts;

import cn.leo.pattern.decoratorpattern.Drink;

public class Soy extends Decorator {

	public Soy(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		setDes(" 豆浆  ");
		setPrice(1.5f);
	}

}
