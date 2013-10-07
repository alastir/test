
public class Friend {
	private String name;
	private String email;
	
	public Friend(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
