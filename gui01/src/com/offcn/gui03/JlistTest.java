package com.offcn.gui03;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��17�� ����3:15:06
 */
public class JlistTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		String[] strs = new String[] {"���֤","���֤","���֤"};
		
		JList jList = new JList(strs);
		
		jPanel.add(jList);
		
		frame.add(jPanel);
		
		frame.setSize(300, 300);
		
		frame.setVisible(true);
		
	}

}
