package com.shopping;

public class Bill
{
	private int billno;
	private double total;
	private double gst;
	private double finaltot;
	public Bill(int billno, double total, double gst, double finaltot) 
	{
		this.billno = billno;
		this.total = total;
		this.gst = gst;
		this.finaltot = finaltot;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public double getTotal()
	{
		return total;
	}
	public void setTotal(double total)
	{
		this.total = total;
	}
	public double getGst()
	{
		return gst;
	}
	public void setGst(double gst)
	{
		this.gst = gst;
	}
	public double getFinaltot()
	{
		return finaltot;
	}
	public void setFinaltot(double finaltot)
	{
		this.finaltot = finaltot;
	}
}
