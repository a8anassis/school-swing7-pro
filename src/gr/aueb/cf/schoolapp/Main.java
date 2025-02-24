package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

public class Main {
	private final static LandingPage landingPage = new LandingPage();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					landingPage.setVisible(true);
					landingPage.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
