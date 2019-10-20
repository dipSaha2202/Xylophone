package com.dipmusic.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,
                        AudioManager.STREAM_MUSIC, 0);

        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c,PRIORITY);
        mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d,PRIORITY);
        mESoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e,PRIORITY);
        mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f,PRIORITY);
        mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g,PRIORITY);
        mASoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a,PRIORITY);
        mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b,PRIORITY);
    }

    public void playC(View view){
        mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playD(View view){
        mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playE(View view){
        mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playF(View view){
        mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playG(View view){
        mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playA(View view){
        mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playB(View view){
        mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}
