package yuni.tugasdua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class tampil extends AppCompatActivity {

    TextView Nama;
    TextView Alamat;
    TextView Npm;
    TextView prody;
    TextView fak;
    TextView nope;
    Button btnback;
    Button keluar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);


        Nama = (TextView) findViewById(R.id.dataNama);
        Npm = (TextView) findViewById(R.id.dataNpm);
        fak = (TextView) findViewById(R.id.dataFak);
        prody = (TextView) findViewById(R.id.dataProdi);
        Alamat = (TextView) findViewById(R.id.dataAlamat);
        nope = (TextView) findViewById(R.id.dataHp);


        String strNama = getIntent().getStringExtra(MainActivity.KEY_Nama);
        String strNpm = getIntent().getStringExtra(MainActivity.KEY_Npm);
        String strfak = getIntent().getStringExtra(MainActivity.KEY_fak);
        String strprody = getIntent().getStringExtra(MainActivity.KEY_prody);
        String strAlamat = getIntent().getStringExtra(MainActivity.KEY_Alamat);
        String strnope = getIntent().getStringExtra(MainActivity.KEY_Nope);

        Nama.setText(strNama);
        Npm.setText(strNpm);
        fak.setText(strfak);
        prody.setText(strprody);
        Alamat.setText(strAlamat);
        nope.setText(strnope);

        btnback = (Button) findViewById(R.id.kembali);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent (tampil.this,MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });

        keluar = (Button) findViewById(R.id.keluar);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampil.this.finish();
            }
        });

    }
}