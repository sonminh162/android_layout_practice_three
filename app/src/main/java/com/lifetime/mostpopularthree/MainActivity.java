package com.lifetime.mostpopularthree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //make translucent statusBar on kitkat devices
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(this,WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        //make fully Android Transparent Status bar
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }
    public static void setWindowFlag(Activity activity,final int bits,boolean on){
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if(on){
            winParams.flags |=bits;
        }else{
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

    public void initView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Info> arrayList = new ArrayList<>();
        arrayList.add(new Info(R.drawable.image_recycle_one,"Quick Brown Fox Jumps Over","TRAVELLING","16 MAY 2016","Synth polaroid bitters chillwave pickled. Vegan\n" +
                "disrupt tousled, Portland keffiyeh aesthetic food","14 COMMENTS","254 LIKES"));
        arrayList.add(new Info(R.drawable.recycle_two,"Quick Brown Fox Jumps Over","HOBBY","16 MAY 2016","Synth polaroid bitters chillwave pickled. Vegan\n" +
                "disrupt tousled, Portland keffiyeh aesthetic food","14 COMMENTS","254 LIKES"));

        Adapter adapter = new Adapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
