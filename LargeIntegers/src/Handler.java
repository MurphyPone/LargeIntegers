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
	
		for(int i = size; i > 0; i --) {
			if (a[i] + b[i] < 10)
				result[i] = a[i] + b[i];
			else //need to carry
				result[i-1] ++;
				result[i] = result[i]%10;
		}
		return result;
	}
}
