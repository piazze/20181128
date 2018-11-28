package test1;

public class Test1 {

	public static void main(String[] args) {
		Data d1 = new Data("java",10);
		
		/*int hashcode = d.hashCode();
		//System.out.println(Integer.toHexString(hashcode));
		
		System.out.println(d);*/
		
		Data d2 = new Data("java",10);
		
		System.out.println(d1 == d2);  //比较内存地址
		System.out.println(d1.equals(d2));  //比较属性值
	}

}
