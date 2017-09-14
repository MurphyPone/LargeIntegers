
public class LargeIntegerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates two tester arrays of integers
		int[] x = new int[] {1,2,3,4,5};
		int[] y = new int[] {9,9,9,9,9};
		
		//Creates new Handler 
		Handler addEmUp = new Handler(x.length);
		
		for(int i = 0; i < x.length; i ++) {
			System.out.println("Simple Addition Position: " + i + " = " + addEmUp.add(x,  y)[i]);
		}
		
		//COMPLEX ADDITION 
		for(int i = 0; i < x.length; i ++) {
			System.out.println("Complex Addition Position: " + i + " = " + addEmUp.addComplex(x,  y)[i]);
		}
		
		//DISHES
		//CHARLIE 5:30-7 
		//CHARLIE 7 @ ST.Louis

	}

}
