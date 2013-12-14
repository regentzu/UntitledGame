package com.regentzu.untitledgame.bodypart.guidepart;
import com.regentzu.untitledgame.bodypart.decorations.BreastSizes;
class Breasts extends BodyPart {

    private var size:BreastSizes;

    public function new() {
        super();
    }

    public function getSize():BreastSizes {
          return size;
    }

    public function setSize(newSize:BreastSizes) {
        size = newSize;
    }

}
