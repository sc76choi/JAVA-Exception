public class Calculator {
	
	public Calculator() {
				
	}

	public static int add(int x, int y) throws 음수가_되는_예외, 천을_넘는_예외{
		int result = x + y;
		if(result > 1000) {
			throw new 천을_넘는_예외();
		}
		if(result < 0) {
			throw new 음수가_되는_예외();
		}
		return result;
	}

	public static int sub(int x, int y) {
		return x-y;
	}
	public static int multi(int x, int y) {
		return x*y;
	}
	public static int div(int x, int y) {
		return x/y;
	}
}
