package gui01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��15�� ����4:31:48
 */
public class listenerTest {

	public static void main(String[] args) {
		
		myFrame03 myFrame03 = new myFrame03();
		
		myFrame03.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}

}

class myFrame03 extends Frame {
	
	public myFrame03() {
		
		Button button = new Button("Action me");
		//this�ؼ��ֱ�ʾ��ǰ����
		this.add(button);
		//����ť���һ�������¼�����Ҫʵ��actionlistener�ӿ�
		button.addActionListener(new MyActionListener());
		
		pack();
		
		setVisible(true);
		
	}
	
	
}
//ʵ��actionlistener�ӿ�֮����Ҫ��д���ķ�����
class MyActionListener implements ActionListener{
	//���¼�������ʱ�����÷����еĴ���
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("A Button has been Actioned");//�����̨������
		
	}	
	
}