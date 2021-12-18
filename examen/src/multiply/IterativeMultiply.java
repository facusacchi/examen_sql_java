package multiply;

public class IterativeMultiply implements MultiplyInterface{

	@Override
	public int multiply(int a, int b) {
		int result = 0;
		
		for(int i=0; i<a; i++) {
			result += b;
		}
		
		return result;
	}

}
