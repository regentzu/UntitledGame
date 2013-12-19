package com.regentzu.untitledgame.bodypart.guidepart;

import com.regentzu.untitledgame.bodypart.BodyPart;

/**
 * Created on 12/16/13.
 */
public abstract class Balls extends BodyPart{

    protected Float width;

    @Override
    protected void partSetup() {
        this.width = 1f;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }
}
