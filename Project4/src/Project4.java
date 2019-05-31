
public class Project4 {

	public static void main(String[] args) {
		int result = multiply(20,5);
		System.out.println("" + result);
	}

	
	static int multiply (int i, int j) {
	
		if(j == 1) {
			return i;
		} 
		
		
		int result = multiply(i, j-1);
		
		return result + i;
		
		
		
	}
}
