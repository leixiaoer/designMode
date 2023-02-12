package cn.leo.pattern.builderpattern.version2;

import cn.leo.pattern.builderpattern.version2.building.HouseBuilder;
import cn.leo.pattern.builderpattern.version2.po.House;

/**
 * 指挥者，这里去指定制作流程，返回产品
 * 由之前对象控制顺序变成由
 */
public class HouseDirector {

    HouseBuilder houseBuilder;

    //构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();

        //这里能进行相关业务操作，将
        House house = houseBuilder.buildHouse();
        return house;
    }


}
