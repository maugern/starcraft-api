/**
 * League.java
 * @author Nicolas
 * Created on 20 mai 2017
 */
package fr.maugern.starcraft.model;

import java.io.IOException;
import java.lang.reflect.Type;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONSerializable;
import com.alibaba.fastjson.serializer.JSONSerializer;

/**
 * StarCraft rank league.
 * @since 1.0
 */
public enum League implements JSONSerializable {
    
    BRONZE("BRONZE"),
    SILVER("SILVER"),
    GOLD("GOLD"),
    PLATINUM("PLATINUM"),
    DIAMOND("DIAMOND"),
    MASTER("MASTER"),
    GRANDMASTER("GRANDMASTER");
    
    private final String league;
    
    private League(String league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return league;
    }

    /* (non-Javadoc)
     * @see com.alibaba.fastjson.serializer.JSONSerializable#write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.reflect.Type, int)
     */
    @Override
    public void write(JSONSerializer serializer, Object fieldName, Type fieldType, int features) throws IOException {
        JSONObject json = new JSONObject();
        json.put("league", league);
        serializer.write(json);
    }
}
