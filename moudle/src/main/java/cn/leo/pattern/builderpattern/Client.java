package cn.leo.pattern.builderpattern;

/**
 * 简单的建造者模式，通过builder方法，实现方法的顺序调用；
 */
public class Client {

	public static void main(String[] args) {
		CommonHouse commonHouse = new CommonHouse();
		commonHouse.build();
	}

}
