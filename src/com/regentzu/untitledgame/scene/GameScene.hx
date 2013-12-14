package com.regentzu.untitledgame.scene;

import com.haxepunk.graphics.Text;
import com.regentzu.untitledgame.character.Character;
import com.haxepunk.Entity;
import flash.trace.Trace;
import com.regentzu.untitledgame.character.generic.GenericMaleHuman;
import com.haxepunk.graphics.Image;
import com.haxepunk.Scene;

class GameScene extends Scene {
    public function new() {
        super();
    }

    public override function begin()
    {
        //addGraphic(new Image("graphics/block.png"));
        var temp:Character = new GenericMaleHuman();
        var textBox:Entity = new Entity();
        textBox.addGraphic(new Text(temp.getDescription()));
        add(textBox);

    }
}
