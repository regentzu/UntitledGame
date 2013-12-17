package com.regentzu.untitledgame.bodypart;

import java.util.*;

/**
 * Created by Regent Zu on 12/16/13.
 */
public abstract class BodyPart {

    protected List<String> shortDescriptions = new ArrayList<String>();
    protected String description = "";
    protected Map<BodyPartProperties, Object> properties = new HashMap<BodyPartProperties, Object>();

    public BodyPart() {
        partSetup();
        init();
    }

    protected abstract void partSetup();

    protected abstract void init();

    public boolean has(BodyPartProperties key) {
        return this.properties.containsKey(key);
    }

    public Object get(BodyPartProperties key) {
        return this.properties.get(key);
    }

    public void set(BodyPartProperties key, Object value) {
        this.properties.put(key, value);
    }

    public String getDescription() {
        return this.description;
    }

    public String getShortDescription() {
        return this.shortDescriptions.get(0);
    }

    public String getRandomShortDescription() {
        Random rand = new Random();
        return shortDescriptions.get(rand.nextInt(this.shortDescriptions.size()));
    }

    public String toString() {
        return this.getDescription();
    }

}
