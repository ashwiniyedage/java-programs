package com.shopping;
import java.util.Scanner;

public class TestShopping
{
	public static void main(String args[])
	{			
		/*Customer c1=accept();
		c1=calculate(c1);
		display(c1);*/
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the total no of Customer:");
		int n=sc.nextInt();
		Customer c[]=new Customer[n];
		for(i=0;i<n;i++)
		{
		System.out.println("\n Enter the id and name of Customer:");
		int id=sc.nextInt();
		String nm=sc.next();
		System.out.println("\n Enter the address of Customer :");
		String add=sc.next();
		System.out.println("How many product u want to purches:");
		int pn=sc.nextInt();
		Product p[]=new Product[pn];
		for(int j=0;j<pn;j++)
		{
		    System.out.println("\n Enter the Product id,name,Price,Quantity :");
		
			Product p1=new Product(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
			p[j]=p1;
		}
		Customer c1=new Customer(id,nm,add,p);
	
		c[i]=c1;
		c1=calculate(c1);
		display(c1);
		}
		
	}
	/*public static Customer accept()
	{
		Product p1=new Product(101,"Laptop",40000,1);
		Product p2=new Product(102,"Pendrive",1000,2);
		Product arr[]=new Product[2];
		arr[0]=p1;
		arr[1]=p2;
		//Customer c[]=new Customer[2];
		Customer c1=new Customer(201,"Ashwini","Parvati",arr);
		/*Customer c2=new Customer(203,"Afroz","Chikli",arr);
		c[0]=c1;
		c[1]=c2;
		
		return c1;
	}*/
	
	public static Customer calculate(Customer c1)
	{
		double total=0,gst,finaltot;
		//Product arr[]=c1.getProd();
		for(Product x:c1.getProd())
		{
			total=total+x.getPrice()*x.getPqty();
		}
			gst=total*0.12;
			finaltot=total+gst;
			Bill b1=new Bill(345,total,gst,finaltot);
			c1.setB1(b1);
			return c1;
	}
	
	public static void display(Customer cust)
	{
		
		System.out.println("\n******************************Online Shopping************************");
		System.out.println("Customer id : "+cust.getCid());
		System.out.println("Customer name : "+cust.getName());
		System.out.println("Customer address : "+cust.getAdd());
			
		System.out.println("\n***************************Product Detail*************************");
		Product arr[]=cust.getProd();
		for(Product p1:arr)
		{
		System.out.println("--------------------------------------------------------------");
		System.out.println("Produact id   : "+p1.getPid());
		System.out.println("Product name  : "+p1.getPname());
		System.out.println("Quantity      :"+p1.getPqty());
		System.out.println("Product Price : "+p1.getPrice());
		}
		
		System.out.println("-------------------Final Bill--------------------------");
		System.out.println("Bill No       :"+cust.getB1().getBillno());
		System.out.println("Total ammount :"+cust.getB1().getTotal());
		System.out.println("GST           :"+cust.getB1().getGst());
		System.out.println("Final Total   :"+cust.getB1().getFinaltot());
	}
	
}
