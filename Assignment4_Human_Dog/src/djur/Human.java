package djur;


public class Human {

	private Dog dog;
	private String name;
	private String info;
	

	public Human(String name){
		this.name = name;
	
	}
	
	public String getName(){
		return name;
	}
	
	public void buyDog(Dog dog){
		this.dog = dog;
	}
	
	
	/**Returns if X owns a dog named Y, or if X doesn't own a dog*/
	public String getInfo(){
		
		
		if(dog != null){
			String info = name + " owns " + dog.getName();
			return info;
		
	}else{
		String info = name + " there is no dog.";
		return info;
	}

}
	
	
	
		
}
