package com.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateMemberDisplay extends JFrame{
	private final String[] labels= {"�̸�","�Ҽ�","����"};
	private JTextField []field = new JTextField[3];
	private JButton confirmBtn;
	private JButton cancelBtn;
	private JPanel textPnl, btnPnl;
	public CreateMemberDisplay()
	{
		setTitle("Add Member Manager");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		textPnl = new JPanel(new GridLayout(3,2));
		for(int i=0;i<3;i++) {
			textPnl.add(new JLabel(labels[i]));
			field[i] = new JTextField(30);
			textPnl.add(field[i]);
		}
		this.add("Center",textPnl);
		
		btnPnl = new JPanel(new FlowLayout());
		confirmBtn = new JButton("�߰�");
		cancelBtn = new JButton("���");
		btnPnl.add(confirmBtn);
		btnPnl.add(cancelBtn);
		this.add("South",btnPnl);
		
		
		setVisible(true);
	}
}