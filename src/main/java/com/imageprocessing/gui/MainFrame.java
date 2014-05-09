package com.imageprocessing.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 780187258963403304L;

	public MainFrame(String title) {
		super(title);
		setIcon();
		initializeContentPane();
		setResizable(false);
		createMenu();
		createGallery();
		createTools();
	}

	private void createTools() {
		
	}

	private void createGallery() {
		
	}

	private void initializeContentPane() {
		setLayout(new BorderLayout());
		setSize(1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setDefaultLookAndFeelDecorated(true);
		getContentPane().setBackground(Color.white);
	}

	private void setIcon() {
		ImageIcon icon = new ImageIcon(
				"src\\main\\resources\\Super_Paper_Mario_icon.png");
		setIconImage(icon.getImage());
	}

	private void createMenu() {
		// Menu Bar
		final JMenuBar menuBar = new JMenuBar();

		// Menu File
		final JMenu fileMenu = new JMenu("File");
		// Menu Edit
		final JMenu editMenu = new JMenu("Edit");
		// Menu About
		final JMenu helpMenu = new JMenu("Help");

		// File Items
		final JMenuItem exitItem = new JMenuItem("Salir");
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);

		// Edit Items
		menuBar.add(editMenu);

		// About Items
		final JMenuItem aboutItem = new JMenuItem("About");
		helpMenu.add(aboutItem);
		menuBar.add(helpMenu);

		setJMenuBar(menuBar);
	}
}
