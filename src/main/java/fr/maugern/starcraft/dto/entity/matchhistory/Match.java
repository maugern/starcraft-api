/**
 * Match.java
 * @author Nicolas
 * Created on 2 juin 2017
 */
package fr.maugern.starcraft.dto.entity.matchhistory;

import java.io.Serializable;
import java.util.Date;

import fr.maugern.starcraft.model.Decision;
import lombok.Data;

/**
 * StarCraft 2 match.
 * @since 1.0
 */
@Data
public class Match implements Serializable {
    private static final long serialVersionUID = -8368495482086428992L;
    private String map;
    private String type;
    private Decision decision;
    private String speed;
    private Date date;
    
    /**
     * We have to redefine date here because blizzard give epoch
     * in second, and {@link java.util.Date#getTime()} is in millisecond.  
     * @param date
     */
    public void setDate(Date date) {
        this.date = new Date(date.getTime() * 1000);
    }
}
