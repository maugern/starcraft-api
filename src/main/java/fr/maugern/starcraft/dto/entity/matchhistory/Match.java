/**
 * Match.java
 * @author Nicolas
 * Created on 2 juin 2017
 */
package fr.maugern.starcraft.dto.entity.matchhistory;

import java.io.Serializable;

import fr.maugern.starcraft.model.Decision;
import lombok.Data;

/**
 * StarCraft 2 match.
 * @since 1.0
 */
@Data
public class Match implements Serializable {
    private static final long serialVersionUID = -8368495482086428992L;
    private String map;
    private String type;
    private Decision decision;
    private String speed;
    private Long date;   
}
