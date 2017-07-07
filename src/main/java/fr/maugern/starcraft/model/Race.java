/**
 * Race.java
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
 * StarCraft race (random included).
 * @since 1.0
 */
public enum Race implements JSONSerializable {
    
    PROTOSS("PROTOSS"),
    RANDOM("RANDOM"),
    TERRAN("TERRAN"),
    ZERG("ZERG");
    
    private final String race;

    private Race(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return race;
    }

    /* (non-Javadoc)
     * @see com.alibaba.fastjson.serializer.JSONSerializable#write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.reflect.Type, int)
     */
    @Override
    public void write(JSONSerializer serializer, Object fieldName, Type fieldType, int features) throws IOException {
        JSONObject json = new JSONObject();
        json.put("race", race);
        serializer.write(json);
    }
}
