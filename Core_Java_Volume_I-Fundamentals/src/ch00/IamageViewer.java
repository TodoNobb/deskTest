package ch00;

import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 * ͼ���ļ��鿴��
 * @Core_Java_Volume_I-Fundamentals
 * @author: Administrator
 * @version: 1.0
 * @date: 2018��7��14�� ����2:55:13
 * @copyright Just Do IT
 * @power by Windows7
 */
public class IamageViewer {
	public static void main(String[] args) {
		EventQueue.invokeLater(() ->{
			JFrame frame = new IamageViewerFrame();
			frame.setTitle("ImageViewer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
		
	}
}

class IamageViewerFrame extends JFrame
{
	private JLabel label;	//��ǩ
	private JFileChooser chooser;//fileChooser �ļ�ѡ����
	private static final int DEFAULT_WIDTH = 300;	//���
	private static final int DEFAULT_HEIGHT = 400;	//�߶�
	
	//���췽�����ý�������
	public IamageViewerFrame() 
	{
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);//���Ĵ��ڴ�С
		//��ӱ�ǩ
		label = new JLabel();
		add(label);
		//��������
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		//����JMenuBar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		//���JMenu
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		//���JMenuItem
		JMenuItem openItem = new JMenuItem("Open");
		menu.add(openItem);
		openItem.addActionListener(event -> {
			//show file chooser dialog
			int result = chooser.showOpenDialog(null);
			
			//if file selected, set it as icon of the label
			if(result == JFileChooser.APPROVE_OPTION) {
				String name = chooser.getSelectedFile().getPath();
				label.setIcon(new ImageIcon(name));
			}
		});
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(event -> System.exit(0));
	}
}









