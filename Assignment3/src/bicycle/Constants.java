package bicycle;

public class Constants {
	/**Constant declared minimal size of Bike (being 8")*/
	public static final int MIN_SIZE=8;
	
	/**Constant declared maximal size of Bike (being 28")*/
	public static final int MAX_SIZE=28;
	
	/**Constant declared minimal price of Bike (being 0kr)*/
	public static final int MIN_PRICE=0;
	
	/**Constant declared maximal price of Bike (being 30000kr)*/
	public static final int MAX_PRICE=30000;
	
	/**Method checks if a color is available or not */
	public static String [] colorArray={"red", "blue", "indigo", "black"};
	public static String colorCheck(String col){
		boolean check = false;
		for(int i = 0; i<colorArray.length; i++) {
			if(col.equals(colorArray[i])) {
				check = true;
			}
		}
		if(check == true){
			return col;
		} else {
			return "not available";
		}
	}
}