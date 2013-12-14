package com.regentzu.untitledgame.scene;

import flash.text.TextField;
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
        var textGraphic = new Text(temp.getDescription());
        textGraphic.scrollY = 1.0;
        var textBox:Entity = new Entity(30,30,textGraphic);
        add(textBox);
    }
}
