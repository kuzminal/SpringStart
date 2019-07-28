package com.example.SpringStart;

public class FactoryPatterMain {
	public static void main(String[] args) {
	     AccountFactory accountFactory = new AccountFactory();
	     // Получаем объект класса SavingAccount и вызываем
	     // его метод accountType()
	     Account savingAccount = accountFactory.getAccount("SAVING");
	     // Вызываем метод accountType класса SavingAccount
	     savingAccount.accountType();
	     // Получаем объект класса CurrentAccount и вызываем
	     // его метод accountType()
	     Account currentAccount = accountFactory.getAccount("CURRENT");
	     // Вызываем метод accountType класса CurrentAccount
	     currentAccount.accountType();
	}
}
