package com.regentzu.untitledgame.bodypart.mainpart.human;

import com.regentzu.untitledgame.bodypart.decorator.Colors;
import com.regentzu.untitledgame.bodypart.guidepart.Eyes;

/**
 * Created on 12/16/13.
 */
public class EyesHuman extends Eyes {
    @Override
    protected void init() {
        color = Colors.GREEN;
        description = String.format("clear %s eyes",getColor().getDescription());
    }
}
