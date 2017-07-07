/**
 * Region.java
 * @author Nicolas
 * Created on 20 mai 2017
 */
package fr.maugern.starcraft.config;

/**
 * Enumeration of Regionality and partition of StarCraft servers.
 * More info <a href="https://dev.battle.net/docs/read/concepts/Regionality">in API documentation</a>.
 * @since 1.0
 */
public enum Region {
    
    /** America */
    America("us.api.battle.net"),
    
    /** Europe & Africa*/
    Europe("eu.api.battle.net"),
    
    /** Korea */
    Korea("kr.api.battle.net"),
    
    /** Taiwan */
    Taiwan("tw.api.battle.net"),
    
    /** Asia & Oceania */
    SoutheastAsia("sea.api.battle.net"),
    
    /** China */
    China("api.battlenet.com.cn");
    
    private final String host;
    
    private Region(String host) {
        this.host = host;
    }
    
    @Override
    public String toString() {
        return host;
    }
}
