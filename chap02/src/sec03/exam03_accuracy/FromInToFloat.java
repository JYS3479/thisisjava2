package sec03.exam03_accuracy;

public class FromInToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; //num3 = 123456780  float->double
		num2 = (int) num3; //  ���: -4  �����Ⱚ    ����ε� �� '0'
		
		int result = num1 - num2;
		System.out.println(result);

	}

}
