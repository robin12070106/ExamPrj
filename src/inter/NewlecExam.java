package inter;

import oop.inter.entity.Exam;

public class NewlecExam extends Exam{
	
	//모자란 기능 확장하기
	private int com;

	
	//선택지 주기(overload)
	public NewlecExam() {
			
	}	

	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com=com;
	}
	
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		
		return super.total()+com;
	}

	@Override
	public float avg() {
		
		return total()/4.0f;
	}
	
	
		
	
}
