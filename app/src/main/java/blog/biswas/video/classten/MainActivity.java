package blog.biswas.video.classten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Shape shape = new Shape();

        Shape rectangle = new Rectangle();

        rectangle.draw();

        ((Rectangle) rectangle).getName();


        Circle circle = new Circle();
    }
}
