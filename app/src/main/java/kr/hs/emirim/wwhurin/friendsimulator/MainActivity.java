package kr.hs.emirim.wwhurin.friendsimulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClick(View view){
        switch (view.getId()) {
            case R.id.button1:
                Toast.makeText(this, "엥", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "나 졸려", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "양치하러 갈 사람", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "바보", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "졸기", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "잘못 눌렀습니다.", Toast.LENGTH_SHORT).show();
        }
    }
}
