package inter;

import oop.inter.entity.Exam;
import oop.inter.ui.ExamConsole;
import oop.inter.ui.PrintListener;

public class Program implements PrintListener{
	
	
	private int x=3;// 클래스 안에 별도로 이용하고 싶은 멤버가 있는 경우

	public static void main(String[] args) {
		
		int y = 4;
		
		/*class BB implements PrintListener{
			
			@Override
			public void onPrint(Exam exam) {
				
				System.out.printf("y : %d\n",y);
				
			}
			
		}*/
			
		Exam exam = new NewlecExam();
		ExamConsole console = new ExamConsole(exam);
		
		
		console.setPrintListener((Exam a)->{System.out.printf("y$$ : %d\n",y);});
		
		
		
		/*console.setPrintListener(new PrintListener() {
			
			@Override
			public void onPrint(Exam exam) {

				System.out.printf("y : %d\n",y);
				
			}
		});*/
		
		console.input();
		console.print();

	}

	//if 이미 동일한 메소드가 있을 경우
	@Override
	public void onPrint(Exam exam) {

		
	}

	
	
	//if 이미 동일한 메소드가 있을 경우 중첩 클래스로 해결 가능하다

	class aa implements PrintListener{
		@Override
		public void onPrint(Exam exam) {
	
			NewlecExam nexam = (NewlecExam)exam;
			System.out.printf(" 컴퓨터 : %d,x:%d ", nexam.getCom(), x);
			
		}

	}	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
}
