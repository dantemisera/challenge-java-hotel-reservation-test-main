import java.util.Scanner;

public class Main{

	public static void main(String []args){
			Scanner scn = new Scanner(System.in);
			String input = scn.nextLine();

			HotelReservation hotelReserv = new HotelReservation();
			System.out.println(hotelReserv.getCheapestHotel(input));

			while(scn.hasNext()){
				System.out.println(hotelReserv.getCheapestHotel(scn.nextLine()));
			}
	}

}