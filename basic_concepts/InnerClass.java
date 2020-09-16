

public class InnerClass {

	private String msg="Welcome to Java"; 
	 
	//Inner or Nested class
	 class Inner {  
	  void hello(){
		  System.out.println(msg+", Let us start learning Inner Classes");
		  }  
	 } 
	 
	public static void main(String[] args) {
		
		InnerClass obj=new InnerClass(); //Create object of outer class
		InnerClass.Inner in = obj.new Inner(); 
		in.hello();
		
	}

}
