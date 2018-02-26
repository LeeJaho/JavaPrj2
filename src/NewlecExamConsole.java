
import java.util.Scanner;

import ex10.oop.is_a.inter.*;


public class NewlecExamConsole extends ExamConsole {
	
	public Exam newExam() {
		// TODO Auto-generated constructor stub
		return new NewlecExam();
		
	}
		
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner a = new Scanner(System.in);
		
		NewlecExam newlecExam = (NewlecExam)getExam();
		int com = 0;
		do {
			System.out.printf("            %d번째 컴퓨터 > ",0+1);
			com = a.nextInt();
			newlecExam.setCom(com);
			if(com < 0 || com > 100)
				System.out.println("\n   성적의 범위(0~100)를 벗어났습니다.");
		}
		while(com < 0 || com > 100);
		
	}
	
	@Override
	protected void onOutput(Exam exam) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		NewlecExam newlecExam = (NewlecExam)getExam();
		
		System.out.printf("                컴퓨터 : %d \n\n", newlecExam.getCom());		

		System.out.printf("                총점 : %d \n", newlecExam.total());
		System.out.printf("                평균 : %.2f \n", newlecExam.avg());
		System.out.println();
		System.out.println(" ──────────────────");
	}

	/*
	@Override
	protected void onInput(Exam exam) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		NewlecExam newlecExam = (NewlecExam)exam;
		int com = 0;
		do {
			System.out.printf("            %d踰덉㎏ 而댄벂�꽣 > ",0+1);
			com = a.nextInt();
			newlecExam.setCom(com);
			if(com < 0 || com > 100)
				System.out.println("\n   �꽦�쟻�쓽 踰붿쐞(0~100)瑜� 踰쀬뼱�궗�뒿�땲�떎.");
		}
		while(com < 0 || com > 100);
	}
	*/
	
}
