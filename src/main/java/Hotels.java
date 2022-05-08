import java.util.Map;
import java.util.HashMap;


interface Hotels{
	public int[] getClientPrices(String c);
	public String toString();
	public int getClassification();
	public void setTotalPrice(int value);
	public int getTotalPrice();
}



 class Lakewood implements Hotels{
	private  final int classification = 3;
	private Map < String, int[]> rules;
	private final String name = "Lakewood";
	private int totalPrice;

	 Lakewood(){
		this.rules= new HashMap<String, int[]>();
		//[NormalDay,Weekend]
		int specialPrices[] = {80,80};
		int normalPrices [] = {110,90};
		rules.put("Regular",normalPrices);
		rules.put("Rewards",specialPrices);
	}
	public String toString(){
		return this.name;
	}
	public int[] getClientPrices(String clientType){
		return this.rules.get(clientType);	
	}
	
	public int getClassification(){
		return this.classification;
	}

	public void setTotalPrice(int value){
		this.totalPrice=value;
	}
	public int getTotalPrice(){
		return this.totalPrice;
	}
	
}

 class Bridgewood implements Hotels{
	private  final int classification = 4;
	private Map <String,int[]> rules;
	private final String name= "Bridgewood";
	private int totalPrice;

	 Bridgewood(){
		this.rules = new HashMap<String,int[]>();
		int specialPrices[] = {110,50};
		int normalPrices [] = {160,60};
		rules.put("Regular",normalPrices);
		rules.put("Rewards",specialPrices);
	}
	public String toString(){
		return this.name;
	}
	public int[] getClientPrices(String clientType){
		return this.rules.get(clientType);
		
	}
	
	public int getClassification(){
		return this.classification;
	}

	public void setTotalPrice(int value){
		this.totalPrice=value;
	}
	public int getTotalPrice(){
		return this.totalPrice;
	}
	
}

 class Ridgewood implements Hotels{
	private  final int classification = 5;
	private Map <String,int[]> rules;
	private final String name="Ridgewood";

	private int totalPrice;

	 Ridgewood(){
		this.rules = new HashMap<String,int[]>();
		int specialPrices[] = {100,40};
		int normalPrices [] = {220,150};
		rules.put("Regular",normalPrices);
		rules.put("Rewards",specialPrices);
	}
	public String toString(){
		return this.name;
	}
	public int[] getClientPrices(String clientType){
		return this.rules.get(clientType);
	}
	public int getClassification(){
		return this.classification;
	}

	public void setTotalPrice(int value){
		this.totalPrice=value;
	}
	public int getTotalPrice(){
		return this.totalPrice;
	}
	

	
}

