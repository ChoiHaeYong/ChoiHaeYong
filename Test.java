package ch99;
import java.awt.*;
import java.awt.event.*;
public class Test extends Frame{
	//������
	public Test(){
		super("âũ��");//����Ŭ���� ������ ȣ��
		addWindowListener(new MyWin());//�̺�Ʈ ���
		setSize(450,450);//âũ��
		setVisible(true);//âǥ��
	}//cons
	
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);//���α׷� ����
		}
	}//inner class
	
	public static void main(String args[]){
		new Test();//��ü ����
	}//main-end
}//class-end
