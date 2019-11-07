package com.example.bai_tp05;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.ListView;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class ModuleListeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_list);

        Cursus cursus = new Cursus();
        ArrayList<Module> modules = cursus.getModules();

        AdapteurModule adapter = new AdapteurModule(
                this,
                R.layout.module,
                modules
        );

        ListView lv = (ListView) findViewById(R.id.module_liste_tv);
        lv.setAdapter(adapter);
    }
}
