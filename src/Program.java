
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
		} catch (õ��_�Ѵ�_���� | ������_�Ǵ�_���� e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("������ �ֽ��ϴ�.");
		} finally {
			System.out.println("\nEnd.");
		}
		result = Calculator.div(3, 0);
		System.out.printf("div : %d\n", result);
	}
}
