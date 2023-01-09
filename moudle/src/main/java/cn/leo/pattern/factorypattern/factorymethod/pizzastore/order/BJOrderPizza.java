package cn.leo.pattern.factorypattern.factorymethod.pizzastore.order;


import cn.leo.pattern.factorypattern.factorymethod.pizzastore.pizza.BJCheesePizza;
import cn.leo.pattern.factorypattern.factorymethod.pizzastore.pizza.BJPepperPizza;
import cn.leo.pattern.factorypattern.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
