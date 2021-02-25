package dbconsumer;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBConnectionSampleScript {
    public static void main(String[] args) throws SQLException {
            connectPostgresql();
    }

    public static void connectPostgresql() throws SQLException {
        String userName = "postgres";
        String password = "postgres";
        String hostName = "qaae-b2003.cen58y5cse53.us-east-1.rds.amazonaws.com";
        String portNumber = "5432";
        String database = "dvdrental";
        String query = "SELECT actor_id, first_name, last_name, last_update FROM public.actor;";
        // jdbc:postgresql://host:port/database
        String url = "jdbc:postgresql://" + hostName +":"+ portNumber + "/" + database ;

        Connection connection = DriverManager.getConnection(url, userName,password);
        Statement statement = connection.createStatement();
       ResultSet resultSet = statement.executeQuery(query);
       List<String> firstName = new ArrayList<>();
       Map<String , String> record = new HashMap<>();

       resultSet.next();
       record.put("actor_id", resultSet.getString("actor_id"));
       record.put("first_name", resultSet.getString("first_name"));
       record.put("last_name", resultSet.getString("last_name"));

        for ( Map.Entry<String, String>  entry: record.entrySet()) {
            System.out.print(entry.getKey() +" " + entry.getValue());
        }


       // Process results
        while (resultSet.next()) {
            firstName.add(resultSet.getString("first_name"));
        }

        System.out.println("Number of records: " + firstName.size());
        firstName.forEach(s -> System.out.println(s));


    }
}
