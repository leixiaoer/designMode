package cn.leo.pattern.decoratorpattern.cafeparts;

import cn.leo.pattern.decoratorpattern.Drink;

/**
 * 装饰者，用来装饰咖啡，咖啡的配料类父类
 * 装饰者类用来进行聚合咖啡和配料
 */
public class Decorator extends Drink {

	private Drink obj;
	
	public Decorator(Drink obj) { //组合
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		// getPrice 自己价格(本杯咖啡) + 后面添加的
		return super.getPrice() + obj.cost();
	}
	
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		// obj.getDes() 输出被装饰者的信息
		return super.des + " " + super.getPrice() + " && " + obj.getDes();
	}
	
	

}
