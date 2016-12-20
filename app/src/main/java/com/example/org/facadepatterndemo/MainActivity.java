package com.example.org.facadepatterndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    TextView tvOrderMsg;
    Button btnMakePayment;
    private String orderId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOrderMsg = (TextView) findViewById(R.id.tvOrgerMsg);
        btnMakePayment = (Button) findViewById(R.id.btnMakePayment);
        btnMakePayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderPayment orderFacade = new OrderPayment();
                orderId= String.valueOf(orderFacade.placeOrder("SD123456"));
                tvOrderMsg.setText(orderId);
            }
        });
    }

   /* @OnClick(R.id.btnMakePayment)
    public void makePayment(View view){

    }*/
}
