package com.regentzu.untitledgame.bodypart.mainpart;
import com.regentzu.untitledgame.bodypart.guidepart.Hair;
import com.regentzu.untitledgame.bodypart.decorations.Colors;
class HairHuman extends Hair{

    public function new() {
        super();
        color = Colors.BROWN;
        length = 5.08;
        description = 'unremarkable $color hair, measuring $length centimeters in length';
    }
}
