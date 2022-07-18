package myFirstApplication;

import javafx.aplication.Application;
import javafx.stage.Stage;


public class MyFirstApplication extends Application {
    

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }
    
    @Override
    public void start(Stage window){
        window.setTitle("Hello World!");
        window.show();
    }

}
