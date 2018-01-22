package com.infotech.client;

import com.infotech.model.Account;
import com.infotech.worker.AccountHolder;

public class ClientTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account);
		Thread t1 = new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);
		t1.setName("Jack");
		t2.setName("Joya");
		
		t1.start();
		t2.start();
	}
}
