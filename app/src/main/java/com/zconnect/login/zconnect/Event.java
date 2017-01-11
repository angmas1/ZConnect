package com.zconnect.login.zconnect;


/**
 * Created by Lokesh Garg on 14-11-2016.
 */
public class Event {
    private String EventName, EventDescription, EventImage, EventDate, FormatDate, Key;

    public Event(){

    }

    public Event(String eventName, String eventDescription, String eventImage, String eventDate, String formatDate, String key) {
        EventName = eventName;
        EventDescription = eventDescription;
        EventImage = eventImage;
        EventDate = eventDate;
        FormatDate = formatDate;
        Key = key;

    }

    public String getEventDate() {
        String[] tokenizedDate = EventDate.split("\\s");
        int i=0;
        String date = "";
        while(i<3)
        {
            date = date + " " + tokenizedDate[i];
            i++;
        }
        return  date;
    }

    public String getSimpleDate() {
        String[] tokenizedDate = EventDate.split("\\s");
        int i=0;
        String date = "";
        while(i<4)
        {
            date = date + " " + tokenizedDate[i];
            i++;
        }
        return  date;
    }

    public String getKey() { return Key; }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }

    public String getEventImage() {
        return EventImage;
    }

    public void setEventImage(String eventImage) {
        EventImage = eventImage;
    }
}
