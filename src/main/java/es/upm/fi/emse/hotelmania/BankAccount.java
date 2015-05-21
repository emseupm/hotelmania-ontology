package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: BankAccount
* @author ontology bean generator
* @version 2015/05/21, 17:20:56
*/
public class BankAccount implements Concept {

   /**
* Protege name: accountId
   */
   private String accountId;
   public void setAccountId(String value) { 
    this.accountId=value;
   }
   public String getAccountId() {
     return this.accountId;
   }

   /**
* Protege name: balance
   */
   private float balance;
   public void setBalance(float value) { 
    this.balance=value;
   }
   public float getBalance() {
     return this.balance;
   }

}
