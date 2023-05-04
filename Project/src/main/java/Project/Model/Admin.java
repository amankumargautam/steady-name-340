package Project.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminID;
    private String username;
	private String password;
	private String address;
	private String mobileNumber;
	private String email;
}
