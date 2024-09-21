package src.main.java;


public class ClockDisplay12Hour extends ClockDisplay // Dont know Inheritance so I tried to copy ClockDisplay
{
    //Extend ClockDisplay for a 12 hour clock. This means you need to track AM/PM
    //Update all methods and parameters to accomodate this change
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String period;
    
    public ClockDisplay12hour(){ 
     hours = new NumberDisplay(24);
     minutes = new NumberDisplay(60);
     updateDisplay();
     
    }

    
    public void updateDisplay(){ // to display AM PM
     String output = " ";
     
     if (hours.getValue() <12) {
            if (hours.getValue() == 0) {
                output = "12:00 AM";
            } else{
                output = hours.getDisplayValue()+ ":"+ minutes.getDisplayValue() + " AM";
            }
        } else if (hours.getValue() == 12) {
            output = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + " PM";
        } else {
            
            if (hours.getValue() == 23 || hours.getValue() == 24) {
                output = (hours.getValue()-12) +":" + minutes.getDisplayValue() + " PM";
            }
            else {
                output = "0" +(hours.getValue()-12) +":" + minutes.getDisplayValue() +" PM";
            }
        }//
      

     
      period = output;
    }
    
       
     public ClockDisplay12Hour(int hour, int minute, String period){ 
           super( hour,  minute);
           this.period = period;
    }
    
      public void setTime(int hour, int minute){ 
       hours.setValue(hour);
       minutes.setValue(minute);
       updateDisplay();
    }
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
    public String getTime(){ 
     return display;    
    }
    
       public void timeTick(){
        minutes.increment();
        if (minutes.getValue() == 0){ 
           hours.increment(); 
        }
        updateDisplay();
    }
    
    
}

}
