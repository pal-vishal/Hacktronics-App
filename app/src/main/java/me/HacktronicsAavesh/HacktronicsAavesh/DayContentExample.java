package me.HacktronicsAavesh.HacktronicsAavesh;

public class DayContentExample {
    private String EventInfoEx;
    private String VenueInfoEx;
    private String TimeNoEx;
    private String TimeWordEx;
    private boolean expanded;


    public DayContentExample(String EventInfoEx, String VenueInfoEx, String TimeNoEx, String TimeWordEx){
        this.EventInfoEx = EventInfoEx;
        this.VenueInfoEx = VenueInfoEx;
        this.TimeWordEx = TimeWordEx;
        this.TimeNoEx = TimeNoEx;
        this.expanded = false;

    }
    public String getEventInfoEx() {
        return EventInfoEx;
    }

    public void setEventInfoEx(String eventInfoEx) {
        EventInfoEx = eventInfoEx;
    }

    public String getTimeNoEx() {
        return TimeNoEx;
    }

    public void setTimeNoEx(String timeNoEx) {
        TimeNoEx = timeNoEx;
    }

    public String getTimeWordEx() {
        return TimeWordEx;
    }

    public void setTimeWordEx(String timeWordEx) {
        TimeWordEx = timeWordEx;
    }

    public String getVenueInfoEx() {
        return VenueInfoEx;
    }

    public void setVenueInfoEx(String venueInfoEx) {
        VenueInfoEx = venueInfoEx;
    }
    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
}
