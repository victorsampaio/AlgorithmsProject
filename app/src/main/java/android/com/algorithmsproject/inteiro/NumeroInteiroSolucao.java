package android.com.algorithmsproject.inteiro;

import android.app.Activity;
import android.content.Intent;
import android.media.ExifInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.com.algorithmsproject.R;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumeroInteiroSolucao extends Activity implements View.OnClickListener{

    Button btInteiro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_inteiro_solucao);

        btInteiro = (Button)findViewById(R.id.btnInteiro);
        btInteiro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        verificacao();
    }

    private void verificacao() {
        EditText numeroUm =(EditText)findViewById(R.id.edtNumero1);
        int numberOne = Integer.parseInt(numeroUm.getText().toString());
        EditText numeroDois =(EditText)findViewById(R.id.edtNumero2);
        int numberTwo = Integer.parseInt(numeroDois.getText().toString());
        EditText numeroTres =(EditText)findViewById(R.id.edtNumero3);
        int numberThree = Integer.parseInt(numeroTres.getText().toString());

        if (numberOne < numberTwo && numberOne < numberThree){
            TextView mostraInteiro = (TextView)findViewById(R.id.txvNumInteiro);
            mostraInteiro.setText("Os maiores são " + numberTwo + " e " + numberThree);
        } else if (numberTwo < numberOne && numberTwo < numberThree){
            TextView mostraInteiro = (TextView)findViewById(R.id.txvNumInteiro);
            mostraInteiro.setText("Os maiores são " + numberOne + " e " + numberThree);
        }else if (numberThree < numberOne && numberThree < numberTwo){
            TextView mostraInteiro = (TextView)findViewById(R.id.txvNumInteiro);
            mostraInteiro.setText("Os maiores são " + numberOne + " e " + numberTwo);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.numero_inteiro_solucao, menu);
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
