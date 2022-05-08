import java.util.List;
import java.util.ArrayList;

public class InputHandler{
	private String clientType;
	private List<Date> dateList;

	

	InputHandler(String input){
			String []myparts = input.split(":");
			String []myDates = myparts[1].split(",");
			
			this.clientType = myparts[0];
			this.dateList = new ArrayList<Date>();
			for(String date : myDates)
				dateList.add(new Date(date.trim()));

		

	}
	public static void main(String []args){
		InputHandler i = new InputHandler("Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)");
		System.out.println(i.getClientType());
		for(Date d: i.getDates())
			System.out.println(d);
	}


	public String getClientType(){
		return this.clientType;
	}

	public List<Date> getDates(){
		return this.dateList;
	}


}