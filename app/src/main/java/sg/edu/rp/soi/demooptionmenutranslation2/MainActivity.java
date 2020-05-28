package sg.edu.rp.soi.demooptionmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.TextViewTranslatedText);
        registerForContextMenu(textView);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");
    }
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (item.getItemId()==0) {
            textView.setText("Hello ");
            return true;
        }else if (item.getItemId()==1) {
            textView.setText("Ciao");
            return true;
        }else  {
            textView.setText("Error translation");
        }
        return super.onContextItemSelected(item);
    }
}