import java.util.Scanner;

import ex10.oop.is_a.inter.ConsoleListener;
import ex10.oop.is_a.inter.Exam;

public class NewlecConsoleListener implements ConsoleListener {

	@Override
	public void onPrint(Exam exam) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		NewlecExam newlecExam = (NewlecExam)exam;
		
		System.out.printf("                闡У攪 : %d \n\n", newlecExam.getCom());		

		System.out.printf("                識薄 : %d \n", newlecExam.total());
		System.out.printf("                ゎ敕 : %.2f \n", newlecExam.avg());
		System.out.println();
		System.out.println(" 式式式式式式式式式式式式式式式式式式");
	}
	
	
	@Override
	public void onInput(Exam exam) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		NewlecExam newlecExam = (NewlecExam)exam;
		int com = 0;
		do {
			System.out.printf("            %d廓簞 闡У攪 > ",0+1);
			com = a.nextInt();
			newlecExam.setCom(com);
			if(com < 0 || com > 100)
				System.out.println("\n   撩瞳曖 彰嬪(0~100)蒂 慇橫陬蝗棲棻.");
		}
		while(com < 0 || com > 100);
		
	}

}
