package gui01;

import java.awt.Color;
import java.awt.Frame;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��15�� ����10:41:07
 * �������frame����
 */
public class Frame02 {

	public static void main(String[] args) {
		
		new Myframe(100, 100, 200, 200, Color.BLACK);
		new Myframe(300, 100, 200, 200, Color.red);
		new Myframe(100, 300, 200, 200, Color.green);
		new Myframe(300, 300, 200, 200, Color.blue);
		
		
	}
}

/*myfram�ͼ̳���Frame������
 * ����frame�еķ���������
 * */
class Myframe extends Frame{
	
	//����Myframe�Ĺ��췽��������Ҫ�Ĳ�������װ���� �ڴ����������ʱ���췽��ִ�С�
	public Myframe(int x,int y,int width, int height,Color c) {
		setLocation(x, y);
		setSize(width, height);
		setBackground(c);
		setVisible(true);
	}
	
}