package addition1;

public class AdditionTest {

	public static void main(String[] args) {
		int Num1 = 19;
		int Num2 = 2;
		int Sum = 0;
		try {
			Sum = Num1 + Num2;
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Addition of 2 numbers :" + Sum);
	}

}
