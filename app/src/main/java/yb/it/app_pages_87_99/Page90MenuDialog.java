package yb.it.app_pages_87_99;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;

public class Page90MenuDialog extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page90_menu_dialog);
    }

    public void btnDisplayMenu(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this); builder.setTitle("Title");
        builder.setTitle("Choose one or more");
        builder.setIcon(R.drawable.ic_launcher_background);
        final String[] items = { "first item", "second", "thered item", "last item" };

        ArrayAdapter aryListAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, items);

        //builder.setAdapter(aryListAdapter,null);
        builder.setAdapter(aryListAdapter,

                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Page90MenuDialog.this, "i="+i, Toast.LENGTH_SHORT).show();
                        Toast.makeText(Page90MenuDialog.this, "i="+items[i], Toast.LENGTH_SHORT).show();


                    }
                }

        );




        //AlertDialog dialog = builder.create();
        //dialog.getListView().setBackgroundColor(Color.GRAY);
        builder.create().show();


    }





    public void btnDisplayMenu_simple(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this); builder.setTitle("Title");
        builder.setTitle("Title");
        builder.setIcon(R.drawable.ic_launcher_background);

        builder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Page90MenuDialog.this, "your message -ok", Toast.LENGTH_SHORT).show();
                    }
                }

        );




        builder.create().show();


    }
}