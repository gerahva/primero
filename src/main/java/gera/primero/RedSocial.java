package gera.primero;

import org.springframework.data.annotation.Id;

public class RedSocial {

    @Id
    String token;

    String nickname;

    @Override
    public String toString() {
        return "RedSocial{" +
                "token='" + token + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public RedSocial(String token, String nickname) {
        this.token = token;
        this.nickname = nickname;
    }

    public RedSocial() {
    }
}
