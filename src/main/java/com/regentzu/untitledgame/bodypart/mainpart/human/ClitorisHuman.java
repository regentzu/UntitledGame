package com.regentzu.untitledgame.bodypart.mainpart.human;

import com.regentzu.untitledgame.bodypart.guidepart.Clitoris;

/**
 * Created on 12/16/13.
 */
public class ClitorisHuman extends Clitoris {
    @Override
    protected void init() {
        description = String.format("an unassuming human clitoris measuring %s cm long",getLength());
    }
}
