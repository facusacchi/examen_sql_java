package factory;

import java.util.HashMap;
import java.util.Map;

import exceptions.NoImplementationException;
import multiply.IterativeMultiply;
import multiply.MultiplyInterface;
import multiply.SimpleMultiply;
import multiply.SpecialMultiply;

public class MultiplyFactory {
	
	private static Map<String, MultiplyInterface> multiplications = new HashMap<>();
	private static final String ECEPTION_MESSAGE = "No existe ninguna instancia para dicho argumento";
	public static int invCount;
	public static int errCount;
	
	static {
		multiplications.put("simpleMultiply", new SimpleMultiply());
		multiplications.put("iterativeMultiply", new IterativeMultiply());
		multiplications.put("specialMultiply", new SpecialMultiply());
	}
	
	public MultiplyInterface getInstance(String className) throws NoImplementationException {
		invCount++;
		MultiplyInterface instance = multiplications.get(className);
		
		if(instance == null) {
			errCount++;
			throw new NoImplementationException(ECEPTION_MESSAGE);
		}
		
		return instance;
	}
}
