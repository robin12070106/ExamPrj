import entitiy.NewlecExam;
import oop.abstrac.entity.Exam;
import oop.abstrac.ui.ExamConsole;


public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam();
		ExamConsole console = new NewlecExamConsole(exam);
		
		console.input();
		console.print();
				
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
