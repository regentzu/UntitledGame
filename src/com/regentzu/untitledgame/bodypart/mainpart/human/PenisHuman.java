package com.regentzu.untitledgame.bodypart.mainpart.human;

import com.regentzu.untitledgame.bodypart.guidepart.Penis;

/**
 * Created on 12/16/13.
 */
public class PenisHuman extends Penis {
    @Override
    protected void init() {
        description = String.format("an average human cock, %s cm long, and %s cm wide",length,girth);
    }
}
