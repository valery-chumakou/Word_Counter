package org.example.word_counter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Counter {
@FXML
private void getCounter() throws Exception {
    Counter_Controller.setRoot("word_counter");
}
    @FXML
    private Button btn;
    @FXML
    private TextArea txt;
    @FXML
    private Label result;

    @FXML
    public void calculate (ActionEvent e) {
        String text = txt.getText();
        if (e.getSource() == btn) {
            String [] words = text.split("\\s");
            result.setText(String.valueOf(words.length));
        }
    }
}
