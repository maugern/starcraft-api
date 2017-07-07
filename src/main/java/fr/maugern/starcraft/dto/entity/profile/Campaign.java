/**
 * Campaign.java
 * @author Nicolas
 * Created on 2 juin 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;

import lombok.Data;

/**
 * Payers campaign progression.
 * @since 1.0
 */
@Data
public class Campaign implements Serializable {
    private static final long serialVersionUID = 667068116177653280L;
    private String wol;
    private String hots;
    private String lotv;
}
