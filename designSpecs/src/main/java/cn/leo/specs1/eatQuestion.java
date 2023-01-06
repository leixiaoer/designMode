package cn.leo.specs1;

/*
 *文件名: eatQuestion
 *创建者: leo
 *创建时间:2022/7/26 13:14
 *描述: 开闭原则，可通过Java的继承和多态实现，在不改变代码的情况下，简单的通过子类重写方法实现不同业务需求。
 */
public class eatQuestion {
    

    public static void main(String[] args) {
        eat eat = new eat();

        eat.setHuman(new human());
        eat.eat();
        //多态方式
        eat.setHuman(new Asia());
        eat.eat();

        eat.setHuman(new Europe());
        eat.eat();
    }
}
