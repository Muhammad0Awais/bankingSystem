/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01.bankingsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *Bank class
 * @author Hp
 */
public class bank {
    private String bankName;
    private List<client> Clients=new ArrayList<client>();
    private List<Account> Accounts=new ArrayList<Account>();
    private int totalmoney;

    public Account getAccountByID(int id)//getting accounts in the bank by ID
    {
        return this.Accounts.stream().filter(ac1 -> ac1.getAccId()==id).findFirst().orElse(null);
    }
    
    public int getTotalmoney()//Getting total amount in the bank 
    {
        return totalmoney;
    }

    public void setTotalmoney(int totalmoney) //updating the balance in the bank
    {
        this.totalmoney += totalmoney;
    }

    public List<Account> getAccounts() //Returning the accounts from the bank
    {
        return Accounts;
    }

    public void setAccounts(Account account)//adding accounts to the list of accounts in the bank
    {
        this.Accounts.add(account);
    }

    public List<client> getClients() //Client getter
    {
        return Clients;
    }

    public void setClients(client Client)//client name setter 
    {
        this.Clients.add(Client);
    }

    public String getBankName()//Bank name Getter 
    {
        return bankName;
    }

    public void setBankName(String bankName)//Bank name setter 
    {
        this.bankName = bankName;
    }
}
