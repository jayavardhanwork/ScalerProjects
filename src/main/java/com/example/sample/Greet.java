package com.example.sample;

import java.util.Calendar;

public class Greet {
    public static final String morning = " Good Morning";
    public static final String afternoon = "Good Afternoon";
    public static final String evening = "Good Evening";

    public  static String fetchGreeting(){
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(hour < 12){
            return morning;
        }
        else if (hour < 18){
            return afternoon;
        }
        else{
            return  evening;
        }
    }

}
