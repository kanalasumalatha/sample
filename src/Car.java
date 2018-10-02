import java.util.*;
public class Car {
	final static  String Manufacture_Company="xyz";
	static int car_object_count;
	String car_no;
	private int car_fuel_capacity;
	private int car_max_speed_limit;
	int running_speed;
	int fuel_in_tank;
	boolean headlight;
 Driver driver;
 String destination;
 String from;
 String starttime;
public Driver Driver;
 public void setcar_fuel_capacity(int car_fuel_capacity)
 {
	 if(car_fuel_capacity>500)
	 {
		 this.car_fuel_capacity=car_fuel_capacity;
		 
	 }
	 else
	 {
		 System.out.println("invalid data");
	 }
 }
 public int get()
 {
	 return car_fuel_capacity;
	 
 }
 public  void setcar_max_speed_limit(int car_max_speed_limit)
 {
	 if(car_max_speed_limit>200)
	 {
		 this.car_max_speed_limit=car_max_speed_limit;;
	 }
	 else
	 {
		 System.out.println("invalid data");
	 }
 }
 public void setfillFuel(int fuel)
 {
	
 }

	

}
