/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01;

import java.util.List;
import ooplab01.bankingsystem.bank;

/**
 *This class is for showing the list of operations happening on all the accounts in the bank
 * @author Hp
 */
public class showBankHistory {
    public static void showBankHistory(bank b1){
        List<String> hh;
        System.out.println("Total Money: "+b1.getTotalmoney());
        System.out.println("Total Accoutns "+b1.getAccounts().size());
        System.out.println("Accounts");
        for (int i=0;i<b1.getAccounts().size();i++){
            
            System.out.println("Account Type: "+b1.getAccounts().get(i).getAccType());
            System.out.println("Account Id: "+b1.getAccounts().get(i).getAccId());
            System.out.println("Account Balance: "+b1.getAccounts().get(i).getBalance());
            hh=b1.getAccounts().get(i).getHistory();
            System.out.println("************************************");
            System.out.println("Operations performed on the account");
            for (String s: hh)
            {
                System.out.println(s);
            }
            System.out.println("************************************\n");
        }
    }
}
