package com.regentzu.untitledgame.bodypart.guidepart;

import com.regentzu.untitledgame.bodypart.BodyPart;

/**
 * Created on 12/16/13.
 */
public abstract class Clitoris extends BodyPart {

    protected Float length; //length in cm

    @Override
    protected void partSetup() {
        //TODO: initialize generic parts
        this.length = 1.5f;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }
}
