/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01.bankingsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *Main account class
 * @author Hp
 */
public class Account {
    
    protected int AccId;
    protected int balance;
    protected String accType;
    protected List<String> history=new ArrayList<>();
    
    public void setter(int id,int bal, String type) {
        AccId= id;        
        accType=type;
        balance=bal;
        history.add("Initial Balance: "+balance);
    }

    public int getAccId() //Id setter
    {
        return AccId;
    }

    public void setAccId(int AccId) //Id getter
    {
        this.AccId = AccId;
    }
    
    public int getBalance() //Balance getter 
    {
        return balance;
    }

    public void setBalance(int balance) //Initializing the balance
    {
        this.balance = balance;
        this.history.add("Initial Balance: "+balance);
    }

    public String getAccType() //Getting account type 
    {
        return accType;
    }

    public void setAccType(String accType) //Setting account type 
    {
        this.accType = accType;
    }

    public List<String> getHistory()// function for sending the history back 
    {
        return history;
    }

    public void setHistory(String history) //function for updating the history which contains the operations history 
    {
        this.history.add(history);
    }
    
    public void deposit(int amount)//Depositing amount in the account
    {
        this.balance+=amount;
        this.history.add("Amount added: "+amount+ " new balance: "+this.balance);
    }
}
