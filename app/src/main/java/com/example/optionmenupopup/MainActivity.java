
package com.example.optionmenupopup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Krijo nje dialogBuilder te fillimi kodit
    private AlertDialog.Builder dialogBuilder;
    //Krijo nje alert dialog
    private  AlertDialog dialog;
    //Vendos nje edit text sipas vlerave qe ke
    private Spinner newcontactpopup_spinner;
    private TextView newcontactpopup_textview;
    //Vendos nje button cancel dhe save
    private Button newcontactpopup_cancel, newcontactpop_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Ketu eshte onCreate i menus
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        /*int id = item.getItemId();
        if(id == R.id.sub){
            Intent intent = new Intent(MainActivity.this, menu1.class);
            startActivity(intent);
            finish();
            return true;
        }
         */
        createNewContactDialog();
        return super.onOptionsItemSelected(item);
    }

    public void createNewContactDialog(){
        dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView = getLayoutInflater().inflate(R.layout.activity_menu1, null);
        newcontactpopup_spinner = (Spinner) contactPopupView.findViewById(R.id.firstname);
        newcontactpop_save = (Button) contactPopupView.findViewById(R.id.saveButton);
        newcontactpopup_cancel = (Button) contactPopupView.findViewById(R.id.cancelButton);
        dialogBuilder.setView(contactPopupView);
        dialog = dialogBuilder.create();
        dialog.show();

        newcontactpop_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Funskion sql
            }
        });

        newcontactpopup_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cancel button
                dialog.dismiss();
            }
        });
    }


}