package eugenio.nuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BasicDetoxGreenJuice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_detox_green_juice);
    }

    public void button_ready (View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}
