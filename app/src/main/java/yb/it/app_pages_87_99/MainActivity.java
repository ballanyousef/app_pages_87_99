package yb.it.app_pages_87_99;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar bar1;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //option1
        //bar1=(RatingBar) findViewById(R.id.ratingBar1);

        //option2
        bar1=(RatingBar) findViewById(R.id.ratingBar1);
        //EDP - event programming
        bar1.setOnRatingBarChangeListener(bar1Listener);//event object reactor

     txtResult=findViewById(R.id.textView1);
    }
    private RatingBar.OnRatingBarChangeListener bar1Listener=new RatingBar.OnRatingBarChangeListener() {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
          //event handler
            //use the rating value

            //option 1 to get the rating bar value

            txtResult.setText(v+"");
            //option 2 to ger the rating bar value
            float val=bar1.getRating();
            txtResult.setText(val+"");

        }
    };

    public void btnClick(View view) {
        float val=bar1.getRating();
        txtResult.setText(val+"");
    }

    public void btnDisplayAlert(View view) {
        Toast.makeText(this, "Start event", Toast.LENGTH_SHORT).show();

        AlertDialog.Builder adb=new AlertDialog.Builder(this);
        adb.setTitle("This yout title");
        adb.setIcon(R.drawable.ic_launcher_background);
        adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        adb.setNegativeButton("no",
                //start code
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }

                //end code

        );


        adb.show();





        Toast.makeText(this, "End of event event", Toast.LENGTH_SHORT).show();
    }
}
