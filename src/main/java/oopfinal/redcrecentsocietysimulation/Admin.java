package oopfinal.redcrecentsocietysimulation;

import java.io.Serializable;

public class Admin implements Serializable {
    String Name;
    String  password;


    public Admin(String name, String password) {
        Name = name;
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
