package test4;

public class Test3 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "EE";
		String s3 = "javaEE";
		String s4 = s1 + s2; //javaEE
		System.out.println(s3 == s4); //内存地址不同
		System.out.println(s3.equals(s4)); //文本相同
		
		s4 = s4.intern(); //在常量池中寻找内容为javaEE的内存地址（s3）,
		System.out.println(s3 == s4);
	}

}
