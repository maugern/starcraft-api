/**
 * Connector.java
 * @author Nicolas
 * Created on 20 mai 2017
 */
package fr.maugern.starcraft.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Optional;

import javax.net.ssl.HttpsURLConnection;

import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

import fr.maugern.starcraft.api.StarcraftException.StarCraftExceptionCause;
import fr.maugern.starcraft.config.Locale;
import fr.maugern.starcraft.config.Region;
import fr.maugern.starcraft.dto.entity.ladder.Ladder;
import fr.maugern.starcraft.dto.entity.ladders.Ladders;
import fr.maugern.starcraft.dto.entity.matchhistory.MatchHistory;
import fr.maugern.starcraft.dto.entity.profile.Profile;

/**
 * Class used to connect to Blizzard API
 * @since 1.0
 */
public class Connector {

    private final static org.slf4j.Logger log = LoggerFactory.getLogger(Connector.class);

    public static Optional<Profile> getProfile(final String apiKey, final Region region, final Locale locale, final Integer id, final String name) throws StarcraftException {
        try {
            URL url = new URL("https://" + region + "/sc2/profile/" + id + "/1/" + name + "/?locale=" + locale + "&apikey=" + apiKey);
            HttpsURLConnection connexion = (HttpsURLConnection) url.openConnection();

            if (connexion.getResponseCode() == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connexion.getInputStream()));

                StringBuilder string = new StringBuilder();
                String input;
                while ((input = br.readLine()) != null){
                    string.append(input);
                }
                br.close();
                return Optional.ofNullable(JSON.parseObject(string.toString(), Profile.class));
            } else
                catchingErrorStatus(connexion.getResponseCode(), connexion.getResponseMessage());
            
        } catch (MalformedURLException e) {
            log.error("MalformedURLException",e);
        } catch (UnknownHostException e) {
            log.error("UnknownHostException",e);
        } catch (ProtocolException e) {
            log.error("ProtocolException",e);
        } catch (IOException e) {
            log.error("IOException",e);
        }
        return Optional.empty();
    }
    
    public static Optional<Ladders> getLadders(final String apiKey, final Region region, final Locale locale, final Integer id, final String name) throws StarcraftException {
        try {
            URL url = new URL("https://" + region + "/sc2/profile/" + id + "/1/" + name + "/ladders?locale=" + locale + "&apikey=" + apiKey);
            HttpsURLConnection connexion = (HttpsURLConnection) url.openConnection();

            if (connexion.getResponseCode() == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connexion.getInputStream()));

                StringBuilder string = new StringBuilder();
                String input;
                while ((input = br.readLine()) != null){
                    string.append(input);
                }
                br.close();
                return Optional.ofNullable(JSON.parseObject(string.toString(), Ladders.class));
            } else
                catchingErrorStatus(connexion.getResponseCode(), connexion.getResponseMessage());
            
        } catch (MalformedURLException e) {
            log.error("MalformedURLException",e);
        } catch (UnknownHostException e) {
            log.error("UnknownHostException",e);
        } catch (ProtocolException e) {
            log.error("ProtocolException",e);
        } catch (IOException e) {
            log.error("IOException",e);
        }
        return Optional.empty();
    }
    
    public static Optional<MatchHistory> getMatchHistory(final String apiKey, final Region region, final Locale locale, final Integer id, final String name) throws StarcraftException {
        try {
            URL url = new URL("https://" + region + "/sc2/profile/" + id + "/1/" + name + "/matches?locale=" + locale + "&apikey=" + apiKey);
            HttpsURLConnection connexion = (HttpsURLConnection) url.openConnection();

            if (connexion.getResponseCode() == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connexion.getInputStream()));

                StringBuilder string = new StringBuilder();
                String input;
                while ((input = br.readLine()) != null){
                    string.append(input);
                }
                br.close();
                return Optional.ofNullable(JSON.parseObject(string.toString(), MatchHistory.class));
            } else
                catchingErrorStatus(connexion.getResponseCode(), connexion.getResponseMessage());
            
        } catch (MalformedURLException e) {
            log.error("MalformedURLException",e);
        } catch (UnknownHostException e) {
            log.error("UnknownHostException",e);
        } catch (ProtocolException e) {
            log.error("ProtocolException",e);
        } catch (IOException e) {
            log.error("IOException",e);
        }
        return Optional.empty();
    }
    
    public static Optional<Ladder> getLadder(final String apiKey, final Region region, final Locale locale, final Integer id) throws StarcraftException {
        try {
            URL url = new URL("https://" + region + "/sc2/ladder/" + id + "?locale=" + locale + "&apikey=" + apiKey);
            HttpsURLConnection connexion = (HttpsURLConnection) url.openConnection();

            if (connexion.getResponseCode() == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connexion.getInputStream()));

                StringBuilder string = new StringBuilder();
                String input;
                while ((input = br.readLine()) != null){
                    string.append(input);
                }
                br.close();
                return Optional.ofNullable(JSON.parseObject(string.toString(), Ladder.class));
            } else
                catchingErrorStatus(connexion.getResponseCode(), connexion.getResponseMessage());
            
        } catch (MalformedURLException e) {
            log.error("MalformedURLException",e);
        } catch (UnknownHostException e) {
            log.error("UnknownHostException",e);
        } catch (ProtocolException e) {
            log.error("ProtocolException",e);
        } catch (IOException e) {
            log.error("IOException",e);
        }
        return Optional.empty();
    }

    private static void catchingErrorStatus (final int responseCode, final String errorMessage) throws StarcraftException {
        switch(responseCode) {
        case 400:
            throw new StarcraftException(errorMessage,StarCraftExceptionCause.BAD_PARAMETERS_ERROR);
        case 403:
            throw new StarcraftException(errorMessage,StarCraftExceptionCause.AUTH_ERROR);
        case 404:
            throw new StarcraftException(errorMessage,StarCraftExceptionCause.RESSOURCE_NOT_FOUND);
        case 405:
            throw new StarcraftException(errorMessage,StarCraftExceptionCause.NOT_ALLOWED);
        case 409:
            throw new StarcraftException(errorMessage,StarCraftExceptionCause.RESSOURCE_CONFLICT_ERROR);
        case 500:
            throw new StarcraftException(errorMessage,StarCraftExceptionCause.INTERNAL_ERROR);
        default:
            throw new StarcraftException(errorMessage,StarCraftExceptionCause.API_ERROR);
        }
    }
}

