package com.offcn.gui02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����2:50:24
 */
public class actionListenerTest {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		Button button = new Button("ȷ��");
		
		Button button1 = new Button("ȡ��");
	
		
		frame.setLayout(new GridLayout(1,2));

		frame.add(button);
		frame.add(button1);
		
		button.addActionListener(new Myactionlistener());;
		button1.addActionListener(new Myactionlistener());
		
		frame.pack();
		
		frame.setVisible(true);
		
	}

}
class Myactionlistener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//if�������ж����  �����������������ʽ ��������ִ��if�ؼ��ֺ�Ĵ���飬����ִ��else��Ĵ����
		if (e.getActionCommand().equals("ȷ��")) {
		
			Frame frame = new Frame("�´���");
		
		
			frame.setSize(200,200);
		
		
			frame.setVisible(true);
		
		}else {
			
			System.exit(0);
		}		
		
	}
		
}
