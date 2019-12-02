package co.g2lab.bundledata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.g2lab.bundledata.R;

public class MainActivity extends AppCompatActivity {

    private EditText namaEditText,alamatEditText,photoUrlEditText;
    private TextView submitTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        onClickGroup();
    }
    void findViewById(){
        namaEditText = (EditText) findViewById(R.id.namaEditText);
        alamatEditText = (EditText) findViewById(R.id.alamatEditText);
        photoUrlEditText = (EditText) findViewById(R.id.photoEditText);
        submitTextView = (TextView) findViewById(R.id.submitTextView);
    }
    void onClickGroup(){
        submitTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PreviewActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nama", namaEditText.getText().toString());
                bundle.putString("alamat", alamatEditText.getText().toString());
                bundle.putString("photoUrl", photoUrlEditText.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        });
    }
}
