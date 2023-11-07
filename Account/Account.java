package com.accout;

public class Account {
	private int accno;
	private String ifsccode;
	protected String location="chennai";
	protected String address="monk street";
	public double amount=20500;
	public void setAccno(int n) {
		accno=n;
	}
	public int getAccno() {
		return accno;
	}
	public void setIfsc(String s) {
		ifsccode=s;
	}
	public String getIfsc() {
		return ifsccode;
	}
	protected void info() {
		System.out.println("Main Package");
	}
}
