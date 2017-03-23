package inter;

import oop.inter.entity.Exam;
import oop.inter.ui.PrintListener;

public class NewlecPrintListener implements PrintListener {

	public void onPrint(Exam exam){
		NewlecExam nexam = (NewlecExam)exam;
		System.out.printf(" 컴퓨터 : %d\n ", nexam.getCom());
	}
}
