package nz.ac.auckland.se206.controllers;

import nz.ac.auckland.se206.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.Scene;

public class CounterController {

    private int counter = 0;
    @FXML
    private Button incrementButton;
    @FXML
    private Button decrementButton;
    @FXML
    private Button resetButton;
    @FXML
    private Label numberLabel;
    @FXML
    private Button switchToMusicButton;

    @FXML
    private void increment() {
        counter++;
        numberLabel.setText(String.valueOf(counter));
    }

    @FXML
    private void decrement() {
        counter--;
        numberLabel.setText(String.valueOf(counter));
    }

    @FXML
    private void reset() {
        counter = 0;
        numberLabel.setText("0");
    }

    @FXML
    private void switchToMusic(ActionEvent event) {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();

        try{
            currentScene.setRoot(App.loadFXML("musicplayer"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
