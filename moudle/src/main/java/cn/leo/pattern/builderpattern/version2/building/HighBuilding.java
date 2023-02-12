package cn.leo.pattern.builderpattern.version2.building;

import cn.leo.pattern.builderpattern.version2.po.House;

/**
 * 高楼
 */
public class HighBuilding extends HouseBuilder {


    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println(" 高楼的打地基100米 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(" 高楼的砌墙20cm ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(" 高楼的透明屋顶 ");
    }

    @Override
    public House buildHouse() {
        house.setWall("高楼");
        return house;
    }

}
