/**
 * StarcraftException.java
 * @author Nicolas
 * Created on 3 juin 2017
 */
package fr.maugern.starcraft.api;

public class StarcraftException extends Exception {
    
    private static final long serialVersionUID = -3457825554548943154L;

    public enum StarCraftExceptionCause {
        CONFIG_ERROR,
        INTERNAL_ERROR,
        RESSOURCE_NOT_FOUND,
        RESSOURCE_CONFLICT_ERROR,
        BAD_PARAMETERS_ERROR,
        NOT_ALLOWED,
        AUTH_ERROR,
        API_ERROR;
    };
    
    private final StarCraftExceptionCause starcraftCause;

    public StarcraftException(String message, StarCraftExceptionCause starcraftCause) {
        super(message);
        this.starcraftCause = starcraftCause;
    }

    public StarCraftExceptionCause getStarCraftCause() {
        return starcraftCause;
    }

    @Override
    public String toString() {
        return "StarcraftException [starcraftCause=" + starcraftCause + "] : " + getLocalizedMessage();
    }

}
