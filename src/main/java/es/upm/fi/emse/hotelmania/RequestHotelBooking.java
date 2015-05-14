package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: RequestHotelBooking
* @author ontology bean generator
* @version 2015/05/14, 12:22:21
*/
public class RequestHotelBooking implements AgentAction {

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

   /**
* Protege name: RequestingClient
   */
   private Client requestingClient;
   public void setRequestingClient(Client value) { 
    this.requestingClient=value;
   }
   public Client getRequestingClient() {
     return this.requestingClient;
   }

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

}
