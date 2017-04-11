package kr.hs.emirim.wwhurin.friendsimulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "김지연:Main";
    private ImageView mImageViewFriendVisual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출");
        setContentView(R.layout.activity_main);
        mImageViewFriendVisual=(ImageView) findViewById(R.id.friend_visual);
        Log.d(TAG, "activity_main 레이아웃 세팅");
    }

    void onClick(View view){
        Log.d(TAG, "onClick 메소드 호출");
        Log.d(TAG, "클릭된 뷰 id : "+view.getId());
        switch (view.getId()) {
            case R.id.button1:
                Log.d(TAG, "버튼1 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.ji_5);
                Toast.makeText(this, "엥", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Log.d(TAG, "버튼2 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.ji_1);
                Toast.makeText(this, "나 졸려", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Log.d(TAG, "버튼3 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.ji_2);
                Toast.makeText(this, "양치하러 갈 사람", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Log.d(TAG, "버튼4 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.ji_3);
                Toast.makeText(this, "바보", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Log.e(TAG, "버튼5 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.ji_4);
                Toast.makeText(this, "졸기", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.e(TAG, "버튼1 클릭");
                Toast.makeText(this, "잘못 눌렀습니다.", Toast.LENGTH_SHORT).show();
        }
        Log.d(TAG, "onClick 메소드 무사히 종료");
    }
}
