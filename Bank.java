package com.corejava.practice;
// Demonstration for creating  method 
public class Bank {
   static int  CurrentBalance=4000;
   public static void greetcustomer() {
	   System.out.println("hello,welcome ");
   }
   public void getbalance(){
	   System.out.println("current balance:"+CurrentBalance);
   }
   public static void credit(int amount){
	   CurrentBalance=CurrentBalance+amount;
	   System.out.println("amount credited successfully");
   }
   public  void withdraw(int amount){
	   CurrentBalance=CurrentBalance-amount;
	   System.out.println("amount deposited successfully");
   }
   public static void main(String[] args) {
	   greetcustomer();
	   Bank bank=new Bank();
	   bank.getbalance();
	   credit(1000);
	   bank.getbalance();
	   bank.withdraw(3000);
	   bank.getbalance();
   }
   
}
