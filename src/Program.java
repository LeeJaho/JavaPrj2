import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

//import ex10.oop.example.Console;
import ex10.oop.is_a.inter.*;

public class Program {
	
	public static void main(String[] args) {

		/*NewlecExam exam = new NewlecExam();
		
		//�߻� Ŭ���� : ���� ������ �� ��ü���� ���� �и�
		
		//Constructor DI
		
		// ��� 1 : �������̽��� ���ο� Ŭ������ ����
		//ConsoleListener listener = new NewlecConsoleListener();
		
		// ��� 2 : �������̽��� ���� Ŭ������ ����
		// NewlecExam.java�� �����ٰ� �� �� ���� 
		//(com ����, exam ��ü ���� �ȹ޾Ƽ� �ᵵ �ȴ�.)
		
		//dependency injection : ������ ���� : ��ǰ�� ���ս�Ű�� �� : 
		//setter DI(Dependenct Injection)
		//console.setExam(new NewlecExam());
		
		// ��� 3 : ��ø Ŭ������ ����
		//ConsoleListener listener = exam.new NewlecConsoleListener();
		
		// ��� 4 : �޼ҵ� ���� ��ø Ŭ������ ����
		// ��� 5 : �޼ҵ� ���� ��ø Ŭ������ �͸����� ���� -> ������ �ѹ��� ����ҰŴϱ� �͸� Ŭ������
		//class NewlecConsoleListener // new�� �����!
			implements
		ConsoleListener listener = new ConsoleListener() {
			@Override
			public void onPrint(Exam exam) {
				// TODO Auto-generated method stub
				Scanner a = new Scanner(System.in);
				NewlecExam newlecExam = (NewlecExam) exam;

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
				NewlecExam newlecExam = (NewlecExam) exam;
				int com = 0;
				do {
					System.out.printf("            %d��° ��ǻ�� > ", 0 + 1);
					com = a.nextInt();
					newlecExam.setCom(com);
					if (com < 0 || com > 100)
						System.out.println("\n   ������ ����(0~100)�� ������ϴ�.");
				}while (com < 0 || com > 100);
			}
		};
		
		ExamConsole console = new ExamConsole(exam);
		
		console.setConsoleListener(listener);
		console.input();
		console.output();*/

		CanvasFrame win = new CanvasFrame();
		win.setSize(500, 700);
		win.setVisible(true); //update() -> paint()
		win.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
			
		
	}

}