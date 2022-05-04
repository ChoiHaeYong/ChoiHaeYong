package ch99;
import java.awt.*;
import java.awt.event.*;
public class Test extends Frame{
	//생성자
	public Test(){
		super("창크기");//상위클래스 생성자 호출
		addWindowListener(new MyWin());//이벤트 등록
		setSize(450,450);//창크기
		setVisible(true);//창표시
	}//cons
	
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);//프로그램 종료
		}
	}//inner class
	
	public static void main(String args[]){
		new Test();//객체 생성
	}//main-end
}//class-end
