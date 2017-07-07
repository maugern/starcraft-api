/**
 * NonRanked.java
 * @author Nicolas
 * Created on 17 juin 2017
 */
package fr.maugern.starcraft.dto.entity.ladders;

import java.io.Serializable;

import lombok.Data;

/**
 * Class for NonRanked player.
 * @since 1.0
 */
@Data
public class NonRanked implements Serializable {
    private static final long serialVersionUID = 7077636280755262840L;
    private String mmq;
    private Integer gamesPlayed;
}
