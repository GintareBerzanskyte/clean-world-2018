package com.example.gintare.cleanworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String[] DATA = new String[] {
            "Vandens buteliukas","Vandens butelys","Stiklainis","Gerimo buteliukas","Stiklinis butelis Borjomi","Stiklinis butelis Vichhy","Žalio stiklo butelis","Heineken butelis","Tuborg butelis","Stiklinis giros butelis 'Duonos Gira'","Stiklinis giros butelis'Smetoni�ka Gira'",
            "Pakavimo deže","Pusryciu dribsniu dežute 'Cookie Crisp'","Sveikinimu atvirute","Siuntiniu deže","Sausainiu dežute","šaldyto maisto dežute","Arbatos dežute","Laikraštis","Pusryciu dribsniu dežute 'Fitness'","Vokas","Rašomasis popierius",
            "Mineralinio vandens buteliukas 'Vytautas'","Mineralinio vandens buteliukas 'Akvile'","Mineralinio vandens buteliukas 'Rasa'","Šalta arbata 'NESTEA'","Mineralinio vandens buteliukas 'Neptunas'","Butelio kamštelis","Nespalvotas sulciu butelis 'Tymbark'","Ledai plastikiniame indelyje 'Aurum'","Plastikinis maišelis","Išsinešimui skirtu gerimu puodeliai","Puodelis kudikiams","Buteliukas kudikiams","Tepamo surio pakuote","Kiaušiniu deklai","Išsinešamo maisto dežute","Vienkartiniai karštu gerimu puodeliai",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView searchAutoComplete = (AutoCompleteTextView) findViewById(R.id.editText2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.custom_list_item,
                R.id.text_view_list_item, DATA);
        searchAutoComplete.setAdapter(adapter);

        searchAutoComplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+parent.getItemAtPosition((position)), Toast.LENGTH_SHORT).show();

                // start new activity with params
//                Intent myIntent = new Intent(MainActivity.this, MainActivity.class);
//                myIntent.putExtra("firstKeyName","FirstKeyValue");
//                myIntent.putExtra("secondKeyName","SecondKeyValue");
//                startActivity(myIntent);

                // get data
//                Intent myIntent = getIntent(); // gets the previously created intent
//                String firstKeyName = myIntent.getStringExtra("firstKeyName"); // will return "FirstKeyValue"
//                String secondKeyName= myIntent.getStringExtra("secondKeyName");
            }
        });

    }

    public void map(View view) {
        Intent info = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(info);
    }
    public void diy(View view) {
        Intent diy = new Intent(MainActivity.this, DIYActivity.class);
        startActivity(diy);
    }
    public void info(View view) {
        Intent my_trash = new Intent(MainActivity.this, info.class);
        startActivity(my_trash);
    }
    public void mytrash(View view) {
        Intent my_trash = new Intent(MainActivity.this, MyTrashActivity.class);
        startActivity(my_trash);
    }
    public void search(View view) {
        Intent my_trash = new Intent(MainActivity.this, TrashActivity.class);
        startActivity(my_trash);
    }
}
