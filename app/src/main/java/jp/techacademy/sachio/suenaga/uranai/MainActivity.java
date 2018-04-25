package jp.techacademy.sachio.suenaga.uranai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //クリック処理
    public void onButton(View v){
        //①リモコン作成
        ImageView iv =(ImageView)findViewById(R.id.imageView);
        TextView tv =(TextView)findViewById(R.id.textView);


        //②表示内容の決定
        //乱数の作成（0～3の数字をランダム）
        int r = new Random().nextInt(11);
        //配列（0～3の並んだデータ）
        int[] imageId = {
                R.drawable.uranai2,
                R.drawable.uranai3,
                R.drawable.uranai4,
                R.drawable.uranai5,
                R.drawable.uranai6,
                R.drawable.uranai7,
                R.drawable.uranai8,
                R.drawable.uranai9,
                R.drawable.uranai10,
                R.drawable.uranai11,
                R.drawable.uranai12,
        };
        String[] strings = {
                "あなたはネコです！",
                "あなたはライオンです！",
                "あなたはトリです！",
                "あなたはハチです！",
                "あなたはキリンです！",
                "あなたはアルパカです！",
                "あなたはサルです！",
                "あなたはフクロウです！",
                "あなたはハクチョウです！",
                "あなたはカラスです！",
                "あなたはゾウです！",
        };

        //③表示の反映
        iv.setImageResource(imageId[r]);
        tv.setText(strings[r]);

    }

}
