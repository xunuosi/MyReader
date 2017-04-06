package xunuosi.github.io.myreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.geometerplus.android.fbreader.FBReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBook(View view) {
        Intent intent = new Intent(MainActivity.this, FBReader.class);
        startActivity(intent);
    }
}
