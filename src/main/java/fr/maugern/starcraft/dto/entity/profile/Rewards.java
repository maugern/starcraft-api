/**
 * Rewards.java
 * @author Nicolas
 * Created on 17 juin 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * All player's rewards.
 * @since 1.0
 */
@Data
public class Rewards implements Serializable {
    private static final long serialVersionUID = 8065835714272472407L;
    private List<Long> selected;
    private List<Long> earned;
}

