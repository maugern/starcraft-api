/**
 * Ladder.java
 * @author Nicolas Mauger
 * Created on 2 juin 2017
 */
package fr.maugern.starcraft.dto.entity.ladders;

import java.io.Serializable;

import fr.maugern.starcraft.model.League;
import lombok.Data;

/**
 * Class corresponding to StarCraft 2 ladder.
 * @since 1.0
 */
@Data
public class Ladder implements Serializable {
    private static final long serialVersionUID = 944679025756122483L;
    private String ladderName;
    private Long ladderId;
    private Integer division;
    private Integer rank;
    private League league;
    private String matchMakingQueue;
    private Integer wins;
    private Integer losses;
    private Boolean showcase;
}
