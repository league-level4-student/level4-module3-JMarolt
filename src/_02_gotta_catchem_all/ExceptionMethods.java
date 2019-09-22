package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) throws IllegalArgumentException{
		
		try {
			return a/b;
		}catch(IllegalArgumentException e){
			e.printStackTrace();
			throw new IllegalArgumentException("Cannot divide by 0");
		}
		
	}
	
	public String reverseString(String str) throws IllegalStateException{
		try {
			return str;
		}catch(IllegalStateException e){
			e.printStackTrace();
			throw new IllegalStateException("String length is 0");
		}
	}
	
}
