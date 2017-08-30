package research.p2p.stateunion.com.research;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.stateunion.p2p.research.activity.login.LoginActivity;
import com.stateunion.p2p.research.retrofit.RequestCommand;
import com.stateunion.p2p.research.retrofit.callback.DialogCallback;
import com.stateunion.p2p.research.retrofit.entiity.UserInfoBean;
import com.stateunion.p2p.research.retrofit.entiity.UserInfoEntity;
import com.stateunion.p2p.research.view.baseactivity.BaseActivity;
import com.stateunion.p2p.research.widget.IImageCodeView;

import retrofit2.Call;

public class MainActivity extends BaseActivity implements IImageCodeView{

    private Button logBt,webBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logBt= (Button) findViewById(R.id.button2);
        webBt= (Button) findViewById(R.id.button);

        logBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
             }
        });
    }


}
