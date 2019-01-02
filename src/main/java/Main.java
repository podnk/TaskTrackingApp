import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.apache.log4j.Logger;


public class Main extends Application
{
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        // установка надписи
        Text testText = new Text("Text test" +
                "\n" +
                "test testText" +
                "\n" +
                "тест текста" +
                "\n" +
                "1234567890" +
                "\n" +
                "TEXT TEST_!@#$%^&((&");

        testText.setLayoutY(80);    // установка положения надписи по оси Y
        testText.setLayoutX(100);   // установка положения надписи по оси X
        testText.setFont(Font.font("Colibri", 16));

        Group group = new Group(testText);

        Scene scene = new Scene(group);

        init(stage, scene);
    }

    @Override
    public void stop() throws Exception
    {
        log.info("application stopped");
        super.stop();
    }

    private void init(Stage stage, Scene scene)
    {
        stage.setScene(scene);
        stage.setTitle("Task Tracker");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
}