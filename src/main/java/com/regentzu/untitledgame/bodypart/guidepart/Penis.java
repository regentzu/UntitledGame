package com.regentzu.untitledgame.bodypart.guidepart;

import com.regentzu.untitledgame.bodypart.BodyPart;

/**
 * Created on 12/16/13.
 */
public abstract class Penis extends BodyPart {

    protected float length; //length in cm
    protected float girth; //diameter in cm

    @Override
    protected void partSetup() {
        this.length = 15f;
        this.girth = 7f;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getGirth() {
        return girth;
    }

    public void setGirth(float girth) {
        this.girth = girth;
    }
}
