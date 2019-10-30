package gr.athtech.ioo;

public class Flight {
    private String arAirport;
    private String depAirport;
    private Time depTime;
    private Time arTime;

    public void setArAirport(String arAirport) {
        this.arAirport = arAirport;
    }

    public String getArAirport() {
        return arAirport;
    }

    public void setDepAirport(String depAirport) {
        this.depAirport = depAirport;
    }

    public String getDepAirport() {
        return depAirport;
    }
    public String toString(){
        return "Departing: " + depAirport + ", Arriving: " + arAirport;
    }

    public Time getDepTime() {
        return depTime;
    }

    public void setDepTime(Time depTime) {
        this.depTime = depTime;
    }

    public Time getArTime() {
        return arTime;
    }

    public void setArTime(Time arTime) {
        this.arTime = arTime;
    }

}
