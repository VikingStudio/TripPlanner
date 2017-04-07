package Classes.Model;

/**
 * Created by Styrmir on 22.3.2017.
 */
public class User {
	// I think id should be final, if we need
	// a new profile we need to create new instance
	// Recommend negative int for id for "fake" profiles
	private final int id;
	private UserProfile userProfile;
	private String name;
	private char sex;
	private String address;
	private String email;
	private String phone;
	private String nationality;


	public User(int id) {
		this.id = id;
		userProfile = new UserProfile(this.id);
	};

	// setters, getters
	public int getId() {
		return this.id;
	}

	// public void setId(int id){
	// this.id = id;
	// }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public char getSex() {
		return this.sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.name = phone;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
