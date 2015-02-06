package android.com.algorithmsproject.temperature;

import android.app.Activity;
import android.com.algorithmsproject.R;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TemperatureActivity extends Activity implements OnClickListener{

    Button calcTemp;
    EditText tempCelsius, tempFarenheit;
    TextView tempC, tempF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        calcTemp = (Button)findViewById(R.id.btnCalcTemp);
        calcTemp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tempCelsius = (EditText)findViewById(R.id.edtTempCelsius);
        double tempCel = Double.parseDouble(tempCelsius.getText().toString());

        double resultFarenheit = (180 * (tempCel + 32)) /100;

        tempF = (TextView)findViewById(R.id.txvTempFarenheit);
        tempF.setText( resultFarenheit + "º");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.temperature, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
