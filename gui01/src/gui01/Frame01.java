package gui01;

import java.awt.Color;
import java.awt.Frame;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��15�� ����10:00:56
 */
public class Frame01 {

	public static void main(String[] args) {
		
		
		Frame f = new Frame("�ҵĵ�һ��frame");//�����ﴴ��һ�����ڶ��󣬴��ڴ����ڴ��С�
		
		f.setLocation(100, 100);//���ô��ڵ�λ��
		
		f.setBackground(Color.BLUE);//���ô��ڵı�����ɫ
		
		f.setSize(200, 200);//���������ô�С,����1 ��  ����2  ��  ��������
		
		f.setResizable(false);//���ô��ڵĴ�С���ɱ�
		
		f.setVisible(true);//���ô��ڵĿɼ��ԣ�д�������
		
		
		
	}
				
}
