package com.offcn.gui03;

import java.awt.Frame;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��17�� ����3:04:11
 */
public class JcomboBoxTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JComboBox jComboBox = new JComboBox();
		//�������object ����Ķ������� 
		jComboBox.addItem("--��ѡ��--");
		jComboBox.addItem("���֤");
		jComboBox.addItem("���֤");
		jComboBox.addItem("���֤");

		jPanel.add(jComboBox);
		
		frame.add(jPanel);
		
		frame.setSize(300, 300);
		
		frame.setVisible(true);
	}

}
