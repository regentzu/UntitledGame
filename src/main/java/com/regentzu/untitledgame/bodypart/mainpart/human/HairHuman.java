package com.regentzu.untitledgame.bodypart.mainpart.human;

import com.regentzu.untitledgame.bodypart.decorator.Colors;
import com.regentzu.untitledgame.bodypart.guidepart.Hair;

/**
 * Created on 12/16/13.
 */
public class HairHuman extends Hair {
    @Override
    protected void init() {
        color = Colors.BROWN;
        length = 5.08f;
        description = String.format("unremarkable %s hair, measuring %s centimeters in length", getColor().getDescription(), getLength());
    }
}
