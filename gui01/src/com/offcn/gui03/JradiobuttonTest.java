package com.offcn.gui03;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��17�� ����2:07:26
 */
public class JradiobuttonTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("�������ĸ�����");
		
		JRadioButton jRadioButton1 = new JRadioButton("����");
		JRadioButton jRadioButton2 = new JRadioButton("����",true);
		JRadioButton jRadioButton3 = new JRadioButton("����");
		JRadioButton jRadioButton4 = new JRadioButton("����");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		buttonGroup.add(jRadioButton3);
		buttonGroup.add(jRadioButton4);
		
		jPanel.add(jLabel);
		
		jPanel.add(jRadioButton1);
		jPanel.add(jRadioButton2);
		jPanel.add(jRadioButton3);
		jPanel.add(jRadioButton4);
		
		
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(100, 100, 400, 200);
		
		jFrame.setVisible(true);

	}

}
