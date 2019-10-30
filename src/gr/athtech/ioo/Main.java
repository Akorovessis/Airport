package gr.athtech.ioo;

public class Main {

    public static void main(String[] args) {
	Flight f1 = new Flight();
	f1.setDepAirport("Athens");
	Time t1 = new Time();
	//t1.setHour(10);
	//t1.setMin(20); these are the same as t1.setTime
	//t1.setSec(35);
	t1.setTime(13,20,35);
	f1.setDepTime(t1);

	f1.setArAirport("Montreal");
	Time t2 = new Time();
	t2.setTime(10,35,00);
	f1.setArTime(t2);
        System.out.println(f1.toString());
        t1.displayTime();
    }
}
