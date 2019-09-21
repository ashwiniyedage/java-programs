package com.shopping;

public class Product
{
	private int pid;
	private String pname;
	private double price;
	private int pqty;
	
	public Product(int pid, String pname, double price, int pqty) {
		
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.pqty = pqty;
	}

	public int getPid()
	{
		return pid;
	}

	public void setPid(int pid)
	{
		this.pid = pid;
	}

	public String getPname()
	{
		return pname;
	}

	public void setPname(String name)
	{
		this.pname = name;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public int getPqty()
	{
		return pqty;
	}
	public void setPqty(int pqty)
	{
		this.pqty=pqty;
	}	
}
