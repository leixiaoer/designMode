package cn.leo.pattern.factorypattern.simplefactory.pizzastore.pizza;

//将Pizza 类做成抽象
public abstract class Pizza {

    protected String name; //名字

    //准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();

    //烤 烤一个圆
    public void bake() {
        System.out.println(name + " baking;");
    }

    //切割    切割成三角形
    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
