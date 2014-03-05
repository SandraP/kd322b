package uppgift2;

public class House {
	
	
	private static int nbrOfHouses;
	private int year;
	private int size;
	public static final int MIN_SIZE =10;
	
	public House(int _year,int _size){
		year= _year;
		if(size<MIN_SIZE){
		size= _size;
		}else{
			size = MIN_SIZE;
		
		} nbrOfHouses = nbrOfHouses +1;
	}
	
	

	public static int getNbrOfHouses(){
		return nbrOfHouses;
	}
	
	public int getYear(){
		return year;	
	}
	
	
	public int getSize(){
		return size;	
	}	

}






