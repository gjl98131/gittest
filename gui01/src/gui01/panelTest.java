package gui01;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��15�� ����11:03:12
 */
public class panelTest {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Test Panel");
		
		frame.setLayout(null);//����������һ������ģʽ
		
		Panel panel = new Panel();
		
		frame.setBounds(100,100,300,300);//ͬʱ���ô��ڵ�λ�û��д�С,��ʱ��λ����λ��ԭ��
		
		frame.setVisible(true);
		
		panel.setBounds(50, 50, 100, 100);//��ʱ��λ���Ǹ��ݴ�����˵��.ͬʱ�������λ�úʹ�С
		
		frame.setBackground(Color.red);
		
		panel.setBackground(Color.blue);//�������ı�����ɫ
		
		frame.add(panel);//�������ӽ�����
		
	}
	
}
