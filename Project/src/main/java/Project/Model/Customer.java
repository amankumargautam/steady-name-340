package Project.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String userName;
private String password;
private String Address;
private int mobileNo;
private String email;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
private List<Ticket> tickets;
public Customer(int id, String userName, String password, String address, int mobileNo, String email,
		List<Ticket> tickets) {
	super();
	this.id = id;
	this.userName = userName;
	this.password = password;
	Address = address;
	this.mobileNo = mobileNo;
	this.email = email;
	this.tickets = tickets;
}
public List<Ticket> getTickets() {
	return tickets;
}
public void setTickets(List<Ticket> tickets) {
	this.tickets = tickets;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
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
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getMobileNo() {
	return mobileNo;
}
public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
