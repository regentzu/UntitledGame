package com.regentzu.untitledgame.bodypart.guidepart;

import com.regentzu.untitledgame.bodypart.BodyPart;
import com.regentzu.untitledgame.bodypart.decorator.Colors;

/**
 * Created on 12/16/13.
 */
public abstract class Hair extends BodyPart {

    protected Float length; //length in cm
    protected Colors color;

    @Override
    protected void partSetup() {
        this.length = 2.5f;
        this.color = Colors.BROWN;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
