package test4;

public class Test1 {

	public static void main(String[] args) {
		String s1 = new String();
		String s2 = new String("hello");
		
		//将char类型的数组转换为String
		String s3 = new String(new char[] {'1','2','3'});
		
		//从char类型的数组中的0下标开始，截取1个字符转换成为String
		String s4 = new String(new char[] {'1','2','3'},1,2);
		
		String s5 = "1";
		System.out.println(s4);
	}

}
