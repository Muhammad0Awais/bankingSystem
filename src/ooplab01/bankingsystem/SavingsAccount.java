/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01.bankingsystem;

import java.util.Scanner;

/**
 *Child class for Savings account
 * @author Hp
 */
public class SavingsAccount extends Account {
    
    public Boolean withdraw(int amount,int cType){
        if(balance>amount){
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
                balance-=amount;
                history.add("Amount withdrawn: "+amount +" new balance: "+balance);
            }
            return true;
        }
        else{
            history.add("Withdrawn request failed: "+amount +" balance: "+balance);
        }
        return false;
     }
    public Boolean transfer(Account c1, int amount, int cType)//Transferring amount in accounts
    {
        if((balance>amount) && cType==3){
            balance-=amount;
            history.add("Amount transfered: "+amount+ " to: "+c1.getAccId() +" new balance: "+balance);
            c1.deposit(amount);
        }
        else {
            history.add("Amount Transfer failed: "+amount+ " Insufficient Balance: "+balance);
            
            return false;
        }
        return true;
    }
}
