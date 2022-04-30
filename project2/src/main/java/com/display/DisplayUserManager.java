package com.display;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class DisplayUserManager extends JFrame{
	private final String[] column = {"����","�̸�","�Ҽ�","����"};
	
	private JScrollPane scrolledTable;
	private JTable manageuser;
	private JPanel buttonPanel;
	private JButton usergroupbutton;
	private JButton creatememberbutton;
	
	public DisplayUserManager(){
		setTitle("User Manager");
		setSize(1200,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(1,2));
		
		DefaultTableModel tableModel = new DefaultTableModel(column,0);
		
		manageuser = new JTable(tableModel);
		manageuser.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		scrolledTable = new JScrollPane(manageuser);
		this.add(scrolledTable);
		
		buttonPanel = new JPanel(new GridLayout(2,1));
		
		usergroupbutton = new JButton("����� �׷�");
		creatememberbutton = new JButton("�������");
		buttonPanel.add(usergroupbutton);
		buttonPanel.add(creatememberbutton);
		this.add(buttonPanel);
		
		usergroupbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new UserGroupDisplay();
			}
		});
		creatememberbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreateMemberDisplay();
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DisplayUserManager();
	}
}