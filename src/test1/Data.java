package test1;

/**
 * 一个测试用例
 * @author Administrator
 *
 */
public class Data {
	
	public Data(String str,int num) {
		super();
		this.str = str;
		this.num = num;
	}

	private String str;

	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Data [str=" + str + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		return result;
	}

	//生成eqauls和hashcode
		/*
		 * alt+shift+s
		 * genernate equals() and hashcode()    生成equals和hashcode方法
		 * */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())  //判断obj的类型是否和本类的类型一致
			return false;
		Data other = (Data) obj;  //执行到这一步已经明确了obj的类型，因此强制将obj转换为Data
		/*依次比较本类的属性和other的属性的值是否均相同*/
		if (num != other.num)
			return false;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}
	
	
	




	
	
}
