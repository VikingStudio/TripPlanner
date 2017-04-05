package Classes;

/**
 * Created by Styrmir on 22.3.2017.
 */
public class UserProfile {
	// I think id should be final, if we need
	//    a new profile we need to create new instance
	// recomend negative int for id for "fake" profiles
	private final int id;
	private Image image;
	private String preferences;

	public UserProfile(int id) {
		this.id = id;
	};

	// setters, getters
	public int getId() {
		return this.id;
	}

	// not needed if id is final
	//public void setId(int id) {
		//this.id = id;
	//}

	public Image getImage() {
		return this.image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getPreferences() {
		return this.preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}
}
