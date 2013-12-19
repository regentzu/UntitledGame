package com.regentzu.untitledgame.bodypart.guidepart;

import com.regentzu.untitledgame.bodypart.BodyPart;
import com.regentzu.untitledgame.bodypart.BodyPartProperties;

/**
 * Created on 12/16/13.
 */
public abstract class Anus extends BodyPart {

    protected int capacity = 1;
    protected int wetness = 1;

    @Override
    protected void partSetup() {
        this.properties.put(BodyPartProperties.virgin, true);
        this.capacity = 1;
        this.wetness = 1;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWetness() {
        return wetness;
    }

    public void setWetness(int wetness) {
        this.wetness = wetness;
    }
}
