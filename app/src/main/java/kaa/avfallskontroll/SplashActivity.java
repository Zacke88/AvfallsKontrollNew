package kaa.avfallskontroll;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Activity class for the splash screen which is shown for a set duration
 * during startup. When duration ends this activity finishes and loads the
 * main activity.
 *
 * @author Joakim Zakrisson
 * @version 2017-07-26
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Animates the image logo and text views.
        Animation animMove = AnimationUtils.loadAnimation(this, R.anim
                .move_up);
        Animation animFade = AnimationUtils.loadAnimation(this, R.anim
                .fade_in);

        ImageView splashLogo = (ImageView) findViewById(R.id.splash_logo);
        TextView splashText = (TextView) findViewById(R.id.splash_text);
        splashLogo.setAnimation(animMove);
        splashText.setAnimation(animFade);

        // Handler which calls the main activity after a set duration.
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity
                        .class));
                finish();
            }
        }, 5000);
    }
}
