package com.offcn.gui02;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����4:12:36
 */
public class Jpaneltest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("test jpanel");
		
		jFrame.setSize(200, 200);
		
		JPanel jpanel = new JPanel();
		
		jpanel.setBackground(Color.WHITE);
		
		jFrame.add(jpanel);
		
		JLabel jLabel = new JLabel("test panel");
		
		jpanel.add(jLabel);
		
		jFrame.setVisible(true);
		
	}

}
