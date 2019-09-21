package com.shopping;

public class Customer
{
	private int cid;
	private String name;
	private String add;
	private Product prod[];
	private Bill b1;
	
	public Customer(int cid, String name, String add, Product prod[])
	{
		this.cid = cid;
		this.name = name;
		this.add = add;
		this.prod=prod;
		//this.b1=b1;
	}

	public int getCid()
	{
		return cid;
	}

	public String getName()
	{
		return name;
	}

	public String getAdd()
	{
		return add;
	}

	public Product[] getProd() {
		return prod;
	}

	public Bill getB1() {
		return b1;
	}
	public void setB1(Bill b1)
	{
		this.b1=b1;
	}
}
