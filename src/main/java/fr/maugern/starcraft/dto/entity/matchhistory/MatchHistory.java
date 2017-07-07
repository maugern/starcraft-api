/**
 * MatchHistory.java
 * @author Nicolas Mauger
 * Created on 2 juin 2017
 */
package fr.maugern.starcraft.dto.entity.matchhistory;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * MatchHistory containing {@link fr.maugern.starcraft.dto.entity.matchhistory.Match}.
 * @since 1.0
 */
@Data
public class MatchHistory implements Serializable {
    private static final long serialVersionUID = 8592625223436185203L;
    private List<Match> matches;
}
