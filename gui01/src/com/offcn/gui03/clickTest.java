package com.offcn.gui03;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��17�� ����4:14:30
 */
public class clickTest {

	static int click;
	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		
		frame.setLayout(new BorderLayout(0,0));
		
		JButton jButton = new JButton("���һ��");
		JLabel jLabel = new JLabel();
		jLabel.setText("");
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			jLabel.setText("�����"+(++click)+"��");
				
			}
		});
		
		
		
		
		
		frame.add(jButton,BorderLayout.NORTH);
		
		frame.add(jLabel,BorderLayout.SOUTH);
		
		frame.setSize(300, 100);
	
		
		frame.setVisible(true);

	}

}
