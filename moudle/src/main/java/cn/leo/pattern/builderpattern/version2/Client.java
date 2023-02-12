package cn.leo.pattern.builderpattern.version2;

import cn.leo.pattern.builderpattern.version2.building.CommonHouseBuilding;
import cn.leo.pattern.builderpattern.version2.building.HighBuilding;
import cn.leo.pattern.builderpattern.version2.po.House;

/**
 * 加入缓存层，增加程序的扩展
 */
public class Client {
    public static void main(String[] args) {

        //盖普通房子
        CommonHouseBuilding commonHouseBuilding = new CommonHouseBuilding();

        //准备创建房子的指挥者	manager 将普通房子丢给建造者
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilding);

        //完成盖房子，返回产品(普通房子)
        House house = houseDirector.constructHouse();
        System.out.println(house.toString());


        System.out.println("--------------------------");
        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        //完成盖房子，返回产品(高楼)
        House house1 = houseDirector.constructHouse();
        System.out.println(house1);


    }
}
