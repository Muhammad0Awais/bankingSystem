/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01.bankingsystem;

/**
 *Child class for credit account
 * @author Hp
 */
public class CreditAccount extends Account {
    
    public Boolean withdraw(int amount,int cType){
        balance-=amount;
        history.add("Amount withdrrawn: "+amount +" new balance: "+balance);
        return true;
    }
    
    public Boolean transfer(Account c1, int amount, int cType){
        this.balance-=amount;
        this.history.add("Amount Transfered: "+amount+ " to: "+c1.getAccId()+" new balance: "+balance);
        c1.deposit(amount);
        return true;
    }
}
