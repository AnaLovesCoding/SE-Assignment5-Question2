package model.entities;

public class User {
	
	private static User instance;
	
	private int id;
	
	private String userName;
	
	private String password;
	
	private User () {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
	public static User getInstance() {
		if (instance == null) {
			instance = new User();
		} 
		return instance;
	}	

}
