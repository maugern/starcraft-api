/**
 * Ladders.java
 * @author Nicolas
 * Created on 17 juin 2017
 */
package fr.maugern.starcraft.dto.entity.ladders;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * Class who contains list on current and previous {@link fr.maugern.starcraft.dto.entity.ladder.LadderSeason}.
 * @since 1.0
 */
@Data
public class Ladders implements Serializable {
    private static final long serialVersionUID = 8920041331638673839L;
    private List<LadderSeason> currentSeason;
    private List<LadderSeason> previousSeason;
    private List<ShowcasePlacement> showcasePlacement;
}
