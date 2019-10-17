package Bean;

public class Human {
	String name = BeansManager.config.getProperty("name", "niba");
	int age;
	String address;

	public Human() {
		this.name = BeansManager.config.getProperty("name", "nima");
		this.age = BeansManager.config.getIntProperty("age", 5);
		this.address = BeansManager.config.getProperty("address", "kingdog");
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Bean [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
