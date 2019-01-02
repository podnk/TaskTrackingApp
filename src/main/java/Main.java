import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Main extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        // установка надписи
        Text text = new Text("Text test" +
                "\n" +
                "test text" +
                "\n" +
                "тест текста" +
                "\n" +
                "1234567890" +
                "\n" +
                "TEXT TEST_!@#$%^&((&");
        text.setLayoutY(80);    // установка положения надписи по оси Y
        text.setLayoutX(100);   // установка положения надписи по оси X

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Task Tracker");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();
    }

    @Override
    public void stop() throws Exception
    {
        System.out.println("Application stops");
        super.stop();
    }

}