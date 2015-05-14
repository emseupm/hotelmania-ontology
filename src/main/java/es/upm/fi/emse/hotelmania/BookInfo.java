package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: BookInfo
* @author ontology bean generator
* @version 2015/05/14, 12:22:21
*/
public class BookInfo implements AgentAction {

   /**
* Protege name: price
   */
   private float price;
   public void setPrice(float value) { 
    this.price=value;
   }
   public float getPrice() {
     return this.price;
   }

}
