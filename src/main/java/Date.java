import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Date{
    private String day;
    private String mounth;
    private String year;
    private String dayOfTheWeek;

	Date(String input){
		Pattern p = Pattern.compile("([0-9]{2})+([a-zA-Z]{2,5})+([0-9]{4})+[(]+([a-zA-Z]{2,4})+[)]");
		Matcher m = p.matcher(input);

		if (m.matches())
			this.day = m.group(1);
			this.mounth = m.group(2);
			this.year = m.group(3);
			this.dayOfTheWeek = m.group(4);	
	}

	public boolean isWeekend(){
	
		if(this.dayOfTheWeek.equals("sun") || this.dayOfTheWeek.equals("sat") )
			return true;
		else 
			return false;

	}


}