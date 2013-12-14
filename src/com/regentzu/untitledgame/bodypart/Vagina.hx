package com.regentzu.untitledgame.bodypart;
class Vagina extends BodyPart {

    private var wetness:Int = 1;
    private var capacity:Int = 1;

    public function new() {
        super();
        properties.set(BodyPartProperty.virgin, true);
    }
}
