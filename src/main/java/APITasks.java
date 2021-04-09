import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Assert;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by nurkulov 12/26/19
 */
public class APITasks {
    //http://api.football-data.org/
    //2c796f126ed8443694ec62fcb55c9353
    /*
     * GET all soccer team names listed in given resource
     * Deserialization type: TypeReference
     */
    static HttpClient client = HttpClientBuilder.create().build();
    static URIBuilder builder = new URIBuilder();
    static ObjectMapper objectMapper = new ObjectMapper();
    static String appJson = "application/json";
    static String token = "2c796f126ed8443694ec62fcb55c9353";
    static HttpResponse response;

    public static List<String> getAllTeams() throws URISyntaxException, IOException {
        builder.setScheme("http").setHost("api.football-data.org/").setPath("v2/teams/");
        HttpGet get = new HttpGet(builder.build());
        get.addHeader("Accept", appJson);
        get.addHeader("X-Auth-Token", token);
        response = client.execute(get);
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        Assert.assertTrue(response.getEntity().getContentType().getValue().contains( appJson));
        objectMapper = new ObjectMapper();
        Map<String, Object> namesList = objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
                });
        List<Map<String , Object>> teams= ( List<Map<String , Object>>)namesList.get("teams");
        List<String> teamsList=new ArrayList<>();
        for (int i = 0; i < teams.size(); i++) {
            teamsList.add(String.valueOf(teams.get(i).get("name")));
        }

        return teamsList;
    }

    /*
     * GET names of all goalkeepers from England team
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getAllGoalkeepers() throws IOException, URISyntaxException {
        builder.setScheme("http").setHost("api.football-data.org").setPath("v2/teams/66");
        HttpGet get = new HttpGet(builder.build());
        get.addHeader("Accept", appJson);
        get.addHeader("X-Auth-Token", token);
        response = client.execute(get);
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        Assert.assertTrue(response.getEntity().getContentType().getValue().contains( appJson));
        objectMapper = new ObjectMapper();
        Map<String, Object> namesList = objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
                });
        List<Map<String,Object>> squad= ( List<Map<String,Object>>)namesList.get("squad");

        List<String> goalkeeper= new ArrayList<>();
        for (int i = 0; i <squad.size() ; i++) {
            if(squad.get(i).get("position").equals("Goalkeeper")){
                goalkeeper.add(String.valueOf(squad.get(i).get("name")));
            }
        }

        return goalkeeper;
    }

    /*
     * GET names of all defenders from England team
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getDefenders() throws IOException, URISyntaxException {

        builder.setScheme("http").setHost("api.football-data.org/").setPath("v2/teams/66");
        HttpGet get = new HttpGet(builder.build());
        get.addHeader("Accept", appJson);
        get.addHeader("X-Auth-Token", token);
        response = client.execute(get);
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        Assert.assertTrue(response.getEntity().getContentType().getValue().contains( appJson));
        objectMapper = new ObjectMapper();
        Map<String, Object> namesList = objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
                });
        List<Map<String,Object>> squad= ( List<Map<String,Object>>)namesList.get("squad");

        List<String> defender= new ArrayList<>();
        for (int i = 0; i <squad.size() ; i++) {
            if(squad.get(i).get("position").equals("Defender")){
                defender.add(String.valueOf(squad.get(i).get("name")));
            }
        }

        return defender;
    }

    /*
     * GET names of all midfielders from England team
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getMidfielders() throws URISyntaxException, IOException {
        builder.setScheme("http").setHost("api.football-data.org").setPath("v2/teams/66");
        HttpGet get = new HttpGet(builder.build());
        get.addHeader("Accept", appJson);
        get.addHeader("X-Auth-Token", token);
        response = client.execute(get);
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        Assert.assertTrue(response.getEntity().getContentType().getValue().contains( appJson));
        objectMapper = new ObjectMapper();
        Map<String, Object> namesList = objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
                });
        List<Map<String, Object>> squad =(List<Map<String, Object>>) namesList.get("squad");

        List<String> midfielder= new ArrayList<>();
        for (int i = 0; i <squad.size() ; i++) {
            if(squad.get(i).get("position").equals("Midfielder")){
                midfielder.add(squad.get(i).get("name").toString());

            }
        }

        return midfielder;
    }

    /*
     * GET names of all midfielders from England team whose country is Brazil
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getMidfielderFromBrazil() {
        return null;
    }

    /*
     * GET names of all attackers from England team whose origin country is England
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getAttackerFromEngland() {
        return null;
    }

    /*
     * GET name of Spain team coach
     * note: Spain team id is 77
     * Deserialization type: TypeReference
     */
    public static List<String> getSpainCoach() {
        return null;
    }

    /*
     * GET list of all competitions
     * Deserialization type: TypeReference
     */
    public static List<String> getAllCompetitions() {
        return null;

    }

    /*
     * GET names of second highest scorer from competitions of 2000 season
     * note: endpoint for competitions: `competitions/<year>/
     * note: endpoint for scorers: `competitions/<year>/scorers`
     * Deserialization type: TypeReference
     */
    public static List<String> getSecondHighestScorer() {
        return null;
    }
}
