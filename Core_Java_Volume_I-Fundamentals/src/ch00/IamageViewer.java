package ch00;

import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 * 图像文件查看器
 * @Core_Java_Volume_I-Fundamentals
 * @author: Administrator
 * @version: 1.0
 * @date: 2018年7月14日 下午2:55:13
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
	private JLabel label;	//标签
	private JFileChooser chooser;//fileChooser 文件选择器
	private static final int DEFAULT_WIDTH = 300;	//宽度
	private static final int DEFAULT_HEIGHT = 400;	//高度
	
	//构造方法设置界面属性
	public IamageViewerFrame() 
	{
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);//更改窗口大小
		//添加标签
		label = new JLabel();
		add(label);
		//建立界面
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		//建立JMenuBar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		//添加JMenu
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		//添加JMenuItem
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









