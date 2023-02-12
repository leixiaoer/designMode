package cn.leo.pattern.builderpattern.version2.building;

import cn.leo.pattern.builderpattern.version2.po.House;

/**
 * 普通房
 */
public class CommonHouseBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子打地基5米 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子砌墙10cm ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子屋顶 ");
    }

    public House buildHouse() {
        house.setWall("普通房子");
        return house;
    }

}
