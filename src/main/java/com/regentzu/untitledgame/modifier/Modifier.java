package com.regentzu.untitledgame.modifier;

import com.regentzu.untitledgame.character.CharacterModifiers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 12/16/13.
 */
public abstract class Modifier {
    protected Map<CharacterModifiers, List<Float>> modifiers = new HashMap<CharacterModifiers, List<Float>>();

    public Float getModifiers(CharacterModifiers modifier) {
        if(modifiers.containsKey(modifier)) {
            Float totalMod = 0.0f;
            for(Float mod : modifiers.get(modifier)) {
                totalMod += mod;
            }
            return totalMod;
        }
        return 0.0f;
    }
}
