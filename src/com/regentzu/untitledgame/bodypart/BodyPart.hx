package com.regentzu.untitledgame.bodypart;
class BodyPart {

    //short descriptions
    private var shortDescriptions:Array<String>;
    //description for the bodypart
    private var description:String = "";
    //dynamic property map
    private var properties:Map<BodyPartProperty,Dynamic>;

    public function new() {
        shortDescriptions = new Array<String>();
        properties = new Map<BodyPartProperty,Dynamic>();
    }

    // Property Functions //

    public function has(key:BodyPartProperty):Bool {
        return properties.exists(key);
    }

    public function get(key:BodyPartProperty):Dynamic {
        return properties.get(key);
    }

    public function set(key:BodyPartProperty, value:Dynamic) {
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
