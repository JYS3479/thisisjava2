package sec02.exam01_if;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		//0.143231~5.231231 -> 0~5.999
		
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		} else if(num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		} else if(num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		} else if(num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		} else if(num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		} else {
			System.out.println("6���� ���Խ��ϴ�.");
		}

	}

}
