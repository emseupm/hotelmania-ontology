package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: RequestHotelInfo
* @author ontology bean generator
* @version 2015/05/21, 17:20:56
*/
public class RequestHotelInfo implements AgentAction {

   /**
* Protege name: startDate
   */
   private int startDate;
   public void setStartDate(int value) { 
    this.startDate=value;
   }
   public int getStartDate() {
     return this.startDate;
   }

   /**
* Protege name: numberOfDays
   */
   private int numberOfDays;
   public void setNumberOfDays(int value) { 
    this.numberOfDays=value;
   }
   public int getNumberOfDays() {
     return this.numberOfDays;
   }

}
