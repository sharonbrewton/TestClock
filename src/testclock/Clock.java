package testclock;

import java.util.Calendar;

public class Clock {

//instance variables
   private int hours;
   private int minutes;
   private int seconds;
   private boolean militaryTime;

//constructor
    public Clock(){
        hours = 00;
        minutes = 00;
        seconds = 00;
        militaryTime = true;
    }

    //get hours
    public int getHours(){
        return hours;
    }
    //get minutes
    public int getMinutes(){
        return minutes;
    }
    //get seconds
    public int getSeconds(){
        return seconds;
    }

    //setting hours
    public void setHours(int hrs){
        hours = hrs;
    }

    //setting minutes
    public void setMinutes(int mins){
        minutes = mins;
    }

    //setting seconds
     public void setSeconds(int secs){
        seconds = secs;
    }

    public String atLeastTwoDigitsHours(int hours){
         if (hours <=  9){
            String hr = Integer.toString(hours);
             return "0" + hr;
    }
    return Integer.toString(hours);
}

    public String atLeastTwoDigitsMinutes(int minutes){
        if (minutes <=  9){
            String min = Integer.toString(minutes);
            return "0" + min;
        }
        return Integer.toString(minutes);
    }

    public String atLeastTwoDigitsSeconds(int seconds){
        if (seconds <=  9){
            String sec = Integer.toString(seconds);
            return "0" + sec;
        }
        return Integer.toString(seconds);
    }
     // Increase time by one second
    public void advance() {
        seconds++;
   }

    // Sets clock to current time
    public void calibrate() {
        Calendar cal = Calendar.getInstance();
        hours = cal.get(Calendar.HOUR);
        minutes = cal.get(Calendar.MINUTE);
        seconds = cal.get(Calendar.SECOND);
    }

   // Resets time to 00:00:00
    public void reset() {
        hours = 0;
        minutes = 0;
        seconds = 0;
  }

     public void set(int hrs, int mins, int secs){
         hours = hrs;
         minutes = mins;
         seconds = secs;
    }

  // Switches from 24-hour clock to 12-hour clock or vice-versa
  public void toggleClockMode() {
        militaryTime = !militaryTime;
    }

     @ Override
    public String toString() {
     if (militaryTime)
            return atLeastTwoDigitsHours(hours) + ":" + atLeastTwoDigitsMinutes(minutes) +
                    ":" + atLeastTwoDigitsSeconds(seconds);
      else if (hours <= 12)
             return atLeastTwoDigitsHours((hours==0) ? 12 : hours) + ":" + atLeastTwoDigitsMinutes(minutes) +
                    ":" + atLeastTwoDigitsSeconds(seconds) + " A.M.";
            else
               return atLeastTwoDigitsHours(hours - 12) + ":" +
                       atLeastTwoDigitsMinutes(minutes) + ":" + atLeastTwoDigitsSeconds(seconds)
                       + " P.M.";
    }
}





