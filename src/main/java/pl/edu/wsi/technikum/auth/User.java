package pl.edu.wsi.technikum.auth;

public class User {
    private String rank;
    private String nick;

    public User(String rank, String nick) {
        this.rank = rank;
        this.nick = nick;
    }

    public User() {
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
