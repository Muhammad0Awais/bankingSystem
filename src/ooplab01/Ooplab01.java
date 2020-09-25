/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01;

import java.util.ArrayList;
import java.util.List;
import static ooplab01.addAccount.addAccount;
import static ooplab01.addClient.addClient;
import ooplab01.bankingsystem.Account;
import ooplab01.bankingsystem.BusinessAccount;
import ooplab01.bankingsystem.CreditAccount;
import ooplab01.bankingsystem.SavingsAccount;
import ooplab01.bankingsystem.bank;
import ooplab01.bankingsystem.client;
import ooplab01.bankingsystem.debitAccount;
import static ooplab01.showBankHistory.showBankHistory;
import static ooplab01.showClientDetails.showClientDetails;


/*
You implemented what was asked.
You did not put comments for all classsses and methods of your class model: -10%
Grade: 90
 */


/**
 *
 * @author Hp
 */
public class Ooplab01 {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        // TODO code application logic here
        bank b1=new bank();
        b1.setBankName("Russian Bank");
        System.out.println("Welcome to "+b1.getBankName());
        
        client cl=new client();
        
        //Adding first client
        int clientType=1; //Client type 1- Regular Client, 2- Golden Card Client, 3- Vip Client
        int dob[]={03,13,2001};
        cl=addClient(cl, dob,1,"Male","Arsal");
        
        //Adding Accounts
        CreditAccount ac2=new CreditAccount();
        ac2.setter(1,2000,"Credit");
        b1.setTotalmoney(2000);//Adding money to bank amount
        
        ac2.deposit(7000);//Deposit function on account
        b1.setTotalmoney(7000);//updating bank balance
        cl.setAc(ac2);//linking account to client
        b1.setAccounts(ac2);//adding account to the bank
        b1.setClients(cl);//adding client to the bank
        //System.out.println(cl.getName()+" has total balance of "+cl.getamount());
        
        //Adding second client
        dob=new int[]{11,02,1995};
        clientType=2;
        cl=addClient(cl, dob,2,"Female","Tanya");
        
        //Adding Accounts
        debitAccount dA=new debitAccount();
        dA.setter(2, 2000, "Debit");
        
        //updating the bank balance
        b1.setTotalmoney(2000);
        cl.setAc(dA);//adding account to client
        b1.setAccounts(dA); //adding account to bank
        
        
        SavingsAccount sA=new SavingsAccount();        
        sA.setter(41,2000,"Savings");
        
        //updating the bank balance
        b1.setTotalmoney(2000);
        cl.setAc(sA);
        b1.setAccounts(sA);
        
        //Credit Account
        CreditAccount ac1=new CreditAccount();
        ac1.setter(15,5000,"Credit");
        b1.setTotalmoney(5000);
        if(ac1.withdraw(6000, cl.getClientType()))
        {
            b1.setTotalmoney(-6000);
        }
        ac1.transfer(b1.getAccountByID(1), 1000, cl.getClientType());
        cl.setAc(ac1);
        b1.setAccounts(ac1);
        
        //System.out.println("Client 2 Ammount: "+cl.getamount());
        //showClientAccounts(cl);
        b1.setClients(cl);
        
        //New Client
        cl=new client();
        int dob1[]={07,17,2001};
        clientType=2;
        cl=addClient(cl, dob1,clientType,"Male","Ali");
        
        //Creating Business Account
        BusinessAccount bs1=new BusinessAccount();
        bs1.setter(15,15000,"Credit");
        b1.setTotalmoney(15000);
        bs1.transfer(b1.getAccountByID(1), 1000, cl.getClientType());
        cl.setAc(bs1);
        b1.setAccounts(bs1);
        
        //System.out.println("Client 2 Ammount: "+cl.getamount());
        //showClientAccounts(cl);
        b1.setClients(cl);
        
        //showBankHistory(b1);
        for (client aa: b1.getClients())
        {
            showClientDetails(aa);
        }
    }   
}
