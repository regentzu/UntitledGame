package com.regentzu.untitledgame.inventory;

import com.regentzu.untitledgame.modifier.Modifier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 12/16/13.
 */
public abstract class InventoryItem {
    protected String name;

    protected List<Modifier> modifiers = new ArrayList<Modifier>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<Modifier> modifiers) {
        this.modifiers = modifiers;
    }
}
