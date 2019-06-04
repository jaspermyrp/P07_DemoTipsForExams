package sg.edu.rp.c346.demotipsforexams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Global Variables //
    ListView lvExamTips;
    String[] examTipsArray = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind UI Components //
        lvExamTips = findViewById(R.id.listViewExamTips);

        // examTipsArray data //
        examTipsArray[0] = "Prepare way before the exam";
        examTipsArray[1] = "Practice coding";
        examTipsArray[2] = "Seek help from lecturer";
        examTipsArray[3] = "Prepare template code";
        examTipsArray[4] = "Create empty projects for MSA";


        // ListView adapter //
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, examTipsArray);

        lvExamTips.setAdapter(adapter);

    }
}
