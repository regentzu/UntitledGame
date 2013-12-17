package com.regentzu.untitledgame.bodypart.mainpart.human;

import com.regentzu.untitledgame.bodypart.guidepart.Balls;

/**
 * Created on 12/16/13.
 */
public class BallsHuman extends Balls {
    @Override
    protected void init() {
        description = String.format("a pair of average human balls, each #s cm in diameter",width);
    }
}
