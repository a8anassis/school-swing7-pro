package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

public class Main {
	private static final LandingPage landingPage = new LandingPage();
	private static final LoginPage loginPage = new LoginPage();
	private static final Dashboard dashboard =  new Dashboard();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					landingPage.setVisible(true);
					landingPage.setLocationRelativeTo(null);
					
					loginPage.setVisible(false);
					loginPage.setLocationRelativeTo(null);
					
					dashboard.setVisible(false);
					dashboard.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static LandingPage getLandingPage() {
		return landingPage;
	}

	public static LoginPage getLoginPage() {
		return loginPage;
	}

	public static Dashboard getDashboard() {
		return dashboard;
	}
	
	
}
