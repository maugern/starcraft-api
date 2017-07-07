/**
 * SwarmLevels.java
 * @author Nicolas
 * Created on 2 juin 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;

import lombok.Data;

/**
 * Player experience of each Race.
 * @since 1.0
 */
@Data
public class SwarmLevels implements Serializable {
    private static final long serialVersionUID = 4356368368319488092L;
    private Integer level;
    private SwarmLevel terran;
    private SwarmLevel zerg;
    private SwarmLevel protoss;
}
