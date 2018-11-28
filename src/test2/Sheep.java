package test2;

public class Sheep implements Cloneable{

	private String name;
	private int age;
	private Data d;
	
	public Data getD() {
		return d;
	}
	public void setD(Data d) {
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
	public Sheep(String name, int age,Data d) {
		super();
		this.name = name;
		this.age = age;
		this.d = d;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sheep other = (Sheep) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", d=" + d + "]";
	}
	@Override
	protected Sheep clone() throws CloneNotSupportedException {
		return (Sheep) super.clone();
	}
	
	
}
