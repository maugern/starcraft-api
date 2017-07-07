/**
 * Decision.java
 * @author Nicolas
 * Created on 15 juin 2017
 */
package fr.maugern.starcraft.model;

import java.io.IOException;
import java.lang.reflect.Type;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONSerializable;
import com.alibaba.fastjson.serializer.JSONSerializer;

/**
 * Result of StarCraft match.
 * @since 1.0
 */
public enum Decision implements JSONSerializable {

    BAILER("BAILER"),
    LOSS("LOSS"),
    TIE("TIE"),
    WIN("WIN");
    
    private final String decision;

    private Decision(String decision) {
        this.decision = decision;
    }
    
    @Override
    public String toString() {
        return decision;
    }
    
    /* (non-Javadoc)
     * @see com.alibaba.fastjson.serializer.JSONSerializable#write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.reflect.Type, int)
     */
    @Override
    public void write(JSONSerializer serializer, Object fieldName, Type fieldType, int features) throws IOException {
        JSONObject json = new JSONObject();
        json.put("decision", decision);
        serializer.write(json);
    }
}
