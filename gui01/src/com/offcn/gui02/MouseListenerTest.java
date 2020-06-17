package com.offcn.gui02;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����3:13:07
 */
public class MouseListenerTest {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		frame.addMouseListener(new MyMouseListener());
		
		frame.setSize(200, 200);

		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		frame.setVisible(true);
	}

}

class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("��ǰ����λ��X:"+e.getX()+",Y:"+e.getY());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
	
	
	
}
