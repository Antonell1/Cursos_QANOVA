module com.example.cursos_qanova {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cursos_qanova to javafx.fxml;
    exports com.example.cursos_qanova;
}