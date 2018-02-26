import java.util.Scanner;

import ex10.oop.is_a.inter.ConsoleListener;
import ex10.oop.is_a.inter.Exam;

public class NewlecConsoleListener implements ConsoleListener {

	@Override
	public void onPrint(Exam exam) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		NewlecExam newlecExam = (NewlecExam)exam;
		
		System.out.printf("                ��ǻ�� : %d \n\n", newlecExam.getCom());		

		System.out.printf("                ���� : %d \n", newlecExam.total());
		System.out.printf("                ��� : %.2f \n", newlecExam.avg());
		System.out.println();
		System.out.println(" ������������������������������������");
	}
	
	
	@Override
	public void onInput(Exam exam) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		NewlecExam newlecExam = (NewlecExam)exam;
		int com = 0;
		do {
			System.out.printf("            %d��° ��ǻ�� > ",0+1);
			com = a.nextInt();
			newlecExam.setCom(com);
			if(com < 0 || com > 100)
				System.out.println("\n   ������ ����(0~100)�� ������ϴ�.");
		}
		while(com < 0 || com > 100);
		
	}

}
