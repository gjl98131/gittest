package gui01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��15�� ����1:57:07
 */
public class TestFlowlayout {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		frame.setLayout(new FlowLayout(1,20,20));
		
		frame.setBounds(100,100,250,150);
		
		for (int i = 0; i < 6; i++) {
			
			Button button = new Button("Button");
			
			frame.add(button);
			
		}
		
		frame.setVisible(true);

	}

}
