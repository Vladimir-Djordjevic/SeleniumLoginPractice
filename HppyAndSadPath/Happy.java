package HappyandSadPath;

public class Happy extends Path {
	private String username;
	private String password;

	public Happy() {

		this.username = "tomsmith";
		this.password = "SuperSecretPassword!";
	}

	public void test() {
		super.loginTest(this.username, this.password);
	}

}
