package com.shawron.numbertransformer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



import static com.shawron.numbertransformer.R.id.edittextBinary;


public class MainActivity extends AppCompatActivity {
    private EditText editTextDecimal;
    private EditText editTextBinary;
    private EditText editTextOctal;
    private EditText editTextHexadecimal;
    private Button buttonErace;
    private String value;
    private TextWatcher textwatcher;

    private View.OnFocusChangeListener onFocusChangeListener;
    private int focusViewId1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextDecimal = findViewById(R.id.edittextDecimal);
        editTextBinary = findViewById(edittextBinary);
        editTextOctal = findViewById(R.id.edittextOctal);
        editTextHexadecimal = findViewById(R.id.edittextHexadecimal);
        buttonErace = findViewById(R.id.buttonErase);




        Button btn1 = findViewById(R.id.buttonExit);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


        buttonErace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClearFields();
            }

        });


        textwatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                value = ((EditText) findViewById(focusViewId1)).getText().toString().trim();

                if (value.length() > 0) {
                    convertNumber();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        onFocusChangeListener = new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    focusViewId1 = v.getId();

                    ((EditText) findViewById(focusViewId1)).addTextChangedListener(textwatcher);

                    GradientDrawable gradientDrawable = new GradientDrawable(
                            GradientDrawable.Orientation.TR_BL,
                            new int[]{Color.parseColor("#7AD7F0"), Color.parseColor("#B7E9F7")}// Color Array
                    );
                    gradientDrawable.setShape(GradientDrawable.RECTANGLE);
                    gradientDrawable.setCornerRadius(10);

                    if (focusViewId1 == R.id.edittextDecimal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_dark));
                    }
                    if (focusViewId1 == R.id.edittextBinary) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_red_dark));
                    }
                    if (focusViewId1 == R.id.edittextOctal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_green_dark));
                    }
                    if (focusViewId1 == R.id.edittextHexadecimal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_purple));
                    }
                    v.setBackground(gradientDrawable);
                }else {

                    ((EditText) findViewById(focusViewId1)).removeTextChangedListener(textwatcher);

                    if (focusViewId1 == R.id.edittextDecimal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design));
                    }
                    if (focusViewId1 == edittextBinary) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_2));
                    }
                    if (focusViewId1 == R.id.edittextOctal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_3));
                    }
                    if (focusViewId1 == R.id.edittextHexadecimal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_4));
                    }
                }
            }
        };
        editTextDecimal.setOnFocusChangeListener(onFocusChangeListener);

        onFocusChangeListener = new View.OnFocusChangeListener() {


            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    focusViewId1 = v.getId();

                    ((EditText) findViewById(focusViewId1)).addTextChangedListener(textwatcher);

                    GradientDrawable gradientDrawable = new GradientDrawable(
                            GradientDrawable.Orientation.TR_BL,
                            new int[]{Color.parseColor("#F1959B"), Color.parseColor("#F6BDC0")}// Array
                    );
                    gradientDrawable.setShape(GradientDrawable.RECTANGLE);
                    gradientDrawable.setCornerRadius(10);

                    if (focusViewId1 == R.id.edittextDecimal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_dark));
                    }
                    if (focusViewId1 == R.id.edittextBinary) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_red_dark));
                    }
                    if (focusViewId1 == R.id.edittextOctal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_green_dark));
                    }
                    if (focusViewId1 == R.id.edittextHexadecimal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_purple));
                    }
                    v.setBackground(gradientDrawable);
                }else {

                    ((EditText) findViewById(focusViewId1)).removeTextChangedListener(textwatcher);

                    if (focusViewId1 == R.id.edittextDecimal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design));
                    }
                    if (focusViewId1 == edittextBinary) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_2));
                    }
                    if (focusViewId1 == R.id.edittextOctal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_3));
                    }
                    if (focusViewId1 == R.id.edittextHexadecimal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_4));
                    }
                }
            }
        };
        editTextBinary.setOnFocusChangeListener(onFocusChangeListener);
        onFocusChangeListener = new View.OnFocusChangeListener() {


            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    focusViewId1 = v.getId();

                    ((EditText) findViewById(focusViewId1)).addTextChangedListener(textwatcher);

                    GradientDrawable gradientDrawable = new GradientDrawable(
                            GradientDrawable.Orientation.TR_BL,
                            new int[]{Color.parseColor("#90ee90"), Color.parseColor("#B7FFBF")}// Array
                    );
                    gradientDrawable.setShape(GradientDrawable.RECTANGLE);
                    gradientDrawable.setCornerRadius(10);
                    if (focusViewId1 == R.id.edittextDecimal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_dark));
                    }
                    if (focusViewId1 == R.id.edittextBinary) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_red_dark));
                    }
                    if (focusViewId1 == R.id.edittextOctal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_green_dark));
                    }
                    if (focusViewId1 == R.id.edittextHexadecimal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_purple));
                    }
                    v.setBackground(gradientDrawable);
                }else {

                    ((EditText) findViewById(focusViewId1)).removeTextChangedListener(textwatcher);

                    if (focusViewId1 == R.id.edittextDecimal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design));
                    }
                    if (focusViewId1 == edittextBinary) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_2));
                    }
                    if (focusViewId1 == R.id.edittextOctal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_3));
                    }
                    if (focusViewId1 == R.id.edittextHexadecimal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_4));
                    }
                }
            }
        };
        editTextOctal.setOnFocusChangeListener(onFocusChangeListener);
        onFocusChangeListener = new View.OnFocusChangeListener() {


            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    focusViewId1 = v.getId();

                    ((EditText) findViewById(focusViewId1)).addTextChangedListener(textwatcher);

                    GradientDrawable gradientDrawable = new GradientDrawable(
                            GradientDrawable.Orientation.TR_BL,
                            new int[]{Color.parseColor("#DC86FA"), Color.parseColor("#ffddf2")}// Array
                    );
                    gradientDrawable.setShape(GradientDrawable.RECTANGLE);
                    gradientDrawable.setCornerRadius(10);
                    if (focusViewId1 == R.id.edittextDecimal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_dark));
                    }
                    if (focusViewId1 == R.id.edittextBinary) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_red_dark));
                    }
                    if (focusViewId1 == R.id.edittextOctal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_green_dark));
                    }
                    if (focusViewId1 == R.id.edittextHexadecimal) {
                        gradientDrawable.setStroke(8, ContextCompat.getColor(getApplicationContext(), android.R.color.holo_purple));
                    }
                    v.setBackground(gradientDrawable);
                }else {

                    ((EditText) findViewById(focusViewId1)).removeTextChangedListener(textwatcher);

                    if (focusViewId1 == R.id.edittextDecimal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design));
                    }
                    if (focusViewId1 == edittextBinary) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_2));
                    }
                    if (focusViewId1 == R.id.edittextOctal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_3));
                    }
                    if (focusViewId1 == R.id.edittextHexadecimal) {
                        v.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.view_design_4));
                    }
                }
            }
        };
        editTextHexadecimal.setOnFocusChangeListener(onFocusChangeListener);
    }

    private void ClearFields() {
        editTextDecimal.setText("");
        editTextBinary.setText("");
        editTextOctal.setText("");
        editTextHexadecimal.setText("");

    }


    private void convertNumber() {
        try {
            long num = 0;

            switch (focusViewId1) {
                case R.id.edittextDecimal:
                        num = Long.parseLong(value);
                    editTextBinary.setText(String.valueOf(Long.toBinaryString(num)));
                    editTextOctal.setText(String.valueOf(Long.toOctalString(num)));
                    editTextHexadecimal.setText(String.valueOf(Long.toHexString(num)));
                    break;

                case R.id.edittextBinary:
                    num = Long.parseLong(value,2);
                    editTextDecimal.setText(String.valueOf(num));
                    editTextOctal.setText(String.valueOf(Long.toOctalString(num)));
                    editTextHexadecimal.setText(String.valueOf(Long.toHexString(num)));
                    break;

                case R.id.edittextOctal:
                    num = Long.parseLong(value,8);
                    editTextDecimal.setText(String.valueOf(num));
                    editTextBinary.setText(String.valueOf(Long.toBinaryString(num)));
                    editTextHexadecimal.setText(String.valueOf(Long.toHexString(num)));
                    break;

                case R.id.edittextHexadecimal:
                    num = Long.parseLong(value,16);
                    editTextDecimal.setText(String.valueOf(num));
                    editTextBinary.setText(String.valueOf(Long.toBinaryString(num)));
                    editTextOctal.setText(String.valueOf(Long.toOctalString(num)));
                    break;

            }

        } catch (
                NumberFormatException e) {
            e.printStackTrace();
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }


}


