package com.regentzu.untitledgame.bodypart.guidepart;

import com.regentzu.untitledgame.bodypart.BodyPart;
import com.regentzu.untitledgame.bodypart.decorator.Colors;

/**
 * Created on 12/16/13.
 */
public abstract class Hair extends BodyPart {

    public Float length = 2.5f; //length in cm
    public Colors color = Colors.BROWN;

    @Override
    protected void partSetup() {
        //TODO: initialize generic parts
    }
}
