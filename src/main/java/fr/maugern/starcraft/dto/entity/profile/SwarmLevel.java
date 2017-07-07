/**
 * SwarmLevel.java
 * @author Nicolas
 * Created on 17 juin 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;

import lombok.Data;

/**
 * Player experience with one race.
 * @since 1.0
 */
@Data
public class SwarmLevel implements Serializable {
    private static final long serialVersionUID = 5315862803736986853L;
    private Integer level;
    private Long totalLevelXP;
    private Long currentLevelXP;
}
