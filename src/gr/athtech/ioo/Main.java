package gr.athtech.ioo;

public class Main {

    public static void main(String[] args) {
	Flight f1 = new Flight();
	f1.setDepAirport("Athens");
	f1.setArAirport("Montreal");
        System.out.println(f1.toString());
    }
}