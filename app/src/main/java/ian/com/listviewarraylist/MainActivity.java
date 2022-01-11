package ian.com.listviewarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] item = {"item1","item2","item3","item4"};
    private ListView lsv_main;
    private TextView txt_ItemSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview,item);

        lsv_main = (ListView)findViewById(R.id.lsv_main);
        txt_ItemSelect = (TextView)findViewById(R.id.txt_ItemSelect);
        lsv_main.setAdapter(adapter);
        lsv_main.setOnItemClickListener(listViewRegionOnItemClick);
    }
    private AdapterView.OnItemClickListener listViewRegionOnItemClick
            = new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {
            // TODO Auto-generated method stub

            txt_ItemSelect.setText("你選擇了: " + ((TextView) view).getText());
        }
    };
}