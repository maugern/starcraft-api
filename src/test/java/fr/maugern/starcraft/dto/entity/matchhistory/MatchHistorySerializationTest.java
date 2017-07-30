/**
 * SerializationTest.java
 * @author Nicolas
 * Created on 15 juin 2017
 */
package fr.maugern.starcraft.dto.entity.matchhistory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import fr.maugern.starcraft.model.Decision;

/**
 * @since 1.0
 */
public class MatchHistorySerializationTest {

    private final static String STRING_JSON_MATCH_HISTORY = "{\"matches\":[{\"map\":\"Ascension to Aiur LE\",\"type\":\"SOLO\",\"decision\":\"WIN\",\"speed\":\"FASTER\",\"date\":1498249960},{\"map\":\"Defender's Landing LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497476452},{\"map\":\"Ascension to Aiur LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497475561},{\"map\":\"Defender's Landing LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497474726},{\"map\":\"Odyssey LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497473603},{\"map\":\"Abyssal Reef LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497472609},{\"map\":\"Blood Boil LE\",\"type\":\"SOLO\",\"decision\":\"WIN\",\"speed\":\"FASTER\",\"date\":1497395395},{\"map\":\"Odyssey LE\",\"type\":\"SOLO\",\"decision\":\"WIN\",\"speed\":\"FASTER\",\"date\":1497394834},{\"map\":\"Abyssal Reef LE\",\"type\":\"SOLO\",\"decision\":\"WIN\",\"speed\":\"FASTER\",\"date\":1497386759},{\"map\":\"Odyssey LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497385928},{\"map\":\"Odyssey LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497385111},{\"map\":\"Blood Boil LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497376491},{\"map\":\"Abyssal Reef LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497375506},{\"map\":\"Sequencer LE\",\"type\":\"SOLO\",\"decision\":\"WIN\",\"speed\":\"FASTER\",\"date\":1497299805},{\"map\":\"Defender's Landing LE\",\"type\":\"SOLO\",\"decision\":\"WIN\",\"speed\":\"FASTER\",\"date\":1497299120},{\"map\":\"Ascension to Aiur LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497298306},{\"map\":\"Defender's Landing LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497297373},{\"map\":\"Abyssal Reef LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497296243},{\"map\":\"Abyssal Reef LE\",\"type\":\"SOLO\",\"decision\":\"WIN\",\"speed\":\"FASTER\",\"date\":1497295482},{\"map\":\"Ascension to Aiur LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497295383},{\"map\":\"Ascension to Aiur LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497289476},{\"map\":\"Blood Boil LE\",\"type\":\"SOLO\",\"decision\":\"WIN\",\"speed\":\"FASTER\",\"date\":1497288970},{\"map\":\"Blood Boil LE\",\"type\":\"SOLO\",\"decision\":\"WIN\",\"speed\":\"FASTER\",\"date\":1497288941},{\"map\":\"Odyssey LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497288868},{\"map\":\"Odyssey LE\",\"type\":\"SOLO\",\"decision\":\"LOSS\",\"speed\":\"FASTER\",\"date\":1497288317}]}";
    
    @Test
    public void should_serialize_correctly() {
        MatchHistory matchHistory = JSON.parseObject(STRING_JSON_MATCH_HISTORY, MatchHistory.class);
        assertEquals(matchHistory.getMatches().size(), 25);
        assertEquals(matchHistory.getMatches().get(0).getMap(), "Ascension to Aiur LE");
        assertEquals(matchHistory.getMatches().get(0).getType(), "SOLO");
        assertEquals(matchHistory.getMatches().get(0).getDecision(), Decision.WIN);
        assertEquals(matchHistory.getMatches().get(0).getSpeed(), "FASTER");
        assertEquals(matchHistory.getMatches().get(0).getDate(), new Date(1498249960L * 1000));

    }
    
    @Test
    public void should_deserialize_correctly() {
        Match match = new Match();
        match.setMap("Ascension to Aiur LE");
        match.setType("SOLO");
        match.setDecision(Decision.WIN);
        match.setSpeed("FASTER");
        match.setDate(new Date(1498249960L));
        
        MatchHistory matchHistories = new MatchHistory();
        matchHistories.setMatches(Arrays.asList(match));
        
        String jsonMatchHistory = JSON.toJSONString(matchHistories);

        assertNotNull(jsonMatchHistory);
    }

}
