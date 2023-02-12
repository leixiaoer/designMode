package cn.leo.pattern.prototypepattern.version2;

/**
 * 浅拷贝
 */
public class Client{

    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        // TODO Auto-generated method stub
        Sheep sheep = new Sheep("tom", 1, "白色");

        sheep.friend = new Sheep("jack", 2, "黑色"); //对于嵌套对象，相当于浅拷贝，并非实现了克隆

        Sheep sheep2 = (Sheep) sheep.clone(); //克隆
        Sheep sheep3 = (Sheep) sheep.clone(); //克隆
        Sheep sheep4 = (Sheep) sheep.clone(); //克隆
        Sheep sheep5 = (Sheep) sheep.clone(); //克隆

        sheep3.setAge(3);

        System.out.println(sheep == sheep2);
        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode() + " " + sheep2.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode()+ " " + sheep3.hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());
        System.out.println("sheep =" + sheep + "sheep.friend=" + sheep.friend.hashCode()+ " " + sheep.hashCode());
    }

}
