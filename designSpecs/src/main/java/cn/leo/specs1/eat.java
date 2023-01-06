package cn.leo.specs1;

/*
 *文件名: eat
 *创建者: leo
 *创建时间:2022/7/26 13:14
 *描述: TODO
 */
public class eat {

    private human human;

    public void setHuman(human human) {
        this.human = human;
    }

    public void eat(){
        human.eat();
    }
}
