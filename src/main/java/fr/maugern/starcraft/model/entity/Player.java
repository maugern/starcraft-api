/**
 * Player.java
 * @author Nicolas
 * Created on 23 juin 2017
 */
package fr.maugern.starcraft.model.entity;

import fr.maugern.starcraft.dto.entity.Characters;
import fr.maugern.starcraft.dto.entity.matchhistory.MatchHistory;
import lombok.Data;

/**
 * @author Nicolas
 *
 */
@Data
public class Player {
    private Characters characters;
    private MatchHistory matchHistory;
}
