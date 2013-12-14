package com.regentzu.untitledgame.character;

import com.regentzu.untitledgame.bodypart.BodyPart;
import com.haxepunk.Entity;
import com.regentzu.untitledgame.bodypart.Breasts;
import com.regentzu.untitledgame.bodypart.Anus;
import com.regentzu.untitledgame.bodypart.Vagina;
import com.regentzu.untitledgame.bodypart.Clitoris;
import com.regentzu.untitledgame.bodypart.Balls;
import com.regentzu.untitledgame.bodypart.Penis;
import com.regentzu.untitledgame.bodypart.Feet;
import com.regentzu.untitledgame.bodypart.Legs;
import com.regentzu.untitledgame.bodypart.Hands;
import com.regentzu.untitledgame.bodypart.Arms;
import com.regentzu.untitledgame.bodypart.Wings;
import com.regentzu.untitledgame.bodypart.Torso;
import com.regentzu.untitledgame.bodypart.Face;
import com.regentzu.untitledgame.bodypart.Eyes;
import com.regentzu.untitledgame.bodypart.Hair;
import com.regentzu.untitledgame.bodypart.Antenna;
import com.regentzu.untitledgame.bodypart.Horns;

/**
* Character class that will be the base of enemies, npc's and the player
*
*
**/
class Character extends Entity {

    // Base Stats
    private var levelMultiplier:Float = 0.1;
    private var baseHealth:Float = 100.0;
    private var baseStamina:Float = 100.0;
    private var baseMagicka:Float = 100.0;
    private var baseCorruption:Float = 100.0;

    // Current Stats
    private var level:Int = 1;
    private var currentHealth:Float;
    private var currentStamina:Float;
    private var currentMagicka:Float;
    private var currentCorruption:Float = 0.0;
    private var characterHeight:Float = 180.0; //height in centimeters
    private var coins:Int = 0; //currency

    // Inventory
    private var inventory:Array<Dynamic>;

    // Special Flags
    private var flags:Map<CharacterFlags, Bool>;

    // Body Parts
    private var horns:Horns;
    private var antenna:Antenna;
    private var hair:Hair;
    private var eyes:Eyes;
    private var face:Face;
    private var torso:Torso;
    private var wings:Wings;
    private var arms:Arms;
    private var hands:Hands;
    private var legs:Legs;
    private var feet:Feet;

    // Sexual Body Parts
    private var breasts:Array<Breasts>;
    private var cocks:Array<Penis>;
    private var balls:Array<Balls>;
    private var clit:Clitoris;
    private var cunts:Array<Vagina>;
    private var anus:Anus;

    public function new() {
        super();
        //create an empty inventory
        inventory = new Array<Dynamic>();

        //prep the flag system
        flags = new Map<CharacterFlags, Bool>();

        //spawn at full readiness
        currentHealth = getMaximumHealth();
        currentStamina = getMaximumStamina();
        currentMagicka = getMaximumMagicka();

        //create arrays to support multiple body parts
        breasts = new Array<Breasts>();
        cocks = new Array<Penis>();
        balls = new Array<Balls>();
        cunts = new Array<Vagina>();
    }

    // BaseStats Calculation
    private function getMultiplier():Float {
        return 1.0 + (level * levelMultiplier);
    }

    public function getMaximumHealth():Int {
        return Math.round(getMultiplier() * baseHealth);
    }

    public function getMaximumStamina():Int {
        return Math.round(getMultiplier() * baseStamina);
    }

    public function getMaximumMagicka():Int {
        return Math.round(getMultiplier() * baseMagicka);
    }

    public function getMaximumCorruption():Int {
        return Math.round(getMultiplier() * baseCorruption);
    }

    // Current Stats Functions
    public function getCurrentHealth():Float {
        return currentHealth;
    }

    public function setCurrentHealth(newHealth:Float) {
        currentHealth = newHealth;
    }

    public function getCurrentStamina():Float {
        return currentStamina;
    }

    public function setCurrentStamina(newStamina:Float) {
        currentStamina = newStamina;
    }

    public function getCurrentMagicka():Float {
        return currentMagicka;
    }

    public function setCurrentMagicka(newMagicka:Float) {
        currentMagicka = newMagicka;
    }

    public function getCurrentCorruption():Float {
        return currentCorruption;
    }

    public function setCurrentCorruption(newCorruption:Float) {
        currentCorruption = newCorruption;
    }

    public function getLevel():Int {
        return level;
    }

    public function setLevel(newLevel:Int) {
        level = newLevel;
    }

    public function getCharacterHeight():Float {
        return characterHeight;
    }

    public function setCharacterHeight(newHeight:Float) {
        characterHeight = newHeight;
    }

    public function getCoins():Int {
        return coins;
    }

    public function setCoins(newCoins:Int) {
        coins = newCoins;
    }

    // Body Part Functions
    public function getHorns():Horns {
        return horns;
    }

    public function setHorns(newPart:Horns) {
        horns = newPart;
    }

    public function getAntenna():Antenna {
        return antenna;
    }

    public function setAntenna(newPart:Antenna) {
        antenna = newPart;
    }

    public function getHair():Hair {
        return hair;
    }

    public function setHair(newPart:Hair) {
        hair = newPart;
    }

    public function getEyes():Eyes {
        return eyes;
    }

    public function setEyes(newPart:Eyes) {
        eyes = newPart;
    }

    public function getFace():Face {
        return face;
    }

    public function setFace(newPart:Face) {
        face = newPart;
    }

    public function getTorso():Torso {
        return torso;
    }

    public function setTorso(newPart:Torso) {
        torso = newPart;
    }

    public function getWings():Wings {
        return wings;
    }

    public function setWings(newPart:Wings) {
        wings = newPart;
    }

    public function getArms():Arms {
        return arms;
    }

    public function setArms(newPart:Arms) {
        arms = newPart;
    }

    public function getHands():Hands {
        return hands;
    }

    public function setHands(newPart:Hands) {
        hands = newPart;
    }

    public function getLegs():Legs {
        return legs;
    }

    public function setLegs(newPart:Legs) {
        legs = newPart;
    }

    public function getFeet():Feet {
        return feet;
    }

    public function setFeet(newPart:Feet) {
        feet = newPart;
    }

    public function getBreasts():Array<Breasts> {
        return breasts;
    }

    public function setBreasts(newPart:Array<Breasts>) {
        breasts = newPart;
    }

    // Sexual Body Parts Functions
    public function getCocks():Array<Penis> {
        return cocks;
    }

    public function setCocks(newPart:Array<Penis>) {
        cocks = newPart;
    }

    public function getBalls():Array<Balls> {
        return balls;
    }

    public function setBalls(newPart:Array<Balls>) {
        balls = newPart;
    }

    public function getClit():Clitoris {
        return clit;
    }

    public function setClit(newPart:Clitoris) {
        clit = newPart;
    }

    public function getCunts():Array<Vagina> {
        return cunts;
    }

    public function setCunts(newPart:Array<Vagina>) {
        cunts = newPart;
    }

    public function getAnus(): Anus {
        return anus;
    }

    public function setAnus(newPart:Anus) {
        anus = newPart;
    }

    // Other Functions

    private function safeGetPartDescription(part:BodyPart):String {
        if(part != null) { return part.getDescription(); }
        return "";
    }

    public function getDescription():String {

        var breastsDescription:String = '';
        for( i in 0...breasts.length) {
            breastsDescription += '$i: ${safeGetPartDescription(breasts[i])}';
        }

        var cocksDescription:String = '';
        for( i in 0...cocks.length) {
            cocksDescription += '$i: ${safeGetPartDescription(cocks[i])}';
        }

        var ballsDescription:String = '';
        for( i in 0...balls.length) {
            ballsDescription += '$i: ${safeGetPartDescription(balls[i])}';
        }

        var cuntsDescription:String = '';
        for( i in 0...cunts.length) {
            cuntsDescription += '$i: ${safeGetPartDescription(cunts[i])}';
        }

        var description:String = '
        <b>Test Description. Override getDescription() to provide a description for this creature</b>

        <b>Stats</b>
        Level: $level
        LevelMultiplier: $levelMultiplier
        Coins: $coins
        InventorySize: ${inventory.length}
        MaxHealth: ${getMaximumHealth()}
        CurrentHealth: $currentHealth
        MaxStamina: ${getMaximumStamina()}
        CurrentStamina: $currentStamina
        MaxMagicka: ${getMaximumMagicka()}
        CurrentMagicka: $currentMagicka
        MaxCorruption: ${getMaximumCorruption()}
        CurrentCorruption: $currentCorruption
        ';

        description += '
        <b>Body Parts</b>
        Horns: ${safeGetPartDescription(horns)}
        Antenna: ${safeGetPartDescription(antenna)}
        Hair: ${safeGetPartDescription(hair)}
        Eyes: ${safeGetPartDescription(eyes)}
        Face: ${safeGetPartDescription(face)}
        Torso: ${safeGetPartDescription(torso)}
        Wings: ${safeGetPartDescription(wings)}
        Arms: ${safeGetPartDescription(arms)}
        Hands: ${safeGetPartDescription(hands)}
        Legs: ${safeGetPartDescription(legs)}
        Feet: ${safeGetPartDescription(feet)}

        <b>Sexual Parts</b>
        BreastsCount: ${breasts.length}}
        Breasts: $breastsDescription
        CockCount: ${cocks.length}
        Cocks: $cocksDescription
        BallsCount: ${balls.length}
        Balls: $ballsDescription
        Clit: ${safeGetPartDescription(clit)}
        CuntsCount: ${cunts.length}
        Cunts: $cuntsDescription
        Anus: ${safeGetPartDescription(anus)}
        ';
        return description;
    }

}