package project.nitpicar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    LinearLayout btn_email_sign_in;
    TextView btn_create_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {
        btn_email_sign_in = (LinearLayout)findViewById(R.id.btn_email_sign_in);
        btn_create_account = (TextView)findViewById(R.id.btn_create_account);
    }

    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.btn_email_sign_in:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_create_account:
                intent = new Intent(this, CreateAccountActivity.class);
                startActivity(intent);
        }
    }

}
