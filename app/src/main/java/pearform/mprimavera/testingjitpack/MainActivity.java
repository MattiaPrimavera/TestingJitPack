package pearform.mprimavera.testingjitpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pearform.mprimavera.testlibrary.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.log();
    }
}
