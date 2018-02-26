import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

//import ex10.oop.example.Console;
import ex10.oop.is_a.inter.*;

public class Program {
	
	public static void main(String[] args) {

		/*NewlecExam exam = new NewlecExam();
		
		//추상 클래스 : 내가 만들어야 할 개체들의 공통 분모
		
		//Constructor DI
		
		// 방법 1 : 인터페이스를 새로운 클래스에 구현
		//ConsoleListener listener = new NewlecConsoleListener();
		
		// 방법 2 : 인터페이스를 기존 클래스에 구현
		// NewlecExam.java에 가져다가 쓸 수 있음 
		//(com 변수, exam 객체 따로 안받아서 써도 된다.)
		
		//dependency injection : 의존성 주입 : 부품을 결합시키는 것 : 
		//setter DI(Dependenct Injection)
		//console.setExam(new NewlecExam());
		
		// 방법 3 : 중첩 클래스에 구현
		//ConsoleListener listener = exam.new NewlecConsoleListener();
		
		// 방법 4 : 메소드 내부 중첩 클래스에 구현
		// 방법 5 : 메소드 내부 중첩 클래스를 익명으로 구현 -> 어차피 한번만 사용할거니까 익명 클래스로
		//class NewlecConsoleListener // new로 만든다!
			implements
		ConsoleListener listener = new ConsoleListener() {
			@Override
			public void onPrint(Exam exam) {
				// TODO Auto-generated method stub
				Scanner a = new Scanner(System.in);
				NewlecExam newlecExam = (NewlecExam) exam;

				System.out.printf("                컴퓨터 : %d \n\n", newlecExam.getCom());

				System.out.printf("                총점 : %d \n", newlecExam.total());
				System.out.printf("                평균 : %.2f \n", newlecExam.avg());
				System.out.println();
				System.out.println(" ──────────────────");
			}

			@Override
			public void onInput(Exam exam) {
				// TODO Auto-generated method stub
				Scanner a = new Scanner(System.in);
				NewlecExam newlecExam = (NewlecExam) exam;
				int com = 0;
				do {
					System.out.printf("            %d번째 컴퓨터 > ", 0 + 1);
					com = a.nextInt();
					newlecExam.setCom(com);
					if (com < 0 || com > 100)
						System.out.println("\n   성적의 범위(0~100)를 벗어났습니다.");
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