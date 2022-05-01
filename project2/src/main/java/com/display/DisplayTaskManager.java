package com.display;

//��µ� ����

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class DisplayTaskManager extends JFrame{
	private JTable taskTable;
	private final String[] column = {"������Ʈ��","������","���� ������"};
	private JButton completeBtn, addtaskBtn;
	private JScrollPane taskScroll;
	private JPanel BtnPnl;
	
	
	public DisplayTaskManager() {
		setTitle("Task Manager");
		setSize(1200,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		DefaultTableModel tableModel = new DefaultTableModel(column,0);
		taskTable = new JTable(tableModel);
		taskTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		taskScroll = new JScrollPane(taskTable);
		this.add("Center",taskScroll);
		
		BtnPnl = new JPanel(new FlowLayout());
		completeBtn = new JButton("�۾�üũ");
		BtnPnl.add(completeBtn);
		addtaskBtn = new JButton("�۾�����");
		BtnPnl.add(addtaskBtn);
		this.add("South",BtnPnl);
		
		setVisible(true);
	}
	
	public static void main(String[] arg) {
		new DisplayTaskManager();
	}
}