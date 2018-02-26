import java.util.Scanner;

import ex10.oop.is_a.inter.*;

public class NewlecExam extends Exam /*implements ConsoleListener*/ {
	
	//Exam이 base class, Newlec이 extended class, 부모 자식, 상위 하위, 기저 기반 등 이름은 많다. 개념이 중요한 거지 이름이 중요한게 아니다.
	private int com;
	
	public NewlecExam()
	{
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com)
	{
		super(kor, eng, math);
		this.com = com;
	}
	
	public int getCom() {
		return com;
	}
	
	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return super.total() + com;
	}
	
	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total() / 4.0f;
	}
	
	//중첩 클래스
	/*public class NewlecConsoleListener 
		implements ConsoleListener{
		@Override
		public void onPrint(Exam exam) {
			// TODO Auto-generated method stub
			Scanner a = new Scanner(System.in);		
			NewlecExam newlecExam = (NewlecExam)exam;
			
			System.out.printf("                컴퓨터 : %d \n\n", com);		
	
			System.out.printf("                총점 : %d \n", newlecExam.total());
			System.out.printf("                평균 : %.2f \n", newlecExam.avg());
			System.out.println();
			System.out.println(" ──────────────────");
		}
		
		@Override
		public void onInput(Exam exam) {
			// TODO Auto-generated method stub
			Scanner a = new Scanner(System.in);
			NewlecExam newlecExam = (NewlecExam)exam;
			do {
				System.out.printf("            %d번째 컴퓨터 > ",0+1);
				com = a.nextInt();
				setCom(com);
				if(com < 0 || com > 100)
					System.out.println("\n   성적의 범위(0~100)를 벗어났습니다.");
			}
			while(com < 0 || com > 100);
			
		}
	}*/
	
}
