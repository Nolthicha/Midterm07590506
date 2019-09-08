package th.ac.su.sc.midterm07590506;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText usernameEditText = findViewById(R.id.username_edit_text);
                EditText passwordEditText = findViewById(R.id.password_edit_text);


                String inputUsername = usernameEditText.getText().toString();
                String inputPassword = passwordEditText.getText().toString();

                String loginSuccessText = getString(R.string.login_success);
                String loginFailText = getString(R.string.login_fail);

                //Auth auth = new Auth(inputUsername,inputPassword);
                //boolean result = auth.check();


                if(inputUsername.equals("aaa") && inputPassword.equals("111")){
                    Toast.makeText(MainActivity.this, "Welcome Nolthicha Ngaongam" , Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this , profileN.class);

                    intent.putExtra(inputUsername, inputPassword);
                    startActivity(intent);
                }else if(inputUsername.equals("bbb") && inputPassword.equals("222")){
                    Toast.makeText(MainActivity.this, "Welcome Promlert Lovichit" , Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this , profile.class);

                    intent.putExtra(inputUsername, inputPassword);
                    startActivity(intent);

                }else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_fail);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {


                        }

                    });
                    dialog.show();
                }





            }
        });



    }
}
