package animals;

public class Snake extends Animal {

	private boolean hasPoison;
	
	public Snake(String name, boolean isPoison){
		super(name);
		this.hasPoison = isPoison;
		
	}
	@Override
	public String getInfo(){
		String info = "This snake is ";
		if(this.hasPoison == true){
			info = info + " dangerous.";
		}else{
			info = info + " harmless.";
		}
		return info;
		
	}
	
}
