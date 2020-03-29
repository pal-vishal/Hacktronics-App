package me.HacktronicsAavesh.HacktronicsAavesh;

public class DayContent {
    private String EventInfo;
    private String VenueInfo;
    private String TimeNo;
    private String TimeWord;


    public DayContent(String EventInfo, String VenueInfo, String TimeNo, String TimeWord) {
        this.EventInfo = EventInfo;
        this.VenueInfo = VenueInfo;
        this.TimeNo = TimeNo;
        this.TimeWord = TimeWord;


    }


    public String getEventInfo() {
        return EventInfo;
    }


    public String getVenueInfo() {
        return VenueInfo;
    }

    public String getTimeNo() {
        return TimeNo;
    }

    public String getTimeWord() {
        return TimeWord;
    }



}
