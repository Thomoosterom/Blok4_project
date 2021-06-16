package nl.hu.project4.v3.services;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import nl.hu.project4.v3.Model.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.security.Key;
import java.util.AbstractMap;
import java.util.Calendar;

@Path("index")
public class AuthenticationResource {
    final static public Key key = MacProvider.generateKey();


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response authenticationUser(@FormParam("gebruikersnaam") String gn, @FormParam("wachtwoord") String ww) {
        try {

            String role = Student.validateUser(gn, ww);
            if (!(role == null)) {
                String token = createToken(gn, role);
                AbstractMap.SimpleEntry<String, String> JWT = new AbstractMap.SimpleEntry<>("JWT", token);
                return Response.ok(JWT).build();
            }else {
                throw new IllegalArgumentException("No user found");
            }
        }catch ( IllegalArgumentException e) {
            e.printStackTrace();
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        }
        private String createToken(String gebruikersnaam, String role) throws JwtException {
            Calendar expiration = Calendar.getInstance();
            expiration.add(Calendar.MINUTE, 30);

            return Jwts.builder()
                    .setSubject(gebruikersnaam)
                    .setExpiration(expiration.getTime())
                    .claim("role", role)
                    .signWith(SignatureAlgorithm.HS512,key)
                    .compact();
        }
    }
