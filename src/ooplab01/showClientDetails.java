/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01;

import java.util.List;
import ooplab01.bankingsystem.Account;
import ooplab01.bankingsystem.client;

/**
 *This class is a helper class for showing all the accounts for a specific client
 * @author Hp
 */
public class showClientDetails {
    public static void showClientDetails(client cl){
        System.out.println("**********************************");
        System.out.println("Client Name: "+ cl.getName());
        System.out.println("Client Gender: "+ cl.getGender());
        if(cl.getClientType()==1)
            System.out.println("Client Type: Regular Client");
        if(cl.getClientType()==2)
            System.out.println("Client Type: Client with Golden Card");
        if(cl.getClientType()==3)
            System.out.println("Client Type: VIP Client");
        System.out.println("Client's Date of birth: "+ cl.getDoB()[0]+"/" + cl.getDoB()[1]+"/" + cl.getDoB()[2]);
        System.out.println("Client Total Money: "+ cl.getamount());
        List<Account> la=cl.getAc();
        System.out.println("Client total number of accouts: "+ la.size());
        for(Account aa: la)
        {
            System.out.println("************************************");
            System.out.println("Account ID: "+aa.getAccId());
            System.out.println(aa.getAccType()+" Account, Balance: "+aa.getBalance());
            System.out.println("Operations performed on the account");
            for (String s: aa.getHistory())
            {
                System.out.println(s);
            }
            System.out.println("************************************\n");
        }
    }
}
