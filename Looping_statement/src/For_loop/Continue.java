package For_loop;


	
			  
			class Animal
			  
			{
			  
			  String name = "animal";
			  
			  String makeNoise()  { return "generic noise"; }
			  
			}
			  
			class Dog extends Animal 
			  
			{
			  
			  String name = "dog";
			  
			  String makeNoise() {  return "bark"; }
			  
			}
			  
			public class Continue {
			  
			
			  
			  public static void main(String[] args)
			  
			  { 
			  
			   Animal an = new Dog();
			  
			   System.out.println(an.name+" "+an.makeNoise());
			  
			  }
			  
			}


