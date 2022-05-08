import java.util.List;
import java.util.ArrayList; 
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HotelReservation {
   
	private void orderHotelsList(List<Hotels> hotels){
		Collections.sort(hotels,new Comparator<Hotels>(){
				public int compare(Hotels ho1, Hotels ho2) {
       					if(ho1.getTotalPrice()==ho2.getTotalPrice()){
       						if(ho1.getClassification()>=ho2.getClassification())
       							return 1;
       						else
       							 return -1;
       					}
       					else if(ho1.getTotalPrice()>ho2.getTotalPrice())
       						return -1;
       					else
       						return 1;
  				 }
			});
	}

    public String getCheapestHotel (String input) {
       		InputHandler i = new InputHandler(input);
			
			Hotels h1 = new Lakewood();
			Hotels h2 = new Bridgewood();
			Hotels h3 = new Ridgewood();

			HotelExpenditureCalculator.calculate(h1,i);
			HotelExpenditureCalculator.calculate(h2,i);
			HotelExpenditureCalculator.calculate(h3,i);

			List<Hotels> hotelList  = Arrays.asList(h1,h2,h3);
			
			orderHotelsList(hotelList);

			return hotelList.get(hotelList.size()-1).toString();

    }
   

}
