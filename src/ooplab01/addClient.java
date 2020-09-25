/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab01;

import ooplab01.bankingsystem.client;

/**
 *
 * @author Hp
 */
public class addClient {
    public static client addClient(client c,int doB[],int type, String gen, String name){
        c=new client();
        c.setName(name);
        c.setClientType(type);
        c.setDoB(doB);
        c.setGender(gen);
        return c;
    }
}
