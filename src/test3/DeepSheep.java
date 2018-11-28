package test3;

import test2.Data;

/**
 * 深度克隆
 * @author Administrator
 *
 */
public class DeepSheep implements Cloneable{
	private String name;
	private int age;
	private Data d;
	public DeepSheep(String name, int age, Data d) {
		super();
		this.name = name;
		this.age = age;
		this.d = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Data getD() {
		return d;
	}
	public void setD(Data d) {
		this.d = d;
	}
	@Override
	protected DeepSheep clone() throws CloneNotSupportedException {
		DeepSheep sheep = (DeepSheep) super.clone();
		//浅克隆的属性为引用数据类型时，被克隆的对象和克隆的对象的属性会执行同一个内存地址
		
		//深克隆
		Data d = new Data(this.d.getI());
		sheep.setD(d);
		return sheep;
	}
	
}
