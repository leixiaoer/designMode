package cn.leo.pattern.factorypattern.factorymethod.pizzastore.order;

/**
 * 工厂方法模式
 */
public class PizzaStore {

	public static void main(String[] args) {
		String loc = "bj";
		if (loc.equals("bj")) {
			//创建北京口味的各种Pizza

			/**
			 * new 子类会自动调用父类的构造器
			 */
			new BJOrderPizza();
		} else {
			//创建伦敦口味的各种Pizza
			new LDOrderPizza();
		}
		// TODO Auto-generated method stub
	}

}
