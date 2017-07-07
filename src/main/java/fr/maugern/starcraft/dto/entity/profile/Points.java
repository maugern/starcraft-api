/**
 * Points.java
 * @author Nicolas
 * Created on 17 juin 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

/**
 * Total and collections of obtain points by a player in this career.
 * @since 1.0
 */
@Data
public class Points implements Serializable {
    private static final long serialVersionUID = 2110746551944656802L;
    private Integer totalPoints;
    private Map<Integer,Integer> CategoryPoints;
}
