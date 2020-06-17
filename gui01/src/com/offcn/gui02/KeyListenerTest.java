package com.offcn.gui02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����3:41:33
 */
public class KeyListenerTest {

	public static void main(String[] args) {
		
		Frame frame = new Frame("test keylistener");
		
		frame.setLayout(new GridLayout(2,1));
		
		frame.setSize(300,200);
		
		Button button = new Button("�밴�¼���");
		
		TextField textField = new TextField();
		
		button.addKeyListener(new MyKeyListener(textField));
		
		frame.add(button);
		
		frame.add(textField);
		
		
		
		frame.setVisible(true);

	}

}

class MyKeyListener implements KeyListener{

	TextField t1;
	
	public MyKeyListener(TextField t1) {
		
		this.t1 = t1;
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		/*
		 * t1.settext �����ı����е�����  ��Ҫ�ַ�����Ϊ����
		 * 
		 * t1.gettext  ��ȡ��ǰ�ı����е����� ��e.getkeychar(���̰��µ�ÿ���ַ�) ƴ��
		 * �õ�һ���ַ���
		 * */
		
		t1.setText(t1.getText()+e.getKeyChar());
		 
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

