/**
 * LadderMember.java
 * @author Nicolas
 * Created on 18 juin 2017
 */
package fr.maugern.starcraft.dto.entity.ladder;

import java.io.Serializable;

import fr.maugern.starcraft.dto.entity.Characters;
import fr.maugern.starcraft.model.Race;
import lombok.Data;

/**
 * Ladder member of {@link fr.maugern.starcraft.dto.entity.ladder.Ladder}.
 * @since 1.0
 */
@Data
public class LadderMember implements Serializable {
    private static final long serialVersionUID = -8939189338507724392L;
    private Characters character;
    private Long joinTimestamp;
    private Integer points;
    private Integer wins;
    private Integer losses;
    private Integer highestRank;
    private Integer previousRank;
    private Race favoriteRaceP1;
}
