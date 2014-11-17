package android.com.algorithmsproject.pensao;

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

public class PensaoSolucaoActivity extends Activity implements OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pensao_solucao);

        Button btVerificacao = (Button)findViewById(R.id.btnVerificarAceitacao);
        btVerificacao.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        verificacao();
    }

    private void verificacao() {
        EditText valSexo = (EditText)findViewById(R.id.edtSexo);
        int sexo = Integer.parseInt(valSexo.getText().toString());

        EditText valIdade = (EditText)findViewById(R.id.edtIdade);
        int idade = Integer.parseInt(valIdade.getText().toString());

        //Informacao: 1 - Mulher, 2 - Homem, 3 - Criança
        if (sexo == 1 ){
            TextView aceitacao = (TextView)findViewById(R.id.txvAceitacao);
            aceitacao.setText("ACEITO");
        }else if ( sexo == 3 && idade <= 12){
            TextView aceitacao = (TextView)findViewById(R.id.txvAceitacao);
            aceitacao.setText("ACEITO");
        }else if (sexo == 3 && idade > 12){
            TextView aceitacao = (TextView)findViewById(R.id.txvAceitacao);
            aceitacao.setText("NÃO ACEITO. CRIANÇA ACIMA DE 12 ANOS");
        } else if (sexo == 2 && idade <=12){
            TextView aceitacao = (TextView)findViewById(R.id.txvAceitacao);
            aceitacao.setText("ACEITO");
        } else if (sexo == 2 && idade > 12){
            TextView aceitacao = (TextView)findViewById(R.id.txvAceitacao);
            aceitacao.setText("NÃO ACEITO");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pensao_solucao, menu);
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
