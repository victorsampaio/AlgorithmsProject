package android.com.algorithmsproject.inss;

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
import android.widget.Toast;

public class InssSolucaoActivity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inss_solucao);

        Button calcular = (Button)findViewById(R.id.btnCalc);
        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        operation();
    }

    private void operation() {
        EditText salario = (EditText)findViewById(R.id.salario);
        float valorSalario = Integer.parseInt(salario.getText().toString());

        if (valorSalario <= 800){
            // Salario Bruto
            TextView infoSalarioBruto = (TextView)findViewById(R.id.edtSalarioBruto);
            infoSalarioBruto.setText("Salario Bruto: " + valorSalario);

            // Desnconto INSS
            TextView classificDesc = (TextView)findViewById(R.id.edtClassificaDesc);
            classificDesc.setText("Classificação do Desconto: ISENTO");

            // Valor Sal. Liq.
            TextView infoSalarioLiq = (TextView)findViewById(R.id.edtSalarioLiq);
            infoSalarioLiq.setText("Salario Liquido: " + valorSalario);
        }
       else  if (valorSalario > 800 && valorSalario <= 1200) {

          


            // Salario Bruto
            TextView infoSalarioBruto = (TextView) findViewById(R.id.edtSalarioBruto);
            infoSalarioBruto.setText("Salario Bruto: " + valorSalario);

            // Desnconto INSS
            TextView classificDesc = (TextView)findViewById(R.id.edtClassificaDesc);
            classificDesc.setText("Classificação do Desconto: ISENTO");

            // Valor Sal. Liq.
            TextView infoSalarioLiq = (TextView)findViewById(R.id.edtSalarioLiq);
            infoSalarioLiq.setText("Salario Liquido: " + valorSalario);


        } else  if (valorSalario > 1200 && valorSalario <= 2000){

        } else if (valorSalario <2000){

        }else {
            Toast.makeText(this, "Verifique o valor", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.inss_solucao, menu);
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
