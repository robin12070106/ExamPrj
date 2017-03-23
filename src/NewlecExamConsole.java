import java.util.Scanner;

import entitiy.NewlecExam;
import oop.abstrac.entity.Exam;
import oop.abstrac.ui.ExamConsole;

public class NewlecExamConsole extends ExamConsole {

	public NewlecExamConsole(Exam exam) {
		super(exam);
	
	}

	@Override
	protected void onPrint() {
		
		NewlecExam exam= (NewlecExam)getExam();
		
		System.out.printf(" 컴퓨터 : %d\n ", exam.getCom());
	}

	 @Override
	public void input() {
	
		super.input();

		NewlecExam exam= (NewlecExam)getExam();
		int com=0;
		Scanner scan = new Scanner(System.in);
		do {
	         System.out.print(" 컴퓨터 : ");
	         com = scan.nextInt();
	         
	         if (com < 0 || com > 100)
	            System.out.println("성적의 입력 범위는 0~100까지입니다.");
	      } while (com < 0 || com > 100);
		
		exam.setCom(com);
	 }
	
}


