/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01.bankingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * backup class for account
 * @author Hp
 */
public class accbackup {
     private int AccId;
    int balance;
    String accType;
    List<String> history=new ArrayList<String>();

    public int getAccId() {
        return AccId;
    }

    public void setAccId(int AccId) {
        this.AccId = AccId;
    }
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history.add(history);
    }
    public Boolean withdraw(int amount,int cType){
        if (this.accType.equals("Credit"))
        {
            this.balance-=amount;
            this.history.add("Amount withdrrawn: "+amount +" new balance: "+this.balance);
        }
        else if(this.accType.equals("Savings") && (this.balance>amount)){
            System.out.println("State the date today 1-30");
            Scanner myObj;
            myObj = new Scanner(System.in);
            int date = myObj.nextInt();
            
            if(date<=0 && date>=31 )
            {
                System.out.println("Invalid entry");
                return false;
            } else if(date<=15 ) {
                System.out.println("Sorry for Saving account you can only withdraw after 15th of everymonth");
                return false;
            }
            else{
                this.balance-=amount;
                this.history.add("Amount withdrawn: "+amount +" new balance: "+this.balance);
                
            }
        }
        else if(this.balance>amount){
            float tax=(float) (amount*1);
            this.balance-=amount+tax;
            this.history.add("Amount withdrawn: "+amount +" new balance: "+this.balance);
            
        }
        /*else if(this.accType.equals("Business") && (this.balance>amount) && cType==2){
            float tax=(float) (amount*1.01);
            this.balance-=amount+tax;
            this.history[this.hIndex]="Amount withdrrawn: "+amount +" new balance: "+this.balance;
            
        }
        else if((this.balance>amount) && cType==3){
            this.balance-=amount;
            this.history[this.hIndex]="Amount withdrrawn: "+amount +" new balance: "+this.balance;
            
        }*/
        else {
            this.history.add("Amount Transfer failed: "+amount+ " Insufficient Balance: "+this.balance);
            
            return false;
        }
        return true;
    }
    public void deposit(int amount){
        this.balance+=amount;
        this.history.add("Amount added: "+amount+ " new balance: "+this.balance);
    }
    public Boolean transfer(client c1, int amount, int cType){
        if (this.accType.equals("Credit"))
        {
            this.balance-=amount;
            this.history.add("Amount Transfered: "+amount+ " to: "+c1.getName()+" new balance: "+this.balance);
        }
        else if(this.accType.equals("Business") && (this.balance>amount) && cType==1){
            float tax=(float) (amount*1.02);
            this.balance-=amount+tax;
            this.history.add("Amount transfered: "+amount +" new balance: "+this.balance);
        }
        else if(this.accType.equals("Business") && (this.balance>amount) && cType==2){
            float tax=(float) (amount*1.01);
            this.balance-=amount+tax;
            this.history.add("Amount transfered: "+amount +" new balance: "+this.balance);
            
        }
        else if((this.balance>amount) && cType==3){
            this.balance-=amount;
            this.history.add("Amount transfered: "+amount +" new balance: "+this.balance);
            
        }
        else {
            this.history.add("Amount Transfer failed: "+amount+ " Insufficient Balance: "+this.balance);
            
            return false;
        }
        return true;
    }
}
