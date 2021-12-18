package multiply;

public class SpecialMultiply extends FastMultiply implements MultiplyInterface{

	@Override
	public int multiply(int a, int b) {
		return super.fastMult(a, b);
	}

}
