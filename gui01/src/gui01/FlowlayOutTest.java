package gui01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��15�� ����11:21:16
 * 
 * ��ʽ���֣����մ��������У���Ȳ������л��С�
 * ��ʽ���� Ĭ���Ǿ��в���
 * 
 */
public class FlowlayOutTest {
public static void main(String[] args) {
	
	Frame frame = new Frame();
	
	//��һ��������ʾ����ķ�ʽ���ڶ���������ʾ ˮƽ���  ������������ʾ��ֱ���,���������ִ���ˮƽ��ʽ�Ĳ���
	frame.setLayout(new FlowLayout(2,20,20));//����frame�Ĳ���Ϊ��ʽ����
	
	Button button1 = new Button("button1");
	Button button2 = new Button("button2");
	Button button3 = new Button("button3");
	
	frame.add(button1);
	frame.add(button2);
	frame.add(button3);
	
	frame.pack();//���ò��ֵ���Ѵ�С��λ��
	
	frame.setVisible(true);
	}
}
