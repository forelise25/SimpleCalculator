package benighstar.kr.hs.emirim.simplecalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/{
    EditText textFirst, textSecond;
    Button butAdd, butSub,butMul,butDiv;
    TextView textResult;
    private String result;
    EditText editFirst, editSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFirst = (EditText) findViewById(R.id.edit_first);
        editSecond= (EditText) findViewById(R.id.edit_second);

        Button butAdd=(Button)findViewById(R.id.butAdd);
        Button butSub=(Button)findViewById(R.id.butSub);
        Button butMul=(Button)findViewById(R.id.butMul);
        Button butDiv=(Button)findViewById(R.id.butDiv);
        textResult=(TextView)findViewById(R.id.text_result);

        butAdd.setOnClickListener(butHandler);
        butSub.setOnClickListener(butHandler);
        butMul.setOnClickListener(butHandler);
        butDiv.setOnClickListener(butHandler);//야 이벤트 발생됬어 너 처리해! 라고 감시자를 설정하기 위한 메소드

        /*
        butAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = editFirst.getText().toString();
                String num2 = editSecond.getText().toString();
                int result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("계산결과 : "+result);
            }
        });
        butSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = editFirst.getText().toString();
                String num2 = editSecond.getText().toString();
                int result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산결과 : "+result);
            }
        });
        butMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = editFirst.getText().toString();
                String num2 = editSecond.getText().toString();
                int result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산결과 : "+result);
            }
        });
        butDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = editFirst.getText().toString();
                String num2 = editSecond.getText().toString();
                int result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("계산결과 : "+result);
            }
        });
        */
    }//end onCreat

    View.OnClickListener butHandler=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String num1 = editFirst.getText().toString();
            String num2 = editSecond.getText().toString();

            switch(view.getId()){
                case R.id.butAdd:
                    result=num1+num2;
                    break;
                case R.id.butSub:
                    result=num1+num2;
                    break;
                case R.id.butMul:
                    result=num1+num2;
                    break;
                case R.id.butDiv:
                    result=num1+num2;
                    break;
            }

            textResult.setText(result+"");
        }
    };

/*    @Override
    public void onClick(View view) {
        TextView editFirst = null, editSecond = null;
        String num1 = editFirst.getText().toString();
        String num2 = editSecond.getText().toString();

        switch(view.getId()){
            case R.id.butAdd:
                result=num1+num2;
                break;
            case R.id.butSub:
                result=num1+num2;
                break;
            case R.id.butMul:
                result=num1+num2;
                break;
            case R.id.butDiv:
                result=num1+num2;
                break;
        }
    }*/
}
