/**
 * Ladder.java
 * @author Nicolas
 * Created on 18 juin 2017
 */
package fr.maugern.starcraft.dto.entity.ladder;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * Ladder class. Contains {@link fr.maugern.starcraft.dto.entity.ladder.LadderMember}
 * @since 1.0
 */
@Data
public class Ladder implements Serializable {
    private static final long serialVersionUID = 4240206421097805733L;
    private List<LadderMember> ladderMembers;
}
