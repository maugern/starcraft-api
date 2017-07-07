/**
 * LaddersSerializationTest.java
 * @author Nicolas
 * Created on 17 juin 2017
 */
package fr.maugern.starcraft.dto.entity.ladders;

import static org.junit.Assert.*;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import fr.maugern.starcraft.dto.entity.ladders.Ladders;

/**
 * @since 1.0
 */
public class LaddersSerializationTest {

    private static final String JSON_STRING_LADDERS = "{\"currentSeason\":[{\"ladder\":[{\"ladderName\":\"Drone Dixie\",\"ladderId\":194118,\"division\":115,\"rank\":13,\"league\":\"PLATINUM\",\"matchMakingQueue\":\"LOTV_SOLO\",\"wins\":45,\"losses\":56,\"showcase\":true}],\"characters\":[{\"id\":1306029,\"realm\":1,\"displayName\":\"oui\",\"clanName\":\"\",\"clanTag\":\"\",\"profilePath\":\"/profile/1306029/1/oui/\"}],\"nonRanked\":[]},{\"ladder\":[],\"characters\":[{\"id\":1306029,\"realm\":1,\"displayName\":\"oui\",\"clanName\":\"\",\"clanTag\":\"\",\"profilePath\":\"/profile/1306029/1/oui/\"}],\"nonRanked\":[]},{\"ladder\":[{\"ladderName\":\"Leviathan Lambda\",\"ladderId\":193765,\"division\":90,\"rank\":35,\"league\":\"DIAMOND\",\"matchMakingQueue\":\"LOTV_SOLO\",\"wins\":13,\"losses\":16,\"showcase\":true}],\"characters\":[{\"id\":1306029,\"realm\":1,\"displayName\":\"oui\",\"clanName\":\"\",\"clanTag\":\"\",\"profilePath\":\"/profile/1306029/1/oui/\"}],\"nonRanked\":[]}],\"previousSeason\":[{\"ladder\":[],\"characters\":[{\"id\":1306029,\"realm\":1,\"displayName\":\"oui\",\"clanName\":\"\",\"clanTag\":\"\",\"profilePath\":\"/profile/1306029/1/oui/\"}],\"nonRanked\":[{\"mmq\":\"LOTV_TWOS\",\"gamesPlayed\":2}]},{\"ladder\":[{\"ladderName\":\"Aiur Beta\",\"ladderId\":192453,\"division\":188,\"rank\":18,\"league\":\"DIAMOND\",\"matchMakingQueue\":\"LOTV_SOLO\",\"wins\":54,\"losses\":45,\"showcase\":false}],\"characters\":[{\"id\":1306029,\"realm\":1,\"displayName\":\"oui\",\"clanName\":\"\",\"clanTag\":\"\",\"profilePath\":\"/profile/1306029/1/oui/\"}],\"nonRanked\":[]}],\"showcasePlacement\":[]}";
    
    @Test
    public void should_serialize_correctly() {
        Ladders Ladders = JSON.parseObject(JSON_STRING_LADDERS, Ladders.class);
        assertEquals(Ladders.getCurrentSeason().get(0).getLadder().get(0).getLadderName(), "Drone Dixie");
        assertEquals(Ladders.getCurrentSeason().get(0).getCharacters().get(0).getDisplayName(), "oui");
        assertEquals(Ladders.getPreviousSeason().get(0).getNonRanked().get(0).getGamesPlayed(), new Integer(2));
        assertTrue(Ladders.getShowcasePlacement().isEmpty());
    }

}
