package sec03.exam01_for;

public class ForMultiplicationTableExample2 {

	public static void main(String[] args) {
		for (int m=2; m<=6; m+=4) {
			int i = m + 1;
			int p = m + 2;
			int o = m + 3;
			System.out.println("*** " + m + "�� ***" + "\t" + "*** " + i + "�� ***" + "\t" + "*** " + p + "�� ***" + "\t" + "*** " + o + "�� ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n) + "\t" + i + " x " + n + " = " + (i*n) + "\t" + p + " x " + n + " = " + (p*n) + "\t" + o + " x " + n + " = " + (o*n));  //������ ������ ��� �غ���
			}
		}
		
		
		
		
		

	}


}
