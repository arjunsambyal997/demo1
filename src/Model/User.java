package Model;

public class User {
	

private int id;
private String Password;
private int contactId;
private String name;
private String email;
private String phone;
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
public int getContactId() {
	return contactId;
}
public void setContactId(int contactId) {
	this.contactId = contactId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}




}
