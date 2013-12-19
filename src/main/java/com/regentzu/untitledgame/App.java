package com.regentzu.untitledgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point for the game
 *
 */
public class App extends Application
{

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.info("Starting Untitled Game");

        //Character actor = new GenericMaleHuman();
        //System.out.println(actor);

        launch(args);

        logger.info("Untitled Game closing");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ClassLoader cl = this.getClass().getClassLoader();
        Parent root = FXMLLoader.load(cl.getResource("gui/sample.fxml"));
        primaryStage.setTitle("Untitled Game");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}
