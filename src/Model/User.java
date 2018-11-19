package Model;
/* This class declares the fields in the User Database.
 * Contains getter and setter methods for User ID, Password, Contact ID,
 * Name, Email & Phone.
 */
public class User {
	

private int id;
private String password;
private int contactId;
private String name;
private String userName;
private String email;
private String phone;


public int getId() {						//Returns user id 
	return id;
}
public void setId(int id) {					//Sets user id of new user
	this.id = id;
}
public String getPassword() {				//Returns password of registered user
	return password;
}
public void setPassword(String password) {	//Sets password of new user
	this.password = password;
}
public int getContactId() {					//Returns contact id of user
	return contactId;
}
public void setContactId(int contactId) {	//Sets contact id of user
	this.contactId = contactId;
}
public String getName() {					//Returns name of user
	return name;
}
public void setName(String name) {			//Sets name of user from form
	this.name = name;
}
public String getEmail() {					//Returns email id of user
	return email;
}
public void setEmail(String email) {		//Sets email of user from form
	this.email = email;
}
public String getPhone() {					//Returns phone no. of user 
	return phone;
}
public void setPhone(String phone) {		//Sets phone no. of user from form
	this.phone = phone;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}




}
