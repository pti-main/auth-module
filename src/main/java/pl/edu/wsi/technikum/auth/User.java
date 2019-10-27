package pl.edu.wsi.technikum.auth;

public class User {
    //private Rank rank || private String rank
    private Rank rank;
    private String nick;

    public User(Rank rank, String nick) {
        this.rank = rank;
        this.nick = nick;
    }

    public User() {
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
