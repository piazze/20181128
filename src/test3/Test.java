package test3;

import test2.Data;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Data d = new Data(1);
		DeepSheep alice = new DeepSheep("Alice", 3,d);
		
		//克隆羊
		DeepSheep duoli = alice.clone();
		//System.out.println("alice.name == duoli.name:" + (alice.getName() == duoli.getName()));
		System.out.println("alice的年龄和duoli的年龄是否相同：" + (alice.getAge() == duoli.getAge()));
		System.out.println("alice和duoli的d对象是否相同：" + (alice.getD() == duoli.getD()));
		System.out.println(alice.getD().getI() + "  " + duoli.getD().getI());
		
		d.setI(10);
		alice.setD(d);
		
		System.out.println("alice的年龄和duoli的年龄是否相同：" + (alice.getAge() == duoli.getAge()));
		System.out.println("alice和duoli的d对象是否相同：" + (alice.getD() == duoli.getD()));
		System.out.println(alice.getD().getI() + "  " + duoli.getD().getI());
	}

}
