package cn.leo.pattern.factorypattern.absfactory.pizzastore.order;


import cn.leo.pattern.factorypattern.absfactory.pizzastore.pizza.Pizza;

//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
	//让下面的工厂子类来 具体实现
	Pizza createPizza(String orderType);
}
