
//public class 천을_넘는_예외 extends RuntimeException {
public class 천을_넘는_예외 extends Exception {
	@Override
	public void printStackTrace() {
//		// TODO Auto-generated method stub
//		super.printStackTrace();
		System.out.println("천을 넘는 예외가 발생하였습니다.");
	}
}
