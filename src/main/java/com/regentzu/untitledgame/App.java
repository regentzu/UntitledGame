package com.regentzu.untitledgame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.regentzu.untitledgame.character.Character;
import com.regentzu.untitledgame.character.generic.GenericMaleHuman;

/**
 * Entry point for the game
 *
 */
public class App 
{

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.info("Starting Untitled Game");

        Character actor = new GenericMaleHuman();
        System.out.println(actor);

        logger.info("Untitled Game closing");
    }
}
