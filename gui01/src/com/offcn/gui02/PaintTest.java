package com.offcn.gui02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����1:43:13
 */
public class PaintTest {

	public static void main(String[] args) {
		
		
		Frame frame = new Frame();
		
		frame.setSize(300, 300);
		
		frame.add(new DrawPanel());	
		
		frame.setVisible(true);

	}

}
//����һ�����壬�̳����������е�component������ paint����
class DrawPanel extends Panel{
	//���еĻ滭��������װ�� g ������
	@Override
	public void paint(Graphics g) {
		//������������ɫ
		g.setColor(Color.RED);
		//��һ��ʵ����Բ
		g.fillOval(100, 100, 50, 50);
		
		g.setColor(Color.blue);
		//��һ��ʵ�ľ���
		g.fillRect(100, 150, 100, 100);
		
		Color color = g.getColor();
		
		System.out.println(color);
	}
	
}
