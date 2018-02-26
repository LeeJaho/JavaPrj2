import java.util.Scanner;

import ex10.oop.is_a.inter.*;

public class NewlecExam extends Exam /*implements ConsoleListener*/ {
	
	//Exam�� base class, Newlec�� extended class, �θ� �ڽ�, ���� ����, ���� ��� �� �̸��� ����. ������ �߿��� ���� �̸��� �߿��Ѱ� �ƴϴ�.
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
	
	//��ø Ŭ����
	/*public class NewlecConsoleListener 
		implements ConsoleListener{
		@Override
		public void onPrint(Exam exam) {
			// TODO Auto-generated method stub
			Scanner a = new Scanner(System.in);		
			NewlecExam newlecExam = (NewlecExam)exam;
			
			System.out.printf("                ��ǻ�� : %d \n\n", com);		
	
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
			do {
				System.out.printf("            %d��° ��ǻ�� > ",0+1);
				com = a.nextInt();
				setCom(com);
				if(com < 0 || com > 100)
					System.out.println("\n   ������ ����(0~100)�� ������ϴ�.");
			}
			while(com < 0 || com > 100);
			
		}
	}*/
	
}
