package com.mycompany.classlabfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {
    @FXML
    private Label LabelMessage;
    
    @FXML
    private void handleShowMessage(){
        System.out.println("Hello");
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void handleShowMessageButton(){
        LabelMessage.setText("Hello World!");
        System.out.println("Show Message button was press!!");
   
    }
}
