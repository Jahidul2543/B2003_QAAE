package singletonedemo;

public class Credentials {

    String userName = "Jack";
    String password = "jack2456";
    static Credentials credentials = new Credentials();

    private Credentials(){

    }

    public String getPassword(){
        Credentials credentials = new Credentials();
        String password = credentials.password;
        return password;
    }

    public String getUserName(){
        Credentials credentials = new Credentials();
        String userName = credentials.userName;
        return  userName;
    }

}
