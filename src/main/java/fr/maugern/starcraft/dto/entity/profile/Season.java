/**
 * Season.java
 * @author Nicolas
 * Created on 20 mai 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * Season informations. 
 * @since 1.0
 */
@Data
public class Season implements Serializable {
    private static final long serialVersionUID = 2055337664560541438L;
    private Integer seasonId;
    private Integer seasonNumber;
    private Integer seasonYear;
    private Integer totalGamesThisSeason;
    private List<Stats> stats;
}
