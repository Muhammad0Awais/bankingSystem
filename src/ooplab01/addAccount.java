/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01;

import ooplab01.bankingsystem.Account;
import ooplab01.bankingsystem.bank;

/**
 *Adding account details
 * @author Hp
 */
public class addAccount {
    public static Account addAccount(Account a,int id,int balance, String type)//Adding account details
    {
        a=new Account();
        a.setAccId(id);
        a.setAccType(type);
        a.setBalance(balance);
        a.setHistory("Account Created");
        return a;
    }
}
