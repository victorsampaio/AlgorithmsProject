package android.com.algorithmsproject;

import android.app.Activity;
import android.app.ListActivity;
import android.com.algorithmsproject.inss.InssProject;
import android.com.algorithmsproject.inteiro.NumeroInteiro;
import android.com.algorithmsproject.pensao.PensaoActivity;
import android.com.algorithmsproject.personalinfos.PersonalInfosActivity;
import android.com.algorithmsproject.readNumber.ReadNumberActivity;
import android.com.algorithmsproject.temperature.TemperatureActivity;
import android.com.algorithmsproject.triangle.TriangleActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class AlgorithmProjectMainActivity extends ListActivity {

    private static final String[] options = new String[]{"1 - INSS", "2 - PENSAO", "3 - Numero Inteiro",
            "4 - Media", "5 - Temperatura", "6 - Info Pessoal", "7 - Triangulo", "8 - ", "9 - ",
            "10 - ", "Exit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_algorithm_project_main);

       setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);

        switch (position){
            case 0:
                  startActivity(new Intent(this, InssProject.class));
                break;
            case 1:
                    startActivity(new Intent(this, PensaoActivity.class));
                break;
            case 2:
                    startActivity(new Intent(this, NumeroInteiro.class));
                break;
            case 3:
                    startActivity(new Intent(this, ReadNumberActivity.class));
                break;
            case 4:
                startActivity(new Intent(this, TemperatureActivity.class));
                break;
            case 5:
                startActivity(new Intent(this, PersonalInfosActivity.class));
                break;
            case 6:
                startActivity(new Intent(this, TriangleActivity.class));
                break;
            case 7:

                break;
            case 8:
                //startActivity(new Intent(this, TriangleActivity.class));
                break;
            case 9:

                break;
            case 10:
                startActivity(new Intent(this, TriangleActivity.class));
                break;
            case 11:
                finish();
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.algorithm_project_main, menu);
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
