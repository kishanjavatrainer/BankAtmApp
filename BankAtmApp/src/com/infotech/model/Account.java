package com.infotech.model;

public class Account {
	private int balance = 6000;

	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}