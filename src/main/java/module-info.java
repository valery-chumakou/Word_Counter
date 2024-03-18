module org.example.word_counter {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.word_counter to javafx.fxml;
    exports org.example.word_counter;
}