package cn.itcast;

import java.util.ArrayList;

public class User {
    private ArrayList<Object> objects= new ArrayList<>();
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
