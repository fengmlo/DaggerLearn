package me.fengmlo.dagger2test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

import me.fengmlo.dagger2test.di.Baozi;
import me.fengmlo.dagger2test.di.Baozi1;
import me.fengmlo.dagger2test.di.DaggerZhaiNanComponent;
import me.fengmlo.dagger2test.di.ZhaiNan;
import me.fengmlo.dagger2test.di.ZhaiNanComponent;

public class MainActivity extends AppCompatActivity {

    @Inject
    ZhaiNan zhaiNan;

    @Inject
    @Baozi1
    Baozi baozi;

    @Inject
    @Named("baozi2")
    Baozi baozi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        zhaiNan = DaggerZhaiNanComponent.builder().build().get();
//        ZhaiNanComponent zhaiNanComponent = DaggerZhaiNanComponent.builder()
//                .zhaiNanModule(new ZhaiNanModule())
//                .build();
        ZhaiNanComponent zhaiNanComponent = DaggerZhaiNanComponent.create();
        zhaiNanComponent.inject(this);
        zhaiNanComponent.inject(zhaiNan);
        Toast.makeText(this, zhaiNan.eat(), Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.text);
        textView.setText(zhaiNan.eat() + "\n" + baozi.toString() + "\n" + baozi2.toString());

    }
}
