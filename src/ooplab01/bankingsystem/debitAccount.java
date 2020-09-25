/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01.bankingsystem;

/**
 *Debit class is child class of Account, there were no functions overloaded as the account has nothing different
 * @author Hp
 */
public class debitAccount extends Account{
    
    public Boolean withdraw(int amount,int cType) //Function for withdrawing the money from the account
    {
        if(balance>amount){
            float tax=(float) (amount*1);
            balance-=amount+tax;
            history.add("Amount withdrawn: "+amount +" new balance: "+balance);
            
        }
        else {
            history.add("Amount Transfer failed: "+amount+ " Insufficient Balance: "+balance);
            
            return false;
        }
        return true;
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
