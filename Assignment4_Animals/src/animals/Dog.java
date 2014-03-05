package animals;

public class Dog extends Mammal {
	
	public boolean isDumb;
	
	public Dog(String name, int nursing, boolean dumbAsHell){
		super(name,nursing);
		this.isDumb = dumbAsHell;
		
	}
	
	
	
	@Override
	public String getInfo(){
		String info = this.name + " is a dog that nurses for " + this.nursing + " months and ";
		if(this.isDumb == true){
			info = info + "it's dumb as hell.";
		}else{
			info = info + "it's not dumb as hell.";
		}
		return info;
		
	}

}
