package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: HotelInfo
* @author ontology bean generator
* @version 2015/05/21, 17:20:56
*/
public class HotelInfo implements AgentAction {

   /**
* Protege name: roomAvailability
   */
   private boolean roomAvailability;
   public void setRoomAvailability(boolean value) { 
    this.roomAvailability=value;
   }
   public boolean getRoomAvailability() {
     return this.roomAvailability;
   }

   /**
* Protege name: totalPrice
   */
   private float totalPrice;
   public void setTotalPrice(float value) { 
    this.totalPrice=value;
   }
   public float getTotalPrice() {
     return this.totalPrice;
   }

}
