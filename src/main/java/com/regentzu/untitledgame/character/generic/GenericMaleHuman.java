package com.regentzu.untitledgame.character.generic;

import com.regentzu.untitledgame.bodypart.guidepart.BreastSizes;
import com.regentzu.untitledgame.bodypart.guidepart.Breasts;
import com.regentzu.untitledgame.bodypart.mainpart.human.*;

/**
 * Generic Human Male Class
 *
 * Created on 12/16/13.
 */
public class GenericMaleHuman extends com.regentzu.untitledgame.character.Character {

    @Override
    protected void init() {
        hair = new HairHuman();
        eyes = new EyesHuman();
        face = new FaceHuman();
        torso = new TorsoHuman();
        arms = new ArmsHuman();
        hands = new HandsHuman();
        legs = new LegsHuman();
        feet = new FeetHuman();
        Breasts manlyBreasts = new BreastsHuman();
        manlyBreasts.size = BreastSizes.MANLY;
        breasts.add(manlyBreasts);
        cocks.add(new PenisHuman());
        balls.add(new BallsHuman());
        anus = new AnusHuman();
    }
}
