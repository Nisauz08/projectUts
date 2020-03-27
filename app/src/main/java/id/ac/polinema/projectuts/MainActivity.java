package id.ac.polinema.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet(){
        namaMakanan.add("Kimchi");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/kimchi.jpg");

        namaMakanan.add("Sannakji");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/sannakji.jpg");

        namaMakanan.add("Jjajangmyeon");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/jjajangmyeon.jpg");

        namaMakanan.add("Kimbab");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/kimbab.jpg");

        namaMakanan.add("Bibimbap");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/bibimbap.jpg");

        namaMakanan.add("Japchae");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/japchae.jpg");

        namaMakanan.add("Bulgogi");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/bulgogi.jpg");

        namaMakanan.add("Miyeok Guk");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/miyeok-guk.jpg");

        namaMakanan.add("Ramyeon");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/ramyeon.jpg");

        namaMakanan.add("Gogigui");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/gogigui.jpg");

        namaMakanan.add("Tteok");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/tteok.jpg");

        namaMakanan.add("Tteokbokki");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/tteokbokki.jpg");

        namaMakanan.add("Tokkebi Hot Dog");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/tokkebi-hot-dog.jpeg");
        
        prosesRecyclerViewAdapter();
    }
}
