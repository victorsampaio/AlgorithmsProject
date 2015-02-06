package android.com.algorithmsproject.triangle;

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

public class TriangleActivity extends Activity implements OnClickListener{

    Button calc;
    TextView resultArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        calc = (Button)findViewById(R.id.btnCalcArea);
        calc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText edtBase = (EditText)findViewById(R.id.edtBase);
        double base = Double.parseDouble(edtBase.getText().toString());

        EditText edtAltura = (EditText)findViewById(R.id.edtAltura);
        double altura = Double.parseDouble(edtAltura.getText().toString());

        double resultado = (base * altura)/2;

        resultArea =(TextView)findViewById(R.id.txvArea);
        resultArea.setText("Area: " + resultado);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.triangle, menu);
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
