/**
 * Profile.java
 * @author Nicolas Mauger
 * Created on 20 mai 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;

import lombok.Data;

/**
 * Player's profile.
 * @since 1.0
 */
@Data
public class Profile implements Serializable {
    private static final long serialVersionUID = -4446196036050632895L;
    private Long id;
    private Integer realm;
    private String displayName;
    private String clanName;
    private String clanTag;
    private String profilePath;
    private Portrait portrait;
    private Career career;
    private SwarmLevels swarmLevels;
    private Campaign campaign;
    private Season season;
    private Rewards rewards;
    private Achievements achievements;
}
