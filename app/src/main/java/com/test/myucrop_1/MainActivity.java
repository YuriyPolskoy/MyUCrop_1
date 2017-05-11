package com.test.myucrop_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ucrop_layout);

        final EditText coordX = (EditText) findViewById(R.id.ratio_x);
        final EditText coordY = (EditText) findViewById(R.id.ratio_y);
        SeekBar seekBarQuality = ((SeekBar) findViewById(R.id.seekbar_quality));
        final TextView textViewQuality = ((TextView) findViewById(R.id.text_quality));

        Button btnPickCrop = (Button) findViewById(R.id.btn_pick_crop);
        btnPickCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, coordX.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        Button btnRndImg = (Button) findViewById(R.id.btn_rand_image);
        btnRndImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, coordY.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        Button btnImgSrc = (Button) findViewById(R.id.btn_img_src);
        btnImgSrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.press_img_src, Toast.LENGTH_SHORT).show();
            }
        });

        Button frstlCrop = (Button) findViewById(R.id.freestyleCrop);
        frstlCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.picked_crop_btn, Toast.LENGTH_SHORT).show();
            }
        });

        Button btnDynamic = (Button) findViewById(R.id.btn_dynamic);
        btnDynamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.dnm_btn_prs, Toast.LENGTH_SHORT).show();
            }
        });

        Button btnSquare = (Button) findViewById(R.id.btn_square);
        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.square_btn_pressed, Toast.LENGTH_SHORT).show();
            }
        });

        textViewQuality.setText(String.format(getString(R.string.format_quality), seekBarQuality.getProgress()));
        seekBarQuality.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewQuality.setText(String.format(getString(R.string.format_quality), progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }


        });
    }
}
