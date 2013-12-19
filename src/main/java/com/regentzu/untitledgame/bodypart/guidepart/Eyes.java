package com.regentzu.untitledgame.bodypart.guidepart;

import com.regentzu.untitledgame.bodypart.BodyPart;
import com.regentzu.untitledgame.bodypart.decorator.Colors;

/**
 * Created on 12/16/13.
 */
public abstract class Eyes extends BodyPart {

    public Colors color;

    @Override
    protected void partSetup() {
        this.color = Colors.BLUE;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
