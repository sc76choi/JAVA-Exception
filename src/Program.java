
public class Program {

	public static void main(String[] args) {
		int result = 0;
		try {
			result = Calculator.add(3, 4);
			System.out.printf("add : %d\n", result);
			result = Calculator.sub(3, 4);
			System.out.printf("sub : %d\n", result);
			result = Calculator.multi(3, 4);
			System.out.printf("multi : %d\n", result);
		} catch (천을_넘는_예외 | 음수가_되는_예외 e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류가 있습니다.");
		} finally {
			System.out.println("\nEnd.");
		}
		result = Calculator.div(3, 0);
		System.out.printf("div : %d\n", result);
	}
}
