package animals;

public class Cat extends Mammal {
	
	public int hasLives;
	
	public Cat(String name, int nursing, int lives){
		super(name, nursing);
		this.hasLives = lives;
	}

	
	
	@Override
	public String getInfo(){
		String info = "This cat is called " + this.name + " and nurse for " + this.nursing + " months and has " + this.hasLives + " lives.";

		return info;
		
	}

}
