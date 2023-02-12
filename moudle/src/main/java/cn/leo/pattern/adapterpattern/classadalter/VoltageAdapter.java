package cn.leo.pattern.adapterpattern.classadalter;

//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		//获取到220V电压，调用的父类的方法
		int srcV = super.output220V();
		int dstV = srcV / 2 ; //转成 5v
		return dstV;
	}

}
