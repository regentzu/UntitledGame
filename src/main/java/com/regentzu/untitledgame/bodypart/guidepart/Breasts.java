package com.regentzu.untitledgame.bodypart.guidepart;

import com.regentzu.untitledgame.bodypart.BodyPart;

/**
 * Created on 12/16/13.
 */
public abstract class Breasts extends BodyPart {
    protected BreastSizes size;

    @Override
    protected void partSetup() {
        this.size = BreastSizes.A;
    }

    public BreastSizes getSize() {
        return size;
    }

    public void setSize(BreastSizes size) {
        this.size = size;
    }
}
