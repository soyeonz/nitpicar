package project.nitpicar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//sign up Nitpicar
public class CreateAccountActivity extends AppCompatActivity {

    private EditText etEmail, etPassword, etName, etAge, etGroup, etArea, etVehiNum, etVehiType;
    private Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        etEmail = (EditText) findViewById(R.id.edit_email_crAccount);
        etPassword = (EditText) findViewById(R.id.edit_password_crAccount);
        etName = (EditText) findViewById(R.id.edit_name);
        etAge = (EditText) findViewById(R.id.edit_age);
        etGroup = (EditText) findViewById(R.id.edit_group);
        etArea = (EditText) findViewById(R.id.edit_area);
        etVehiNum = (EditText) findViewById(R.id.edit_vehicle_num);
        etVehiType = (EditText) findViewById(R.id.edit_vehicle_type);
        btnDone = (Button) findViewById(R.id.btn_regisToNit);

        etEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String email = etEmail.getText().toString();
                if (email.isEmpty()) {
                    etEmail.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                if (isValidEmail(email)) {
                    etEmail.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_tick, 0);
                } else {
                    etEmail.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String password = etPassword.getText().toString();
                if (password.isEmpty()) {
                    etPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                else {
                    etPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_tick, 0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String name = etName.getText().toString();
                if (name.isEmpty()) {
                    etName.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                else {
                    etName.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_tick, 0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etAge.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String age = etAge.getText().toString();
                if (age.isEmpty()) {
                    etAge.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                else {
                    etAge.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_tick, 0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etGroup.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String group = etGroup.getText().toString();
                if (group.isEmpty()) {
                    etGroup.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                else {
                    etGroup.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_tick, 0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etArea.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String area = etArea.getText().toString();
                if (area.isEmpty()) {
                    etArea.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                else {
                    etArea.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_tick, 0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etVehiNum.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String vehiNum = etVehiNum.getText().toString();
                if (vehiNum.isEmpty()) {
                    etVehiNum.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                else {
                    etVehiNum.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_tick, 0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etVehiType.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String vehiType = etVehiType.getText().toString();
                if (vehiType.isEmpty()) {
                    etVehiType.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                else {
                    etVehiType.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_tick, 0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });




        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etEmail.getText().toString().isEmpty() || !isValidEmail(etEmail.getText().toString())) {
                    Toast.makeText(CreateAccountActivity.this, R.string.email_missing, Toast.LENGTH_SHORT).show();
                    etEmail.requestFocus();
                    return;
                }

                String pass = etPassword.getText().toString();
                if (pass.isEmpty()) {
                    Toast.makeText(CreateAccountActivity.this, R.string.password_missing, Toast.LENGTH_SHORT).show();
                    etPassword.requestFocus();
                    return;
                }
                if (etName.getText().toString().isEmpty()) {
                    Toast.makeText(CreateAccountActivity.this, R.string.name_missing, Toast.LENGTH_SHORT).show();
                    etName.requestFocus();
                    return;
                }
                if (etAge.getText().toString().isEmpty()) {
                    Toast.makeText(CreateAccountActivity.this, R.string.age_missing, Toast.LENGTH_SHORT).show();
                    etAge.requestFocus();
                    return;
                }
                if (etArea.getText().toString().isEmpty()) {
                    Toast.makeText(CreateAccountActivity.this, R.string.area_missing, Toast.LENGTH_SHORT).show();
                    etArea.requestFocus();
                    return;
                }
                if (etGroup.getText().toString().isEmpty()) {
                    Toast.makeText(CreateAccountActivity.this, R.string.group_missing, Toast.LENGTH_SHORT).show();
                    etGroup.requestFocus();
                    return;
                }
                if (etVehiNum.getText().toString().isEmpty()) {
                    Toast.makeText(CreateAccountActivity.this, R.string.vehicle_num_missing, Toast.LENGTH_SHORT).show();
                    etVehiNum.requestFocus();
                    return;
                }
                if (etVehiType.getText().toString().isEmpty()) {
                    Toast.makeText(CreateAccountActivity.this, R.string.vehicle_type_missing, Toast.LENGTH_SHORT).show();
                    etVehiType.requestFocus();
                    return;
                }
                Intent intent = new Intent(v.getContext(),LoginActivity.class);
                startActivity(intent);

            }
        });
    }



    public boolean isValidEmail(String target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, LoginActivity.class));
        this.finish();
    }
}
