package cn.leo.pattern.decoratorpattern.cafe;

import cn.leo.pattern.decoratorpattern.Drink;

/**
 * 咖啡总类
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        // TODO Auto-generated method stub
        return super.getPrice();
    }


}
