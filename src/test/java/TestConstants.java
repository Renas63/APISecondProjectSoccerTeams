import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by nurkulov 12/26/19
 */

public class TestConstants {

    private static final String[]     ACTUAL_DEFENDERS                =
        {"Harry Maguire", "Victor Nilsson-Lindelöf", "Axel Tuanzebe", "Phil Jones", "Luke Shaw", "Eric Bailly", "Aaron Wan-Bissaka", "Alex Telles", "Brandon Williams"};
    private static final String[]     GOALKEEPERS                     = {"David De Gea", "Sergio Romero", "Dean Henderson", "Lee Grant"};
    private static final String[]     EXPECTED_MIDFIELDERS            =
        {"Fred", "Bruno Fernandes", "Paul Pogba", "Nemanja Matić", "Donny van de Beek", "Scott McTominay", "Juan Mata", "Daniel James"};
    private static final String[]     EXPECTED_MIDFIELDER_FROM_BRAZIL = {"Fred"};
    private static final String[]     EXPECTED_ATTACKERS              = {"Marcus Rashford", "Mason Greenwood"};
    private static final String[]     EXPECTED_COACH                  = {"Marcelino"};
    private static final String[]     EXPECTED_TEAMS                  =
        {"Arsenal FC", "Aston Villa FC", "Blackburn Rovers FC", "Bolton Wanderers FC", "Chelsea FC", "Everton FC", "Fulham FC", "Liverpool FC", "Manchester City FC", "Manchester United FC",
            "Newcastle United FC", "Norwich City FC", "Queens Park Rangers FC", "Stoke City FC", "Sunderland AFC", "Tottenham Hotspur FC", "West Bromwich Albion FC", "Wigan Athletic FC",
            "Wolverhampton Wanderers FC", "Hull City AFC", "Burnley FC", "Birmingham City FC", "Leicester City FC", "Southampton FC", "Leeds United FC", "Derby County FC", "Middlesbrough FC",
            "Sheffield Wednesday FC", "Watford FC", "Charlton Athletic FC", "Ipswich Town FC", "Nottingham Forest FC", "Crystal Palace FC", "Reading FC", "Sheffield United FC", "Barnsley FC",
            "Millwall FC", "Rotherham United FC", "Bristol City FC", "Luton Town FC", "Huddersfield Town AFC", "Brighton & Hove Albion FC", "Brentford FC", "West Ham United FC", "England",
            "AFC Bournemouth", "Burton Albion FC", "Coventry City FC", "Preston North End FC", "Wycombe Wanderers FC"};
    private static final String[]     EXPECTED_SECOND_HIGHEST_SCORER  = {"Denis Cheryshev", "Cristiano Ronaldo", "Antoine Griezmann", "Romelu Lukaku", "Kylian Mbappé"};
    private static final List<String> EXPECTED_COMPETITIONS_LIST      = Stream.of(
        "WC Qualification", "Primera B Nacional", "Superliga Argentina", "Copa Liga Profesional", "Supercopa Argentina", "WC Qualification", "A League", "FFA Cup", "Erste Liga", "Bundesliga",
        "Playoffs 1/2", "ÖFB Cup", "Coupe de Belgique", "Division 1B", "Jupiler Pro League", "Supercoupe de Belgique", "Playoffs II", "LFPB", "Premier Liga", "Copa do Brasil", "Série D", "Série C",
        "Série B", "Série A", "Kupa na Bulgarija", "A PFG", "Canadian Championship", "Supercopa de Chile", "Primera División", "Playoffs 1/2", "Chinese Super League", "Liga Postobón",
        "Superliga de Colombia", "Prva Liga", "Synot Liga", "DBU Pokalen", "Superliga", "Play Offs 1/2", "Copa Pilsener Serie A", "Football League Cup", "FA Community Shield", "FA Cup",
        "National League", "League Two", "League One", "Championship", "Premier League", "Meistriliiga", "UEFA Europa League", "European Championship", "UEFA Champions League", "UEFA Women's EURO",
        "WC Qualification", "Suomen Cup", "Veikkausliiga", "Coupe de la Ligue", "Ligue 2", "Ligue 1", "Coupe de France", "Playoffs 1/2", "Playoffs 2/3", "Trophée des Champions", "DFB-Pokal",
        "Regionalliga", "3. Liga", "2. Bundesliga", "Bundesliga", "DFL Super Cup", "Frauen Bundesliga", "Greek Cup", "Super League", "Souper Kap Ellados", "Magyar Kupa", "NB I", "Úrvalsdeild",
        "I-League", "Ligat ha'Al", "Supercoppa", "Coppa Italia", "Serie C", "Serie B", "Serie A", "J.League Cup", "J. League Division 2", "J. League", "Super Cup", "Virslīga", "A Lyga",
        "Premier League", "Copa MX", "SuperCopa MX", "Liga MX", "KNVB Beker", "Jupiler League", "Eredivisie", "Johan Cruijff Schaal", "League Cup", "Premiership", "Tippeligaen", "1. divisjon",
        "Playoffs 1/2", "WC Qualification", "Liga Panameña de Fútbol", "Primera División", "Superpuchar Polski", "Puchar Polski", "Taça de Portugal", "Liga2 Cabovisão", "Primeira Liga",
        "Supertaça Cândido de Oliveira", "Premier Division", "Liga II", "Liga I", "Supercupa României", "Russian Cup", "FNL", "RFPL", "Playoffs 1/2", "Russian Super Cup", "Scottish Cup",
        "Championship", "Premier League", "Playoffs 2/3", "ABSA Premiership", "Copa America", "Copa Sudamericana", "WC Qualification", "Copa del Rey", "Segunda División", "Primera Division",
        "Supercopa de España", "Superettan", "Allsvenskan", "Playoffs 2/3", "Playoffs 1/2", "Svenska Supercupen", "Schweizer Pokal", "Super League", "1. Lig", "Süper Lig", "TFF Süper Kupa",
        "Kubok Ukrainy", "Premier Liha", "Playoffs 1/2", "Superkubok Ukrainy", "MLS", "Primera División", "Supercopa Uruguaya", "Primera División", "V-League", "Welsh Premier League",
        "FIFA World Cup").collect(Collectors.toList());

    public static String[] getActualDefenders() {
        return ACTUAL_DEFENDERS;
    }

    public static String[] getGOALKEEPERS() {
        return GOALKEEPERS;
    }

    public static String[] getExpectedMidfielders() {
        return EXPECTED_MIDFIELDERS;
    }

    public static String[] getExpectedMidfielderFromBrazil() {
        return EXPECTED_MIDFIELDER_FROM_BRAZIL;
    }

    public static String[] getExpectedAttackers() {
        return EXPECTED_ATTACKERS;
    }

    public static String[] getExpectedCoach() {
        return EXPECTED_COACH;
    }

    public static String[] getExpectedTeams() {
        return EXPECTED_TEAMS;
    }

    public static String[] getExpectedSecondHighestScorer() {
        return EXPECTED_SECOND_HIGHEST_SCORER;
    }

    public static List<String> getExpectedCompetitionsList() {
        return EXPECTED_COMPETITIONS_LIST;
    }
}
