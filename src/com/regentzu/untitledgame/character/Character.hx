package com.regentzu.untitledgame.character;

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
class Character {

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
    private var coins:Int = 0;

    // Inventory
    private var inventory:Array<Dynamic> = new Array<Dynamic>();

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

    public function getAntenna():Horns {
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
    public function getDescription():String {

        var breastsDescription = '';
        for( i in 0...breasts.length) {
            breastsDescription += '$i: ${breasts[i].getDescription()}'
        }

        var cocksDescription = '';
        for( i in 0...cocks.length) {
            cocksDescription += '$i: ${cocks[i].getDescription()}'
        }

        var ballsDescription = '';
        for( i in 0...balls.length) {
            ballsDescription += '$i: ${balls[i].getDescription()}'
        }

        var cuntsDescription = '';
        for( i in 0...cunts.length) {
            cuntsDescription += '$i: ${cunts[i].getDescription()}'
        }

        description = '
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

        <b>Body Parts</b>
        Horns: ${horns.getDescription()}
        Antenna: ${antenna.getDescription()}
        Hair: ${hair.getDescription()}
        Eyes: ${eyes.getDescription()}
        Face: ${face.getDescription()}
        Torso: ${torso.getDescription()}
        Wings: ${wings.getDescription()}
        Arms: ${arms.getDescription()}
        Hands: ${hands.getDescription()}
        Legs: ${legs.getDescription()}
        Feet: ${feet.getDescription()}

        <b>Sexual Parts</b>
        BreastsCount: ${breasts.length}}
        Breasts: $breastsDescription
        CockCount: ${cocks.length}
        Cocks: $cocksDescription
        BallsCount: ${balls.length}
        Balls: $ballsDescription
        Clit: ${clit.getDescription()}
        CuntsCount: ${cunts.length}
        Cunts: $cuntsDescription
        Anus: ${anus.getDescription()}
        ';
        return description;
    }

}