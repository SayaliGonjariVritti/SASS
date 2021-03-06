package com.vritti.sass.model;

public class UpdateTime {

    public static String updateTime(int hours, int mins) {
        String timeSet = "";
        if (hours > 12) {
            hours -= 12;
            if(hours >= 12){
                hours = hours - 12;
                if(hours == 0){
                    hours = 01;
                }

                timeSet = "AM";
            }else{
                timeSet = "PM";
            }

        } else if (hours == 0) {
            hours += 12;
            timeSet = "AM";
        } else if (hours == 12)
            timeSet = "PM";
        else
            timeSet = "AM";

        String minutes = "";
        if (mins < 10)
            minutes = "0" + mins;
        else
            minutes = String.valueOf(mins);

        // Append in a StringBuilder
        String aTime = new StringBuilder().append(hours).append(':')
                .append(minutes).append(" ").append(timeSet).toString();

        return aTime;
    }


}
