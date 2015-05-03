package cdflynn.android;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import cdflynn.android.library.crossview.CrossView;


public class SampleActivity extends ActionBarActivity {

    private CrossView mCrossView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        mCrossView = (CrossView) findViewById(R.id.sample_cross_view);
        mCrossView.setOnClickListener(mCrossViewClickListener);
        mCrossView.setColor(getResources().getColor(R.color.cross_view_stroke_color));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sample, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private final View.OnClickListener mCrossViewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mCrossView.toggle();
        }
    };
}
