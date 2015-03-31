package test;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.*;
import javax.swing.*;

public class BlogGUI implements ActionListener { 
	
	private JFrame mainFrame;
	private JTextArea postTextArea;
	private JTextField postContent;
	private JButton refresh =new JButton("refresh");
	private JButton post =new JButton("post");
	private JPanel subFrame;
	private JPanel subFrame2;
	private JLabel startInfo = new JLabel("Here");
	int size = 600;

	public BlogGUI() {

	}
	public void setWindow() {
			mainFrame = new JFrame("Untitled");
			mainFrame.setSize(size,size);
			mainFrame.setLayout(new GridLayout(2,1));
			//mainFrame.setLayout(new FlowLayout());
			subFrame = new JPanel();
			subFrame.setSize(size-10,size/2);
			subFrame.setLayout(new BorderLayout());
			postTextArea = new JTextArea("What's on your mind?");
			
			subFrame2 = new JPanel();
			
			postContent = new JTextField("Here is the text!");
			refresh.setPreferredSize(new Dimension(270,50));
			post.setPreferredSize(new Dimension(270,50));
			postTextArea.setPreferredSize(new Dimension(540,200));
			postTextArea.setBackground(Color.white);
			postTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
			postContent.setPreferredSize(new Dimension(540,200));
			postContent.setBorder(BorderFactory.createLineBorder(Color.black));
			postContent.setBackground(null);
			postContent.setHorizontalAlignment(JTextField.CENTER);
			
			subFrame.add(startInfo, BorderLayout.PAGE_START);
			
			subFrame2.setLayout(new GridLayout(1,2));
			subFrame2.add(refresh);subFrame2.add(post);
			subFrame.add(postTextArea, BorderLayout.CENTER);
			
			subFrame.add(subFrame2, BorderLayout.PAGE_END);
			
			mainFrame.add(subFrame); 
			mainFrame.add(postContent); 
			
			
			mainFrame.setVisible(true);
			post.addActionListener(this);
			refresh.addActionListener(this);


	}
	public static void main(String[] args) {
		BlogGUI blogGUi = new BlogGUI();
		blogGUi.setWindow();
	
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == post) {
			postContent.setText("post");
			}
		if (e.getSource() == refresh) {
			postContent.setText("refresh");
			}

	}
	
}