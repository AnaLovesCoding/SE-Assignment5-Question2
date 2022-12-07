package model.business;

import java.sql.SQLException;
import model.dataccess.LoginDataAccess;
import model.entities.MessageException;
import model.entities.User;

public class LoginBusiness {
	
	private static LoginBusiness instance;
	
	private String userName, password;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private LoginBusiness() {
		
	}

	public boolean verifyCredentials() throws ClassNotFoundException, SQLException {
		
		boolean validCredentials = true;
		
		if (userName.equals("")) {
			validCredentials = false;
			throw new MessageException("Username not informed.");
		} else if (password.equals("")) {
			validCredentials = false;
			throw new MessageException("Password not informed.");
		} 
		
		if (validCredentials) {
			User user = User.getInstance();
			user.setUserName(userName);
			user.setPassword(password);
			
			LoginDataAccess loginDataAccess = LoginDataAccess.getInstance();
			
			if (!(loginDataAccess.verifyCredentials())) {
				validCredentials = false;
				throw new MessageException("Incorrect credentials.");
			}
		}
		
		return validCredentials;
		
	}
	
	public static LoginBusiness getInstance() {
		if (instance == null) {
			instance = new LoginBusiness();
		} 
		return instance;
	}

}
