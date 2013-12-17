package com.regentzu.untitledgame.bodypart.guidepart;

import com.regentzu.untitledgame.bodypart.BodyPart;
import com.regentzu.untitledgame.bodypart.BodyPartProperties;

/**
 * Created on 12/16/13.
 */
public abstract class Anus extends BodyPart {

    public int capacity = 1;
    public int wetness = 1;

    @Override
    protected void partSetup() {
        this.properties.put(BodyPartProperties.virgin, true);
    }

}
