package com.regentzu.untitledgame.bodypart.guidepart;
class Anus extends BodyPart {

    private var capacity:Int = 1;
    private var wetness:Int = 1;

    public function new() {
        super();
        properties.set(BodyPartProperty.virgin, true);
    }
}
