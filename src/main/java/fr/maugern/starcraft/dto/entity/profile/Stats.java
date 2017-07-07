/**
 * Stats.java
 * @author Nicolas
 * Created on 17 juin 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;

import lombok.Data;

/**
 * Statistics about palyer's game.
 * @since 1.0
 */
@Data
public class Stats implements Serializable {
    private static final long serialVersionUID = -6568022809323268195L;
    private String type;
    private Integer wins;
    private Integer games;
}
