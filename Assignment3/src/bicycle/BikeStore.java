package bicycle;

import java.util.ArrayList;
public class BikeStore {
	
	
	private ArrayList<Bike> bikelist = new ArrayList<Bike>();
	
	/**Method loops through the Array-List*/
	public String getAllBikes(){
		String bikeShop = "";
		for(int i = 0; i<bikelist.size(); i++) {
			Bike s = bikelist.get(i);
			
			bikeShop = bikeShop + (" Color is " + s.getColor()+ ".\n Size is " + s.getSize()+"\n Price is " + s.getPrice() + "\n");
					
		}
		return bikeShop;
	}

	
	/**Method that adds information to ArrayList*/
	public void addBikes(String _color, int _size, int _price) {
		bikelist.add(new Bike(_color.toLowerCase(), _size, _price));
	}
}