package singletonedemo;

public class ConsumerClass {

    public void getCredentials(){
     String userName =  Credentials.credentials.getUserName();
     String password =  Credentials.credentials.getPassword();

    }
}
