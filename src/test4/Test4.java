package test4;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		String str = "abcedfghijklmnopqrstuvwxyz0123456789";
		System.out.println("字符串长度：" + str.length());
		System.out.println("获取字符串索引为35的字符：" + str.charAt(str.length() - 1));
		boolean r1 = str.equals("ABCEDFGHIJKLMNOPQRSTUVWXYZ0123456789");
		System.out.println("字符串的等值匹配：" + r1);
		
		//字符串忽略大小写比较
		boolean r2 = str.equalsIgnoreCase("ABCeDFGHIJKlMNOPQRsTUvWXYZ0123456789");
		System.out.println("忽略大小写等值匹配：" + r2);
		
		//将字符串转换为大写
		String upper = str.toUpperCase(); //将字符串转换为大写
		String lower = upper.toLowerCase(); //将字符串转换为小写
		
		int compare = "1".compareTo("211");//返回0，说明相等   返回正数说明大于，返回负数说明小于
		System.out.println("字符串1 > 字符串2：" + compare);
		
		String str2 = "123456789abcabcabc";
		//获取str2中第一次出现a的索引
		//int index = str2.indexOf("a");
		int index = str2.indexOf('a');
		System.out.println("str2中第一次出现a的索引为：" + index);
		
		index = str2.indexOf("a", index + 1);//从指定索引开始找第一次出现字符串的位置
		System.out.println("str2中索引为10开始找第一次出现a的索引为：" + index);
		
		str2.lastIndexOf("a"); //a最后一次出现的索引
		str.lastIndexOf("a", str2.length() - 1 - 3); //从倒数第4个字符开始找a出现的最后一个索引
		
		str2.startsWith("1234"); //判断str2是否已1234开头
		str2.endsWith("abc");	//判断str2是否已abc结尾
		
		String sub = str.substring(26);//从索引26开始截取字符串至字符串的末尾
		System.out.println("从str中索引26开始截取字符串至末尾：" + sub);
		//包含0下标，不包含26
		sub = str.substring(0, 26);//从指定位置开始截取字符串至指定索引之间的字符串   
		System.out.println("截取str 0-26索引之间的字符串：" + sub);
		
		String str3 = str2.replace('a', '*');
		System.out.println("替换str2种的a为*：" + str3);
		
		String str4 = "1a2b3c4d5e6f";
		//将str4中的所有数字替换为*
		//通过正则表达式匹配任意数字
		str4 = str4.replaceAll("\\d", "*");
		System.out.println(str4);
		
		String str5 = "   a b c   ";
		str5 = str5.trim(); //去除str5两段的空格
		System.out.println("str5去除两段空格：" + str5);
		
		String s1 = "java";
		String s2 = "EE";
		String s3 = s1.concat(s2);
		System.out.println("拼接字符串：" + s3);
		
		String str6 = "1|2|3|4|5,6*7";
		String[] arr = str6.split("[\\|,*]"); //将字符串已指定符号分隔为字符串数组
		System.out.println(Arrays.toString(arr));
	}

}
