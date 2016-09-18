package bombey77.sa18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    SeekBar sbWeight;
    Button btn1, btn2;

    LinearLayout.LayoutParams lp1;
    LinearLayout.LayoutParams lp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbWeight = (SeekBar)findViewById(R.id.seekBar);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);

        lp1 = (LinearLayout.LayoutParams)btn1.getLayoutParams();
        lp2 = (LinearLayout.LayoutParams)btn2.getLayoutParams();

        sbWeight.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int lefrValues = progress;
        int rightValues = seekBar.getMax() - progress;

        lp1.weight = lefrValues;
        lp2.weight = rightValues;

        btn1.setText(String.valueOf(lefrValues));
        btn2.setText(String.valueOf(rightValues));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
