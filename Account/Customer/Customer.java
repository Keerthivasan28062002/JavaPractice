package com.accout.customer;
import com.accout.*;
public class Customer extends Account{

	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.setAccno(11567489);
		cust.setIfsc("IIB93738");
		System.out.println(cust.getAccno());
		System.out.println(cust.getIfsc());
		System.out.println(cust.location);
		System.out.println(cust.address);
		System.out.println(cust.amount);
	}

}
