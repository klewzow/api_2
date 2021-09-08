package com.gmail.klewzow;

public class Cat {
	private int age;
	private int weigth;
	private String name;
	private String color;

	public Cat(int age, int weigth, String name, String color) {
		super();
		this.age = age;
		this.weigth = weigth;
		this.name = name;
		this.color = color;
	}

	public Cat() {
		super();

	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the weigth
	 */
	public int getWeigth() {
		return this.weigth;
	}

	/**
	 * @param weigth the weigth to set
	 */
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", weigth=" + weigth + ", name=" + name + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weigth;
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
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weigth != other.weigth)
			return false;
		return true;
	}

}
