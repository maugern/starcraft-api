/**
 * Characters.java
 * @author Nicolas Mauger
 * Created on 2 juin 2017
 */
package fr.maugern.starcraft.dto.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * All the information about the character given by Blizzard API.
 * Used in {@link fr.maugern.starcraft.dto.entity.ladder.ladderMember} and 
 * {@link fr.maugern.starcraft.dto.entity.ladders.ladderSeason} classes
 * @since 1.0
 */
@Data
public class Characters implements Serializable {
    private static final long serialVersionUID = 6512280988582739144L;
    private Long id;
    private Integer realm;
    private String displayName;
    private String clanName;
    private String clanTag;
    private String profilePath;
}
