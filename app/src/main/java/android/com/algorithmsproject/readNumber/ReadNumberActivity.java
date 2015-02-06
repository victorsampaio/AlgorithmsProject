package android.com.algorithmsproject.readNumber;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.com.algorithmsproject.R;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReadNumberActivity extends Activity implements OnClickListener {

    TextView resultTxw;
    Button calc;
    EditText fNumber, sNumber, tNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_number);

        calc = (Button)findViewById(R.id.btnCalc);
        calc.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        // First Number
        fNumber = (EditText)findViewById(R.id.firstNumber);
        // parse - conversao
        double firstNumber = Double.parseDouble(fNumber.getText().toString());
        // Second Number
        sNumber = (EditText)findViewById(R.id.secondNumber);
        // parse - conversao
        double  secondNumber = Double.parseDouble(sNumber.getText().toString());
        // Third Number
        tNumber = (EditText)findViewById(R.id.thirdNumber);
        // parse - conversao
        double thirdNumber = Double.parseDouble(tNumber.getText().toString());

        double resultCalc = (firstNumber + secondNumber + thirdNumber)/3;

        resultTxw = (TextView)findViewById(R.id.txwResult);
        resultTxw.setText("Media: " + resultCalc);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.read_number, menu);
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
