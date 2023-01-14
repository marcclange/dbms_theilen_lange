module com.example.dbms_uni_theilen_lange {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dbms_uni_theilen_lange to javafx.fxml;
    exports com.example.dbms_uni_theilen_lange;
}