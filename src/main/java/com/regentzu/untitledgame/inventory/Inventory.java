package com.regentzu.untitledgame.inventory;

/**
 * Created on 12/16/13.
 */
public class Inventory {
    protected InventoryItem[] inventory = new InventoryItem[6];

    public int size() {
        return this.inventory.length;
    }

    public void setSize(int newSize) {
        InventoryItem[] temp = new InventoryItem[newSize];
        if(newSize > this.inventory.length) {
            System.arraycopy(this.inventory,0,temp,0,inventory.length);
        } else {
            System.arraycopy(this.inventory,0,temp,0,newSize);
        }
        this.inventory = temp;
    }

    private int findEmptySpace() throws InventoryNoRoomException {
        int index = 0;
        while(index < inventory.length) {
            if(inventory[index] == null) {
                return index;
            }
        }
        throw new InventoryNoRoomException();
    }

    public InventoryItem set(InventoryItem item) throws InventoryNoRoomException {
        int loc = findEmptySpace();
        try {
            return set(item, loc);
        } catch (InventoryOutOfBoundsException ioobe) {
            ioobe.printStackTrace();
        }
        return null;
    }

    public InventoryItem set(InventoryItem item, int position) throws InventoryOutOfBoundsException {
        if(position > this.inventory.length) { throw new InventoryOutOfBoundsException(); }
        this.inventory[position] = item;
        return item;
    }

    public InventoryItem get(int position) throws InventoryOutOfBoundsException {
        if(position > this.inventory.length) { throw new InventoryOutOfBoundsException(); }
        return this.inventory[position];
    }
}
