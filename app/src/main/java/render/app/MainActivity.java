package render.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import render.animations.Attention;
import render.animations.Bounce;
import render.animations.Fade;
import render.animations.Flip;
import render.animations.Render;
import render.animations.Rotate;
import render.animations.Slide;
import render.animations.Zoom;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    Render render;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAttentionBounce = findViewById(R.id.btn_attention_bounce);
        Button buttonAttentionFlash = findViewById(R.id.btn_attention_flash);
        Button buttonAttentionPulse = findViewById(R.id.btn_attention_pulse);
        Button buttonAttentionRuberband = findViewById(R.id.btn_attention_ruberband);
        Button buttonAttentionShake = findViewById(R.id.btn_attention_shake);
        Button buttonAttentionStandup = findViewById(R.id.btn_attention_stand_up);
        Button buttonAttentionSwing = findViewById(R.id.btn_attention_swing);
        Button buttonAttentionTada = findViewById(R.id.btn_attention_tada);
        Button buttonAttentionWave = findViewById(R.id.btn_attention_wave);
        Button buttonAttentionWobble = findViewById(R.id.btn_attention_wobble);

        Button buttonBounceInLeft = findViewById(R.id.btn_bounce_inleft);
        Button buttonBounceInRight = findViewById(R.id.btn_bounce_inright);
        Button buttonBounceInUp = findViewById(R.id.button_bounce_inup);
        Button buttonBounceInDown = findViewById(R.id.btn_bounce_indown);
        Button buttonBounceIn = findViewById(R.id.btn_bounce_in);

        Button buttonFadeInUp = findViewById(R.id.btn_fade_inup);
        Button buttonFadeInDown = findViewById(R.id.btn_fade_indown);
        Button buttonFadeInRight = findViewById(R.id.btn_fade_inright);
        Button buttonFadeInLeft = findViewById(R.id.btn_fade_inleft);

        Button buttonFadeOutUp = findViewById(R.id.btn_fade_outup);
        Button buttonFadeOutDown = findViewById(R.id.btn_fade_outdown);
        Button buttonFadeOutRight = findViewById(R.id.btn_fade_outright);
        Button buttonFadeOutLeft = findViewById(R.id.btn_fade_outleft);

        Button buttonFadeIn = findViewById(R.id.btn_fade_in);
        Button buttonFadeOut = findViewById(R.id.btn_fade_out);

        Button buttonFlipInX = findViewById(R.id.btn_flip_inx);
        Button buttonFlipInY = findViewById(R.id.btn_flip_iny);
        Button buttonFlipOutX = findViewById(R.id.btn_flip_outx);
        Button buttonFlipOutY = findViewById(R.id.btn_flip_outy);

        Button buttonRotateInDownLeft = findViewById(R.id.btn_rotate_indownleft);
        Button buttonRotateInDownRight = findViewById(R.id.btn_rotate_indownright);
        Button buttonRotateInUpLeft = findViewById(R.id.btn_rotate_inupleft);
        Button buttonRotateInUpRight = findViewById(R.id.btn_rotate_inupright);
        Button buttonRotateOutDownLeft = findViewById(R.id.btn_rotate_outdownleft);
        Button buttonRotateOutDownRight = findViewById(R.id.btn_rotate_outdownright);
        Button buttonRotateOutUpLeft = findViewById(R.id.btn_rotate_outupleft);
        Button buttonRotateOutUpRight = findViewById(R.id.btn_rotate_outupright);

        Button buttonRotateIn = findViewById(R.id.btn_rotate_in);
        Button buttonRotateOut = findViewById(R.id.btn_rotate_out);

        Button buttonSlideInDown = findViewById(R.id.btn_slide_indown);
        Button buttonSlideInLeft = findViewById(R.id.btn_slide_inleft);
        Button buttonSlideInRight = findViewById(R.id.btn_slide_inright);
        Button buttonSlideInUp = findViewById(R.id.btn_slide_inup);
        Button buttonSlideOutDown = findViewById(R.id.btn_slide_outdown);
        Button buttonSlideOutLeft = findViewById(R.id.btn_slide_outleft);
        Button buttonSlideOutRight = findViewById(R.id.btn_slide_outright);
        Button buttonSlideOutUp = findViewById(R.id.btn_slide_outup);

        Button buttonZoomIn = findViewById(R.id.btn_zoom_in);
        Button buttonZoomInDown = findViewById(R.id.btn_zoom_indown);
        Button buttonZoomInLeft = findViewById(R.id.btn_zoom_inleft);
        Button buttonZoomInRight = findViewById(R.id.btn_zoom_inright);
        Button buttonZoomInUp = findViewById(R.id.btn_zoom_inup);
        Button buttonZoomOut = findViewById(R.id.btn_zoom_out);
        Button buttonZoomOutDown = findViewById(R.id.btn_zoom_outdown);
        Button buttonZoomOutLeft = findViewById(R.id.btn_zoom_outleft);
        Button buttonZoomOutRight = findViewById(R.id.btn_zoom_outright);
        Button buttonZoomOutUp = findViewById(R.id.btn_zoom_outup);

        imageView = findViewById(R.id.iv_image);

        render = new Render(this);
        render.setDuration(1000);

        buttonAttentionBounce.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Bounce(imageView));
                render.start();
            }
        });

        buttonAttentionFlash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Flash(imageView));
                render.start();
            }
        });

        buttonAttentionPulse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Pulse(imageView));
                render.start();
            }
        });

        buttonAttentionRuberband.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.RuberBand(imageView));
                render.start();
            }
        });

        buttonAttentionShake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Shake(imageView));
                render.start();
            }
        });

        buttonAttentionStandup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.StandUp(imageView));
                render.start();
            }
        });

        buttonAttentionSwing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Swing(imageView));
                render.start();
            }
        });

        buttonAttentionTada.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Tada(imageView));
                render.start();
            }
        });

        buttonAttentionWave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Wave(imageView));
                render.start();
            }
        });

        buttonAttentionWobble.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Wobble(imageView));
                render.start();
            }
        });

        buttonBounceInLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InLeft(imageView));
                render.start();
            }
        });

        buttonBounceInRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InRight(imageView));
                render.start();
            }
        });

        buttonBounceInUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InUp(imageView));
                render.start();
            }
        });

        buttonBounceInDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InDown(imageView));
                render.start();
            }
        });

        buttonBounceIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.In(imageView));
                render.start();
            }
        });

        buttonFadeInUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InUp(imageView));
                render.start();
            }
        });

        buttonFadeInDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InDown(imageView));
                render.start();
            }
        });

        buttonFadeInRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InRight(imageView));
                render.start();
            }
        });

        buttonFadeInLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InLeft(imageView));
                render.start();
            }
        });

        buttonFadeOutUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutUp(imageView));
                render.start();
            }
        });


        buttonFadeOutDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutDown(imageView));
                render.start();
            }
        });

        buttonFadeOutRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutRight(imageView));
                render.start();
            }
        });

        buttonFadeOutLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutLeft(imageView));
                render.start();
            }
        });

        buttonFadeIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.In(imageView));
                render.start();
            }
        });

        buttonFadeOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.Out(imageView));
                render.start();
            }
        });

        buttonFlipInX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.InX(imageView));
                render.start();
            }
        });

        buttonFlipInY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.InY(imageView));
                render.start();
            }
        });

        buttonFlipOutX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.OutX(imageView));
                render.start();
            }
        });

        buttonFlipOutY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.OutY(imageView));
                render.start();
            }
        });

        buttonRotateInDownLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.InDownLeft(imageView));
                render.start();
            }
        });

        buttonRotateInDownRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.InDownRight(imageView));
                render.start();
            }
        });

        buttonRotateInUpLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.InUpLeft(imageView));
                render.start();
            }
        });

        buttonRotateInUpRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.InUpRight(imageView));
                render.start();
            }
        });

        buttonRotateOutDownLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.OutDownLeft(imageView));
                render.start();
            }
        });

        buttonRotateOutDownRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.OutDownRight(imageView));
                render.start();
            }
        });

        buttonRotateOutUpLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.OutUpLeft(imageView));
                render.start();
            }
        });

        buttonRotateOutUpRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.OutUpRight(imageView));
                render.start();
            }
        });

        buttonRotateIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.In(imageView));
                render.start();
            }
        });

        buttonRotateOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.Out(imageView));
                render.start();
            }
        });

        buttonSlideInDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.InDown(imageView));
                render.start();
            }
        });

        buttonSlideInLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.InLeft(imageView));
                render.start();
            }
        });

        buttonSlideInRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.InRight(imageView));
                render.start();
            }
        });

        buttonSlideInUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.InUp(imageView));
                render.start();
            }
        });

        buttonSlideOutDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.OutDown(imageView));
                render.start();
            }
        });

        buttonSlideOutLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.OutLeft(imageView));
                render.start();
            }
        });

        buttonSlideOutRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.OutRight(imageView));
                render.start();
            }
        });

        buttonSlideOutUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.OutUp(imageView));
                render.start();
            }
        });

        buttonZoomIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.In(imageView));
                render.start();
            }
        });

        buttonZoomInDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.InDown(imageView));
                render.start();
            }
        });


        buttonZoomInLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.InLeft(imageView));
                render.start();
            }
        });

        buttonZoomInRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.InRight(imageView));
                render.start();
            }
        });

        buttonZoomInUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.InUp(imageView));
                render.start();
            }
        });

        buttonZoomOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.Out(imageView));
                render.start();
            }
        });

        buttonZoomOutDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.OutDown(imageView));
                render.start();
            }
        });

        buttonZoomOutLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.OutLeft(imageView));
                render.start();
            }
        });

        buttonZoomOutRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.OutRight(imageView));
                render.start();
            }
        });

        buttonZoomOutUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.OutUp(imageView));
                render.start();
            }
        });

    }
}
