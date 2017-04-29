package com.androidviewanimations;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.androidviewanimations.library.Animo;
import com.androidviewanimations.library.Techniques;

public class MainActivity extends Activity {

    private ListView mListView;
    private EffectAdapter mAdapter;
    private TextView textView;
    private Animo.AnimString rope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.list_items);
        textView = (TextView) findViewById(R.id.textView);

        mAdapter = new EffectAdapter(this);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (rope != null) {
                    rope.stop(true);
                }
                Techniques technique = (Techniques) view.getTag();
                rope = Animo.with(technique)
                        .duration(1200)
                        .repeat(Animo.INFINITE)
                        .pivot(Animo.CENTER_PIVOT, Animo.CENTER_PIVOT)
                        .interpolate(new AccelerateDecelerateInterpolator())
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {

                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {
                                Toast.makeText(MainActivity.this, "canceled previous animation", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(textView);
            }
        });
        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rope != null) {
                    rope.stop(true);
                }
            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus) {
            rope = Animo.with(Techniques.FadeIn).duration(1000).playOn(textView);// after start,just click mTarget view, rope is not init
        }
    }
}
