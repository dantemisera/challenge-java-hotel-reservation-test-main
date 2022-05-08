import java.util.List;
import java.util.ArrayList; 
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HotelExpenditureCalculator{

	
	static void calculate(Hotels hotelRule, InputHandler input){
			int clientPrices[] = hotelRule.getClientPrices(input.getClientType());
			int soma=0;
		
			for(Date d: input.getDates()){
				if(d.isWeekend()){
					soma += clientPrices[1];
				}
				else
					soma+= clientPrices[0];
			}

			hotelRule.setTotalPrice(soma);
	
		}
	public static void main (String []args){
			InputHandler i = new InputHandler("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)");
			Hotels h1 = new Lakewood();
			Hotels h2 = new Bridgewood();
			Hotels h3 = new Ridgewood();

			HotelExpenditureCalculator.calculate(h1,i);
			HotelExpenditureCalculator.calculate(h2,i);
			HotelExpenditureCalculator.calculate(h3,i);

			List<Hotels> hotelList  = Arrays.asList(h1,h2,h3);
			
			for(Hotels h: hotelList)
				System.out.println(h.toString()+": "+h.getTotalPrice());

			Collections.sort(hotelList,new Comparator<Hotels>(){
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
			for(Hotels h: hotelList)
				System.out.println(h.toString()+": "+h.getTotalPrice());
			
			System.out.println(hotelList);

			hotelList.get(hotelList.size()-1).toString();


	
	}

}