package kaa.avfallskontroll;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.SeekBar;
import android.support.v4.app.FragmentActivity;

/**
 * Main Activity class that holds fragments that represents the main menu
 * and different choices for deviations. Also includes a seekbar that is able
 * to
 * change screen brightness.
 *
 * @author Joakim Zakrisson
 * @version 2017-07-26
 */
public class MainActivity extends AppCompatActivity {

    int brightness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screenBrigtness();
        setMenu();
        setGraph();
    }

    public void setMenu() {
        Fragment fragment = new MenuFragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void setGraph() {
        try {
            WebView web = (WebView) findViewById(R.id.webView_container);
            WebSettings webSettings = web.getSettings();
            webSettings.setJavaScriptEnabled(true);
            web.loadUrl("http://www.stackoverflow.com");
        }
        catch(Exception e) {
            Log.e("msg", Log.getStackTraceString(e.getCause().getCause()));
        }
    }

    public void startCurrentDeviation(View v) {
        Button btn = (Button) findViewById(R.id.dev_current);
        btn.setEnabled(false);
    }

    public void startPreviousDeviation(View v) {
        Button btn = (Button) findViewById(R.id.dev_previous);
        btn.setEnabled(false);
    }

    public void startAllDeviation(View v) {
        Button btn = (Button) findViewById(R.id.dev_all);
        btn.setEnabled(false);
    }

    public void screenBrigtness() {

        SeekBar seekBarBrightness = (SeekBar) findViewById(R.id.main_seekbar);

        try {
            brightness = android.provider.Settings.System.getInt(
                    getContentResolver(),
                    android.provider.Settings.System.SCREEN_BRIGHTNESS);
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }
        seekBarBrightness.setProgress(brightness);
        seekBarBrightness.setOnSeekBarChangeListener(new SeekBar
                .OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue,
                                          boolean b) {
                if (Settings.System.canWrite(getApplicationContext())) {
                    android.provider.Settings.System.putInt(getContentResolver(),
                            android.provider.Settings.System.SCREEN_BRIGHTNESS,
                            progressValue);
                } else {
                    Intent intent = new Intent(android.provider.Settings
                            .ACTION_MANAGE_WRITE_SETTINGS)
                            .setData(Uri.parse("package:" +
                                    getApplicationContext().getPackageName()))
                            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    } //Checks for permission, asks for permission. Execute actions


}
