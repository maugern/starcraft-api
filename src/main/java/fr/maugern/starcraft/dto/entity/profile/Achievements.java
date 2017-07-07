/**
 * Achievements.java
 * @author Nicolas
 * Created on 17 juin 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * Class who contains player's {@link fr.maugern.starcraft.dto.entity.profile.Achievement}.
 * @since 1.0
 */
@Data
public class Achievements implements Serializable {
    private static final long serialVersionUID = -634344373856438287L;
    private Points points;
    private List<Achievement> achievements;
}
