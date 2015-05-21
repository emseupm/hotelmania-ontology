package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: ExperienceInfo
* @author ontology bean generator
* @version 2015/05/21, 17:20:56
*/
public class ExperienceInfo implements Predicate {

   /**
* Protege name: staff
   */
   private Staff staff;
   public void setStaff(Staff value) { 
    this.staff=value;
   }
   public Staff getStaff() {
     return this.staff;
   }

   /**
* Protege name: numberOfGuests
   */
   private int numberOfGuests;
   public void setNumberOfGuests(int value) { 
    this.numberOfGuests=value;
   }
   public int getNumberOfGuests() {
     return this.numberOfGuests;
   }

   /**
* Protege name: currentDay
   */
   private int currentDay;
   public void setCurrentDay(int value) { 
    this.currentDay=value;
   }
   public int getCurrentDay() {
     return this.currentDay;
   }

}
