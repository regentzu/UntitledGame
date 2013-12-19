package com.regentzu.untitledgame.character;

import com.regentzu.untitledgame.bodypart.BodyPart;
import com.regentzu.untitledgame.bodypart.guidepart.*;
import com.regentzu.untitledgame.inventory.Inventory;
import com.regentzu.untitledgame.inventory.InventoryException;
import com.regentzu.untitledgame.inventory.InventoryItem;
import com.regentzu.untitledgame.modifier.Modifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 12/16/13.
 */
public abstract class Character {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    //Base Stats
    protected Float levelMultiplier = 0.02f;
    protected Float baseHealth = 100.0f;
    protected Float baseStamina = 100.0f;
    protected Float baseMagicka = 100.0f;
    protected Float baseCorruption = 100.0f;
    protected Float baseArmor = 0.0f;

    //Current Stats
    protected Float currentHealth;
    protected Float currentStamina;
    protected Float currentMagicka;
    protected Float currentCorruption = 0.0f;
    protected Float currentArmor = 0.0f;

    protected String name = "";
    protected int level = 1;
    protected Float characterHeight = 180.0f;
    protected int coins = 0;

    // Equipped items
    protected Map<CharacterEquipment,InventoryItem> equipped = new HashMap<CharacterEquipment, InventoryItem>();

    // Inventory Items
    protected Inventory inventory = new Inventory();

    // Flags
    protected Map<CharacterFlags, Object> flags = new HashMap<CharacterFlags, Object>();

    // Modifiers
    protected List<Modifier> modifiers = new ArrayList<Modifier>();

    // Body Parts
    protected Horns horns;
    protected Antenna antenna;
    protected Hair hair;
    protected Eyes eyes;
    protected Face face;
    protected Torso torso;
    protected Wings wings;
    protected Arms arms;
    protected Hands hands;
    protected Legs legs;
    protected Feet feet;

    //Sexual Body Parts
    protected List<Breasts> breasts = new ArrayList<Breasts>();
    protected List<Penis> cocks = new ArrayList<Penis>();
    protected List<Balls> balls = new ArrayList<Balls>();
    protected Clitoris clit;
    protected Vagina cunt;
    protected Anus anus;

    public Character() {
        //spawn at full readiness
        this.currentHealth = this.getMaximumHealth();
        this.currentStamina = this.getMaximumStamina();
        this.currentMagicka = this.getMaximumMagicka();
        this.currentArmor = getMaximumArmor();
        init();
        sanityCheck();
    }

    protected abstract void init();

    /**
     * simple check that basic parts are initialized
     */
    private void sanityCheck() {
        if (this.hair == null
                || this.eyes == null
                || this.face == null
                || this.torso == null
                || this.arms == null
                || this.hands == null
                || this.legs == null
                || this.feet == null
                || this.anus == null) {
            logger.warn("One or more essential body parts were not initialized for the class");
        }
    }

    private Float getMultiplier() {
        return 1.0f + (this.levelMultiplier * level);
    }

    protected Float getModifiers(CharacterModifiers modifier) {
        Float totalMod = 1.0f;
        // Apply modifiers directly from the character
        for (Modifier mod : this.modifiers) totalMod += mod.getModifiers(modifier);
        // Apply modifiers from equipped gear if any
        for (CharacterEquipment key : equipped.keySet()) {
            InventoryItem item = equipped.get(key);
            for(Modifier mod : item.getModifiers()) {
                totalMod += mod.getModifiers(modifier);
            }
        }
        return totalMod;
    }

    public Float getMaximumHealth() {
        return (baseHealth * getMultiplier()) * getModifiers(CharacterModifiers.HEALTH);
    }

    public Float getMaximumStamina() {
        return (baseStamina * getMultiplier()) * getModifiers(CharacterModifiers.STAMINA);
    }

    public Float getMaximumMagicka() {
        return (baseMagicka * getMultiplier()) * getModifiers(CharacterModifiers.MAGICKA);
    }

    public Float getMaximumCorruption() {
        return (baseCorruption * getMultiplier()) * getModifiers(CharacterModifiers.CORRUPTION);
    }

    public Float getMaximumArmor() {
        return baseArmor * getMultiplier() + getModifiers(CharacterModifiers.ARMOR);
    }

    private String getSafeDescription(BodyPart part) {
        if(part != null) { return part.getDescription(); }
        return "";
    }

    @Override
    public String toString() {
        StringBuffer inventoryString = new StringBuffer();
        for(int index = 0; index < inventory.size(); index++) {
            try {
                InventoryItem item = inventory.get(index);
                if (item != null) inventoryString.append(String.format("<li>inventory[%d]: %s</li>\n", index, item));
            } catch (InventoryException ie) {
                ie.printStackTrace();
            }
        }

        StringBuffer breastsString = new StringBuffer();
        int count = 0;
        for(Breasts breast : this.breasts) {
            breastsString.append(String.format("<li>%d: %s</li>\n",count,breast));
            count++;
        }

        StringBuffer cocksString = new StringBuffer();
        count = 0;
        for(Penis cock : this.cocks) {
            cocksString.append(String.format("<li>%d: %s</li>\n",count,cock));
            count++;
        }

        StringBuffer ballsString = new StringBuffer();
        count = 0;
        for(Balls ball : this.balls) {
            ballsString.append(String.format("<li>%d: %s</li>\n",count,ball));
            count++;
        }

        StringBuffer buffer = new StringBuffer();
        buffer.append("<b>Test Description. Override toString() to provide a description for this creature</b><br/>\n");
        buffer.append("<br/>\n");
        buffer.append("<b>Stats</b><br/>\n");
        buffer.append(String.format("Name: %s<br/>\n",this.name));
        buffer.append(String.format("Level: %s<br/>\n",this.level));
        buffer.append(String.format("Coins: %s<br/>\n",this.coins));
        buffer.append(String.format("Level Multiplier: %s<br/>\n",this.levelMultiplier));
        buffer.append(String.format("Inventory Size: %d<br/>\n",this.inventory.size()));
        buffer.append("Inventory:<br/><ul>\n");
        buffer.append(inventoryString);
        buffer.append("</ul><br/>\n");
        buffer.append(String.format("Health: %s/%s current/max<br/>\n",this.currentHealth, this.getMaximumHealth()));
        buffer.append(String.format("Stamina: %s/%s current/max<br/>\n",this.currentStamina, this.getMaximumStamina()));
        buffer.append(String.format("Magicka: %s/%s current/max<br/>\n",this.currentMagicka, this.getMaximumMagicka()));
        buffer.append(String.format("Corruption: %s/%s current/max<br/>\n",this.currentCorruption, this.getMaximumCorruption()));
        buffer.append("<br/>\n");
        buffer.append("<b>Body Parts</b><br/>\n");
        if(horns != null) {
            buffer.append(String.format("Horns: %s<br/>\n",this.getSafeDescription(this.horns)));
        }
        if(antenna != null) {
            buffer.append(String.format("Antenna: %s<br/>\n",this.getSafeDescription(this.antenna)));
        }
        buffer.append(String.format("Hair: %s<br/>\n",this.getSafeDescription(this.hair)));
        buffer.append(String.format("Eyes: %s<br/>\n",this.getSafeDescription(this.eyes)));
        buffer.append(String.format("Face: %s<br/>\n",this.getSafeDescription(this.face)));
        buffer.append(String.format("Torso: %s<br/>\n",this.getSafeDescription(this.torso)));
        if(wings != null) {
            buffer.append(String.format("Wings: %s<br/>\n",this.getSafeDescription(this.wings)));
        }
        buffer.append(String.format("Arms: %s<br/>\n",this.getSafeDescription(this.arms)));
        buffer.append(String.format("Hands: %s<br/>\n",this.getSafeDescription(this.hands)));
        buffer.append(String.format("Legs: %s<br/>\n",this.getSafeDescription(this.legs)));
        buffer.append(String.format("Feet: %s<br/>\n",this.getSafeDescription(this.feet)));
        buffer.append("<br/>\n");
        buffer.append("<b>Sexual Body Parts</b><br/>\n");
        if(breasts.size() > 0) {
            buffer.append(String.format("Breasts Count: %d<br/>\n",this.breasts.size()));
            buffer.append("Breasts:<br/><ul>\n");
            buffer.append(breastsString);
            buffer.append("</ul>\n");
        }
        if(cocks.size() > 0) {
            buffer.append(String.format("Cock Count: %s<br/>\n",this.cocks.size()));
            buffer.append("Cocks:<br/><ul>\n");
            buffer.append(cocksString);
            buffer.append("</ul>\n");
        }
        if(balls.size() > 0) {
            buffer.append(String.format("BallsCount: %s<br/>\n",this.balls.size()));
            buffer.append("Balls:<br/><ul>\n");
            buffer.append(ballsString);
            buffer.append("</ul>\n");
        }
        if(clit != null) {
            buffer.append(String.format("Clit: %s<br/>\n",this.getSafeDescription(this.clit)));
        }
        if(cunt != null) {
            buffer.append(String.format("Cunt: %s<br/>\n",this.getSafeDescription(this.cunt)));
        }
        buffer.append(String.format("Anus: %s<br/>\n",this.getSafeDescription(this.anus)));
        return buffer.toString();
    }

    public Float getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(Float currentHealth) {
        this.currentHealth = currentHealth;
    }

    public Float getCurrentStamina() {
        return currentStamina;
    }

    public void setCurrentStamina(Float currentStamina) {
        this.currentStamina = currentStamina;
    }

    public Float getCurrentMagicka() {
        return currentMagicka;
    }

    public void setCurrentMagicka(Float currentMagicka) {
        this.currentMagicka = currentMagicka;
    }

    public Float getCurrentCorruption() {
        return currentCorruption;
    }

    public void setCurrentCorruption(Float currentCorruption) {
        this.currentCorruption = currentCorruption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Float getCharacterHeight() {
        return characterHeight;
    }

    public void setCharacterHeight(Float characterHeight) {
        this.characterHeight = characterHeight;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Map<CharacterFlags, Object> getFlags() {
        return flags;
    }

    public void setFlags(Map<CharacterFlags, Object> flags) {
        this.flags = flags;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<Modifier> modifiers) {
        this.modifiers = modifiers;
    }

    public Horns getHorns() {
        return horns;
    }

    public void setHorns(Horns horns) {
        this.horns = horns;
    }

    public Antenna getAntenna() {
        return antenna;
    }

    public void setAntenna(Antenna antenna) {
        this.antenna = antenna;
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public Torso getTorso() {
        return torso;
    }

    public void setTorso(Torso torso) {
        this.torso = torso;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }

    public Arms getArms() {
        return arms;
    }

    public void setArms(Arms arms) {
        this.arms = arms;
    }

    public Hands getHands() {
        return hands;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public Feet getFeet() {
        return feet;
    }

    public void setFeet(Feet feet) {
        this.feet = feet;
    }

    public List<Breasts> getBreasts() {
        return breasts;
    }

    public void setBreasts(List<Breasts> breasts) {
        this.breasts = breasts;
    }

    public List<Penis> getCocks() {
        return cocks;
    }

    public void setCocks(List<Penis> cocks) {
        this.cocks = cocks;
    }

    public List<Balls> getBalls() {
        return balls;
    }

    public void setBalls(List<Balls> balls) {
        this.balls = balls;
    }

    public Clitoris getClit() {
        return clit;
    }

    public void setClit(Clitoris clit) {
        this.clit = clit;
    }

    public Vagina getCunts() {
        return cunt;
    }

    public void setCunts(Vagina cunt) {
        this.cunt = cunt;
    }

    public Anus getAnus() {
        return anus;
    }

    public void setAnus(Anus anus) {
        this.anus = anus;
    }
}
