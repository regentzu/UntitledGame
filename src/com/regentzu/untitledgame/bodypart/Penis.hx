package com.regentzu.untitledgame.bodypart;
class Penis extends BodyPart {

    //length and girth recorded in cm
    private var length:Float;
    private var girth:Float;

    public function new() {
    }

    public function getLength():Float {
        return length;
    }

    public function setLength(newLength:Float) {
        length = newLength;
    }

    public function getGirth():Float {
        return girth;
    }

    public function setGirth(newGirth:Float) {
        girth = newGirth;
    }

}
