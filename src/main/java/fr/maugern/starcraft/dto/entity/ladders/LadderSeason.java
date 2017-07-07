/**
 * LadderSeason.java
 * @author Nicolas
 * Created on 17th June 2017
 */
package fr.maugern.starcraft.dto.entity.ladders;

import java.io.Serializable;
import java.util.List;

import fr.maugern.starcraft.dto.entity.Characters;
import lombok.Data;

/**
 * Ladder season contains ladders, characters who play this season, and non Ranked stuff.
 * @since 1.0
 */
@Data
public class LadderSeason implements Serializable {
    private static final long serialVersionUID = -424851455265002835L;
    private List<Ladder> ladder;
    private List<Characters> characters;
    private List<NonRanked> nonRanked;
}
