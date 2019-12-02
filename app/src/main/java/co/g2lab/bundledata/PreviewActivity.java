package co.g2lab.bundledata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.g2lab.bundledata.R;

public class PreviewActivity extends AppCompatActivity {
    private EditText namaEditText,alamatEditText,photoUrlEditText;
    private TextView exitTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        findViewById();
        initData();
        onClickGroup();
    }
    void findViewById(){
        namaEditText = (EditText) findViewById(R.id.namaEditText);
        alamatEditText = (EditText) findViewById(R.id.alamatEditText);
        photoUrlEditText = (EditText) findViewById(R.id.photoEditText);
        exitTextView = (TextView) findViewById(R.id.exitTextView);
    }
    void initData(){
        Bundle bundle = getIntent().getExtras();
        namaEditText.setText(bundle.getString("nama"));
        alamatEditText.setText(bundle.getString("alamat"));
        photoUrlEditText.setText(bundle.getString("photoUrl"));

    }
    void onClickGroup(){
        exitTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
