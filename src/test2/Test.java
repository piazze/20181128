package test2;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep alice = new Sheep("Alice", 3,new Data(10));
		
		//克隆羊
		Sheep duoli = alice.clone();
		
		System.out.println("判断内存地址：" + (alice == duoli));
		System.out.println("alice:" + alice);
		System.out.println("duoli:" + duoli);
		System.out.println("equals:" + alice.equals(duoli));
		
	}

}
