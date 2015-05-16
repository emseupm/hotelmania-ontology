package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Client
* @author ontology bean generator
* @version 2015/05/14, 12:22:21
*/
public class Client implements Concept {

   /**
* Protege name: clientId
   */
   private AID clientId;
   public void setClientId(AID value) { 
    this.clientId=value;
   }
   public AID getClientId() {
     return this.clientId;
   }

}
