package xmlProgram;


public class Program { 	
	
	/**Instance variables*/
	private String name; 			
	private String code; 			
	private int woman; 				
	private int men; 
	
	
	/**Constructor*/
	public Program(String name, String code, int woman, int men){ 
	this.name = name;				 
	this.code = code;				
	this.woman = woman;
	this.men = men;
	
	}
	
	/**This method calls the name of Program and returns the name from the XML file*/
	public String getName(){
		return name; 				
									
	}
	
	/**This method calls the code of Program and returns the code from the XML file*/
	public String getCode(){
		return code; 				
									
	}
	
	/**This method calls the amount of Women and returns the amount from the XML file*/
	public int getWomen(){
		return woman; 				
									
	}
	
	/**This method calls the amount of Men and returns the amount from the XML file*/
	public int getMen(){
		return men; 				
									
	}
	@Override
	public String toString(){
		return name;
	}
	

}
