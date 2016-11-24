package s.l;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.prefs.BackingStoreException;

import static com.sl.SmartLady_Main.*;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void saveData(View view) {
        try {
            saveByjavaPreference(TestActivity.class.getName());
        } catch (BackingStoreException e) {
            e.printStackTrace();
        }
    }

    public void getData(View view) {
        getJavaPreferenceData(TestActivity.class.getName());
    }

}
