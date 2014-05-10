package com.imageprocessing;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.imageprocessing.gui.MainFrame;

public class Main {
	private final static Logger log = LogManager
			.getLogger(Main.class.getName());

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				log.info("Running application");
				String systemLookAndFeelClassName = UIManager
						.getSystemLookAndFeelClassName();
				log.info(systemLookAndFeelClassName);
//				try {
					//UIManager.setLookAndFeel(systemLookAndFeelClassName);
					UIManager.put("swing.boldMetal", Boolean.FALSE);
//				} catch (ClassNotFoundException e) {
//					log.info(e.getMessage());
//				} catch (InstantiationException e) {
//					log.info(e.getMessage());
//				} catch (IllegalAccessException e) {
//					log.info(e.getMessage());
//				} catch (UnsupportedLookAndFeelException e) {
//					log.info(e.getMessage());
//				}
				MainFrame frame = new MainFrame("Image Processing App");
				frame.setVisible(true);
			}
		});
	}
}
