package com.offcn.gui03;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��17�� ����1:42:32
 */
public class JtextareaTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JTextArea jTextArea = new JTextArea("����������",7,20);
		
		jTextArea.setFont(new Font("����", Font.BOLD, 16));
		
		jTextArea.setBackground(Color.yellow);
		
		jTextArea.setLineWrap(true);//�����ı����Զ�����
		
		JScrollPane jScrollPane = new JScrollPane(jTextArea);//���ı�����ӽ���������
		
		Dimension preferredSize = jTextArea.getPreferredSize();//��ȡ�ı���Ĵ�С����
		
		jScrollPane.setBounds(110, 90, preferredSize.width, preferredSize.height);
		
		jPanel.add(jScrollPane);
		
		frame.add(jPanel);
		
		frame.setBounds(200, 200, 350, 150);
		
		frame.setVisible(true);

	}

}
