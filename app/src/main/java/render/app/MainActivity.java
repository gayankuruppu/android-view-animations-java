package render.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import render.animations.Attention;
import render.animations.Render;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Render render;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview = findViewById(R.id.textview1);

        render = new Render(this);
        render.setDuration(2000);
        render.setAnimation(Attention.Wobble(textview));

        textview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.start();
            }
        });



    }
}