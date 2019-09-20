package blog.biswas.video.classten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Shape shape = new Shape();

        Rectangle rectangle = new Rectangle();

        Circle circle = new Circle();
    }
}
