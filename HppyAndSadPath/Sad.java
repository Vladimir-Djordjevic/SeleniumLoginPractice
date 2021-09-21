package HappyandSadPath;

public class Sad extends Path {

	private String username;
	private String password;

	public Sad() {

		this.username = "NekoIme";
		this.password = "Bzvze!";
	}

	public void test() {
		super.loginTest(this.username, this.password);
	}

}
