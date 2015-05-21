package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: CurrentTime
* @author ontology bean generator
* @version 2015/05/21, 17:20:56
*/
public class CurrentTime implements AgentAction {

   /**
* Protege name: time
   */
   private Time time;
   public void setTime(Time value) { 
    this.time=value;
   }
   public Time getTime() {
     return this.time;
   }

}
