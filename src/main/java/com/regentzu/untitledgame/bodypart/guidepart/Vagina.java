package com.regentzu.untitledgame.bodypart.guidepart;

import com.regentzu.untitledgame.bodypart.BodyPart;
import com.regentzu.untitledgame.bodypart.BodyPartProperties;

/**
 * Created on 12/16/13.
 */
public abstract class Vagina extends BodyPart {

    protected int capacity;
    protected int wetness;

    @Override
    protected void partSetup() {
        this.set(BodyPartProperties.virgin,true);
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
