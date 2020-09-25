/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01.bankingsystem;

/**
 *Account function overloaded for business class because it has new rules
 * @author Hp
 */
public class BusinessAccount extends Account {
    
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
    
    public Boolean transfer(Account c1, int amount, int cType){
        if(balance>amount && cType==1){
            float tax=(float) (amount*0.02);
            balance-=(amount+tax);
            history.add("Amount transfered: "+amount+ " to: "+c1.getAccId() +" Tax Applied: "+tax +" new balance: "+balance);
            c1.deposit(amount);
        }
        else if((balance>amount) && cType==2){
            float tax=(float) (amount*0.01);
            balance-=(amount+tax);
            history.add("Amount transfered: "+amount+ " to: "+c1.getAccId() +" Tax Applied: "+tax +" new balance: "+balance);
            c1.deposit(amount);
        }
        else{
            history.add("Amount Transfer failed: "+amount+ " Insufficient Balance: "+balance);
            return false;
        }
        return true;
    }
}
