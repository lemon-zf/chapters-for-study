package leaderus.study.chapter.unsafe.serialize;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -1897488001934050251L;

	private int age;

	private String name;

	private boolean hasMoney;

	public Person() {
	}

	public Person(int age, String name, boolean hasMoney) {
		this.age = age;
		this.name = name;
		this.hasMoney = hasMoney;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHasMoney() {
		return hasMoney;
	}

	public void setHasMoney(boolean hasMoney) {
		this.hasMoney = hasMoney;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", hasMoney=" + hasMoney + "]";
	}

	
	
}
