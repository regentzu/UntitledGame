package com.regentzu.untitledgame.character.generic;

import com.regentzu.untitledgame.bodypart.mainpart.AnusHuman;
import com.regentzu.untitledgame.bodypart.mainpart.BallsHuman;
import com.regentzu.untitledgame.bodypart.mainpart.PenisHuman;
import com.regentzu.untitledgame.bodypart.decorations.BreastSizes;
import com.regentzu.untitledgame.bodypart.mainpart.BreastsHuman;
import com.regentzu.untitledgame.bodypart.mainpart.HandsHuman;
import com.regentzu.untitledgame.bodypart.mainpart.FeetHuman;
import com.regentzu.untitledgame.bodypart.mainpart.LegsHuman;
import com.regentzu.untitledgame.bodypart.mainpart.ArmsHuman;
import com.regentzu.untitledgame.bodypart.mainpart.TorsoHuman;
import com.regentzu.untitledgame.bodypart.mainpart.FaceHuman;
import com.regentzu.untitledgame.bodypart.mainpart.EyesHuman;
import com.regentzu.untitledgame.bodypart.mainpart.HairHuman;

class GenericMaleHuman extends Character{
    public function new() {
        super();
        hair = new HairHuman();
        eyes = new EyesHuman();
        face = new FaceHuman();
        torso = new TorsoHuman();
        arms = new ArmsHuman();
        hands = new HandsHuman();
        legs = new LegsHuman();
        feet = new FeetHuman();
        var manlyBreasts = new BreastsHuman();
        manlyBreasts.setSize(BreastSizes.MANLY);
        breasts.push(manlyBreasts);
        cocks.push(new PenisHuman());
        balls.push(new BallsHuman());
        anus = new AnusHuman();
    }
}
