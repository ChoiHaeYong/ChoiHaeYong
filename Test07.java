package ch99;
import java.awt.*;
import java.awt.event.*;
public class Test07 extends Frame{
	//변수
	//생성자
	public Test07(){
		super("창닫기");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setSize(300,300);
		setVisible(true);
	}//cons-end
	
	
	
	
	
	
	public static void main(String[] args) {
		new Test07();
	}//main-end
}//class-end
