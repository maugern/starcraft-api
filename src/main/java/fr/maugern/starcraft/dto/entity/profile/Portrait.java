/**
 * Portrait.java
 * @author Nicolas
 * Created on 2 juin 2017
 */
package fr.maugern.starcraft.dto.entity.profile;

import java.io.Serializable;
import java.net.URL;

import lombok.Data;

/**
 * Picture used by a player.
 * @since 1.0
 */
@Data
public class Portrait implements Serializable {
    private static final long serialVersionUID = 2676450777031163389L;
    private Integer x;
    private Integer y;
    private Integer w;
    private Integer h;
    private Integer offset;
    private URL url;
}
