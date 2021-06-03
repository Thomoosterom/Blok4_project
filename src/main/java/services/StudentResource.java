package services;


import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.StringReader;
import java.sql.*;


public class StudentResource {



    @POST
    //@Path("RegistratieActiviteit.html")
    @Produces("text/html")
    public String VoegActiviteitAanDeDataBaseToe(String Jsonbody){

        JsonObjectBuilder responseobject = Json.createObjectBuilder();

        StringReader reader = new StringReader(Jsonbody);
        JsonReader jsonReader = Json.createReader(reader);
        JsonObject jsonObject = jsonReader.readObject();

        String url = "jdbc:postgresql://localhost:5432/Student";
        String user = "postgres";
        String password = "hallo123";
        try {

        String sql = "INSERT INTO activiteit (naam,omschrijving,activiteitnr,tijd)"
        +  " VALUES (? ,?,?,?)";


        Connection Mycon = DriverManager.getConnection(url, user, password);
        PreparedStatement Mysta = Mycon.prepareStatement(sql);

        String projectnaam = jsonObject.getString("naam");
        String projectType = jsonObject.getString("omschrijving");
        int projectnummer = jsonObject.getInt("activiteitnr");
        double projectdatum = Double.parseDouble(jsonObject.getString("tijd"));

//           ArrayList waarden = new ArrayList(projectnaam,projectType,projectnummer,projectdatum,projectbudget,Werkurenregisteren,beoordelen);

        Mysta.setString(1,projectnaam);
        Mysta.setString(2,projectType);
        Mysta.setInt(3,projectnummer);
        Mysta.setDouble(4,projectdatum);


        ResultSet resultSet = Mysta.executeQuery(sql);

        while (resultSet.next()) {

        System.out.println("het is gelukt");
        }
        responseobject.add("gelukt", "een nieuwe project wordt toegevoegd");
        }catch (SQLException throwables) {
        responseobject.add("niet gelukt", "geen project wordt toegevoegd");
        }
        return responseobject.build().toString();
        }

        }