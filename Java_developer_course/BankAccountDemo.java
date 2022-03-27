package com.practice.Java_developer_course;

public class BankAccountDemo {
	public static void main(String[] args) {
		BankAccount myAccount=new BankAccount("Vannsh",100);
		BankAccount bobAccount=new BankAccount("Bob Robinson");

		bobAccount.deposit(500);
		System.out.println("owner: " + bobAccount.getOwner());
		System.out.println("balance: " + bobAccount.getBalance());

		bobAccount.withdraw(1000);

	}
}
