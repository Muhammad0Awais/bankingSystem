/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01.bankingsystem;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Ch Muhammad Awais
 * This is a client's class which contains the functions of client
 */
public class client {
    private String name;
    private int clientType;
    private int doB[];
    private String gender;
    private int numofAccounts=0;
    private List<Account> ac=new ArrayList<Account>(); //List of accounts which a client have.
    
    
    public Account getAccountByID(int id)//This function is for getting account for transfering amount
    {
        return this.ac.stream().filter(ac1 -> ac1.getAccId()==id).findFirst().orElse(null);
    }
    
    public List<Account> getAc()//This function returns the clinets of an account. 
    {
        return ac;
    }

    public void setAc(Account ac) //This function is for adding accounts of a client 
    {
        this.ac.add(ac);
        this.numofAccounts+=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null || name!=" ")
        {
            this.name = name;
        }
    }

    public int getClientType() {
        return clientType;
    }

    public void setClientType(int clientType)//1 means Regular client, 2 for Client with golden card, 3 is Vip client 
    {
        if(clientType>0 && clientType<3)
        {this.clientType = clientType;
        }
        else{
            System.out.println("Client type incorrect");
        }
    }

    public int[] getDoB() {
        return doB;
    }

    public void setDoB(int doB[]) {
        if(doB[0]>=1 && doB[0]<=12)
        {
            if(doB[1]>=1 && doB[1]<=30)
            {
                if(doB[2]>1900 && doB[2]<=2020)
                {
                    this.doB = doB;
                }
                else {
                    System.out.println("Not Valid");
                }
            }
            else {
                    System.out.println("Not Valid");
                }
        }
        else {
                    System.out.println("Not Valid");
                }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getamount()//This function is for getting amount of all accounts of one client.
    {
        int amount=0;
        for (int i=0;i<this.numofAccounts;i++)
        {
            Account aa=ac.get(i);
            amount+=aa.getBalance();
        }
        return amount;
    }
}
