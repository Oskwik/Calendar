package se.lexicon.models;

public class AppUser {

    private int id;
    private String username;
    private String password;
    private AppUser;
    private int getId();
    private String getPassword();
    private String getUsername();
    private void setPassword(String);
    private void setUsername(String);

    public AppUser(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
