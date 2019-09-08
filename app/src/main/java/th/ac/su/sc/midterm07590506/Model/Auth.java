package th.ac.su.sc.midterm07590506.Model;

public class Auth {

    private static final String USERNAME = "bbb";
    private static final String PASSWORD = "222";

    private String mUsername;
    private String mPassword;


    public Auth(String username, String password) {
        this.mUsername = username;
        this.mPassword = password;
    }
    public boolean check() {
        if (mUsername.equals(USERNAME) && mPassword.equals(PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }
}
