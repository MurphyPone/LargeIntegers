public class Handler {
	private int size;
	
	//Constructors
	public Handler() {size = 30;}
	public Handler(int length) { size = length; }
	
	public int[] add(int[] a, int[] b) {
		int[] result = new int[size];
		
		//THIS WILL NOT CARRY OVER, NEED MORE COMPLEX
		for(int i = 0; i < size; i ++) {
			result[i] = a[i] + b[i];
		}
		return result;
	}
	
	//Iterate backwards and carry numbers >9
	public int[] addComplex(int[] a, int[] b) {
		int[] result = new int[size];
	
		for(int i = size-1; i >= 0; i --) {
			if (a[i] + b[i] < 10)
				result[i] = a[i] + b[i];
			else { //need to carry
				//TODO if first digit is >9, create new [12,3,4,5,6,7] --> [1,2,3,4,5,6,7,] 
				int[] fatResult = new int[size+1];
				fatResult[0] = 1;
				
				for(int j = 1; j < size+1; j++) {
					fatResult[j] = result[j];
				}
			
				//THIS IS WRONG
				fatResult[i] ++;
				fatResult[i] = fatResult[i]%10;
			}
		}
		
		return result;
	}
}
