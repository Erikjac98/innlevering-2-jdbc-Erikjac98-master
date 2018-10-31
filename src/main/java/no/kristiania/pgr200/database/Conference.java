package no.kristiania.pgr200.database;

public class Conference {

    private int id;
    private int days;
    private String date;
    private String timeslots;

    public Conference(){

    }

    public Conference(int days, String date, String timeslots){
        this.days = days;
        this.date = date;
        this.timeslots = timeslots;

    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTimeslots(String timeslots) {
        this.timeslots = timeslots;
    }

    public int getDays() {
        return days;
    }

    public String getDate() {
        return date;
    }

    public String getTimeslots() {
        return timeslots;
    }
}
