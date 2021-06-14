package com.example.spin_booletht;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class activity2 extends MainActivity {
    public String searchedParts[]=new String[4];
    public String provisionsParts[]=new String[4];
    public int Counter;
    public int Generic=0;
    public int Where=0;
    public int provisionsWhere=0;
    public String Pieces[];
    public String Pieces2[];
    EditText inputValue;
    TextView resultValue;
    String allText;
    String resultText=" ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        inputValue   = (EditText) findViewById(R.id.input);
        resultValue  =(TextView) findViewById(R.id.result);
    }


    public void Assignment(){
        searchedParts[0]="araba";
        searchedParts[1]="ev";
        searchedParts[2]="anahtar";
        searchedParts[3]="sayac";

        provisionsParts[0]="car";
        provisionsParts[1]="home";
        provisionsParts[2]="key";
        provisionsParts[3]="counter";

    }
    public int SearchSerial(String[] item , String[] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            for (int a = 0; a <item.length; a++)
            {
                if (item[a].equals(array[i])) {
                   return i;
                }
            }
        }
        return -1;
    }
    public int provisionsProvide(String[] item, String[] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            for (int a = 0; a < item.length; a++)
            {
                if (item[a].equals(array[i])) {
                    return a;
                }
            }
        }
        return -1;
    }

    public void Activity2Buttons(View v){


        if(v.getId()==R.id.button2){
            Assignment();
            allText=inputValue.getText().toString();
            Pieces=allText.split(" ");
            Counter=Pieces.length;

            System.out.println("Counter: "+Counter);
            for (String j :Pieces) {
                Where=SearchSerial(searchedParts,Pieces);
                provisionsWhere=provisionsProvide(searchedParts,Pieces);
                if(Where==-1)
                {
                    //Debug!!!
                }
                else
                {

                   Pieces[Where]=provisionsParts[provisionsWhere];
                }
                if (resultText != null) {
                    resultText += " " + Pieces[Generic];
                    if (Generic != Pieces.length) {
                        Generic++;
                    }
                }

            }
            System.out.println(resultText);
            resultValue.setText(resultText);

        }



    }

    private void showToast(String piece) {
        Toast.makeText(activity2.this, piece,Toast.LENGTH_SHORT).show();
    }
}
