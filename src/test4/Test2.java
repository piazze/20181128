package test4;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * s1 = "java"时，先去常量池中查找有没有java的值，没有则创建空间，并初始化数据为java
		 * 
		 * s2 = "java",先去常量池中查找有没有java，有，则不会创建，而是将现有的java的内存地址给了s2
		 * */
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		System.out.println(s1 == s2); //比较内存地址
		System.out.println(s1 == s3);
		
		s2 = "java" + "EE";
	}

}
