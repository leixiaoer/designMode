package cn.leo.pattern.factorypattern.factorymethod.pizzastore.order;


import cn.leo.pattern.factorypattern.factorymethod.pizzastore.pizza.LDCheesePizza;
import cn.leo.pattern.factorypattern.factorymethod.pizzastore.pizza.LDPepperPizza;
import cn.leo.pattern.factorypattern.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
