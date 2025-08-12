package mypackage;
/*This is going to contain universal accounts. This Class can be applied for a variety of bussiness. Such as a resturaunt, Bank, video channel, and etc. 

Developer Name: tatcoffeenux
Date 08/11/2025

*/

//import the java library needed.
import java.util.Calendar;

public class HuntAccounts{
	//create the attributes for the accounts 
	private String name;
	private double acctID;
	private double checkingBalance;
	private double savingsBalance;
	private String aliasName;
	private String busName;
	private double busChecking;
	private double busSavings;
	
	//create the constructor
	public HuntAccounts(){
	}

	//create the set methods

	//create set methods for personal account 
	public void setName(String fn, String ln){
		name = fn+" "+ln;
	}
	
	public void setAcct(double acctNum){
		acctID = acctNum;
	}
	
	public void setChecking(double checking){
		checkingBalance = checking; 
	}

	public void setSavings(double savings){
		savingsBalance = savings; 
	}
	
	public void setAlias(String alias){
		aliasName = alias;
	}
	//Set the bussiness accounts
	public void setBusiness(String business){
		busName = business;
	}

	public void setBusChecking(double businessChecking){
		busChecking = businessChecking;
	}
	
	public void setBusSavings(double businessSavings){
		busSavings = businessSavings;
	}

	//create the get methods for personal and bussiness. 
	public String getName(){
		return name;
	}
	
	public double getAcctID(){
		return acctID;
	}
	
	public double getChecking(){
		return checkingBalance;
	}

	public double getSavings(){
		return savingsBalance;
	}
	
	public String getAlias(){
		return aliasName;
	}
	
	public String getBusName(){
		return busName;
	}
	
	public double getBusChecking(){
		return busChecking;
	}
	
	public double getBusSavings(){
		return busSavings;
	} 
	//create a display message method
	public void displayMessage(){
		System.out.println("Welcome! How can we help you today!?");
	}
	

}
