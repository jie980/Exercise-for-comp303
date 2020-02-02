package chex5;

import java.lang.reflect.InvocationTargetException;

public class metaq5 {
	private static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> numberClass = Class.forName("java.lang."+args[0]);
		numberClass.getDeclaredMethod("valueof",String.class).invoke(null, args[1]);

	}
	
}
