package com.regentzu.untitledgame.bodypart;
class BodyPart {

    //short descriptions
    private var shortDescriptions : Array<String> = new Array<String>();
    //description for the bodypart
    private var description : String = "";
    //dynamic property map
    private var properties : Map<String,Dynamic> = new Map<String,Dynamic>();

    public function new() {

    }

    // Property Functions //

    public function has(key:String):Bool {
        return properties.exists(key);
    }

    public function get(key:String):Dynamic {
        properties.get(key);
    }

    public function set(key:String, value:Dynamic) {
        properties.set(key, value);
    }

    // Description Functions

    public function getDescription():String {
        return description;
    }

    public function getShortDescription():String {
        return shortDescriptions[0];
    }

    public function getRandomShortDescription():String {
        return shortDescriptions[Std.random(shortDescriptions.length)];
    }

}
