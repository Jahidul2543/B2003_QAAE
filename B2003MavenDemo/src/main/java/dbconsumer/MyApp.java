package dbconsumer;

import dbutility.DbUtilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MyApp {

   static List<String> firstName = new ArrayList<>();
   static String query = "SELECT actor_id, first_name, last_name, last_update FROM public.actor;";

    public static void main(String[] args) throws SQLException{
        getActorsFirstNameFromDvdRental();
    }

    public static void getActorsFirstNameFromDvdRental() throws SQLException {
        DbUtilities dbUtilities = new DbUtilities();
      firstName = dbUtilities.getAColumn(query,"last_update");

    }




}
