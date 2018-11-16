package Model;

public class User {
	

private int id;
private String Password;

public User(int id, String password) {
		super();
		this.id = id;
		Password = password;
	}

public User() {
		super();
	}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}




}
