package silive.in.transition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView imageview,cloud1,cloud2;
    RelativeLayout r1,r2;
    Button b1,b2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ImageView animImageView = (ImageView) findViewById(R.id.water);
        cloud1 = (ImageView) findViewById(R.id.imageViewcloud1);
        cloud2 = (ImageView) findViewById(R.id.imageViewcloud2);
        b1 = (Button) findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button){
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.cloud1);
            Animation animationb= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.cloud2);
            cloud1.startAnimation(animation);
            cloud2.startAnimation(animationb);

        }
        if (view.getId()==R.id.button2)
        {Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.boatanim);
            Animation animationb= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            cloud1.startAnimation(animation);
            cloud2.startAnimation(animationb);
        }
    }
}
