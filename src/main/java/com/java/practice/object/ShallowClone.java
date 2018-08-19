package com.java.practice.object;

public class ShallowClone implements Cloneable{
	private int count;
	private ReferenceObject ref;
	
	public ShallowClone(int count,ReferenceObject ref) {
		this.count = count;
		this.ref = ref;
	}
	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public ReferenceObject getRef() {
		return ref;
	}



	public void setRef(ReferenceObject ref) {
		this.ref = ref;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowClone test = new ShallowClone(1,new ReferenceObject("test"));
		ShallowClone copy = (ShallowClone) test.clone();
		System.out.println(test.getClass() == test.getClass());
		System.out.println(test == copy);
		System.out.println(test.equals(copy));
		test.setCount(2);
		test.getRef().setName("update");
		System.out.println(test.getCount());
		System.out.println(copy.getCount());

		System.out.println(test.getRef().getName());
		System.out.println(copy.getRef().getName());
	}

}
