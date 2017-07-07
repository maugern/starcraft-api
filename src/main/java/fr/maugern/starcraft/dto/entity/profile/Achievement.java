/**
 * Achievement.java
 * @author Nicolas
 * Created on 17 juin 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * A StarCraft 2 achievement.
 * @since 1.0
 */
@Data
public class Achievement implements Serializable {
    private static final long serialVersionUID = -5995762775747145640L;
    private Long achievementId;
    private Date completionDate;
}
