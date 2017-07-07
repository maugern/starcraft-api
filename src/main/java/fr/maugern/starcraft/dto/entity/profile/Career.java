/**
 * Career.java
 * @author Nicolas
 * Created on 2 juin 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;

import fr.maugern.starcraft.model.League;
import fr.maugern.starcraft.model.Race;
import lombok.Data;

/**
 * Useful information about player's multiplayers career.
 * @since 1.0
 */
@Data
public class Career implements Serializable {
    private static final long serialVersionUID = -2916508496470039600L;
    private Race primaryRace;
    private Integer terranWins;
    private Integer protossWins;
    private Integer zergWins;
    private League highest1v1Rank;
    private League highestTeamRank;
    private Integer seasonTotalGames;
    private Integer careerTotalGames;
}
