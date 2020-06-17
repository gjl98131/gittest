package com.offcn.gui02;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����9:55:20
 */
public class Textfieldlistener {

	public static void main(String[] args) {
		
		Frame frame = new Frame("test textfieldlistener");
		
		TextField textField = new TextField();
		
		frame.add(textField);
		
		textField.addActionListener(new Myactinlistener06());
		//���ı��ı����ַ��ĳ��Ǻ�,��������ʱ��ʱ��Ȼ���Եõ��ı�����
		textField.setEchoChar('*');
		
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}

class Myactinlistener06 implements  ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// ����e�����е�getSource�Ὣ�¼�����Դ���ظ�����,Object�Ƕ���Ķ�������
		/*
		 * ��ȡ���ı�����֮��Ϳ��Զ��ı�������в����������ı������е�gettext��������
		 * �õ��ı��е����ݡ�������setText�������������ı�������.
		 * 
		 * */
		TextField tf = (TextField)e.getSource();
		
		System.out.println(tf.getText());
		
		tf.setText("");
	}
	
}
