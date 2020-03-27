package id.ac.polinema.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet(){
        namaMakanan.add("Kimbab");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/L7HRg0IQLe.jpg");
        infoMakanan.add("Kimbap menjadi salah satu makanan Korea yang praktis dimakan dan juga dibawa. Kendati demikian proses pembuatannya butuh waktu yang tidak sebentar lho. Makanan ini berupa nasi dengan aneka sayur yang digulung dalam rumput laut. Sekilas mirip dengan sushi dari Jepang namun penampilan kimbap sangat menggoda dengan warna warni sayurnya. ");

        namaMakanan.add("Bimbimbap");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/hTC9HSweOD.jpg");
        infoMakanan.add("Masakan Korea yang satu ini juga tak kalah nikmatnya. Ini berupa nasi putih dengan lauk sayur serta daging dan telur. Selain itu ada juga saus pedas gochujang. Makanan ini biasa juga disebut sebagai nasi campur");

        namaMakanan.add("Haemultang");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/2wLkjvjadD.jpg");
        infoMakanan.add("Makanan Korea yang satu ini juga halal dan wajib dicoba. Sup Haemultang berisi aneka bahan laut yang sedap. Cara masaknya sedikit tak biasa. Yakni dengan memasukkan kaldu dan bumbu serta air lalu memasaknya hingga mendidih. Setelahnya baru deh bahan lautnya dimasukkan. Khusus gurita biasanya dimasak dalam keadaan hidup-hidup untuk menjaga kesegarannya.");

        namaMakanan.add("Tteobboki");
        fotoMakanan.add("https://istyle.id/wp-content/uploads//2018/03/cvr.jpg");
        infoMakanan.add("Jajanan ala Korea yang satu ini kerap muncul dalam Kdrama. Berbentuk batang, rice cake satu ini disajikan dengan bumbu pedas manis bernama gochujang. Makanan ini sudah bisa ditemukan di aneka restoran Korea yang tersebar di Indonesia.");

        namaMakanan.add("Japachae");
        fotoMakanan.add("https://omnivorescookbook.com/wp-content/uploads/2019/11/1911_Japchae-Korean-Sweet-Potato-Noodles_003.jpg");
        infoMakanan.add("Makanan Korea satu ini berbahan sohun yang dicampur aneka sayur dan tentunya daging sapi. Umumnya japchae ini dimakan untuk lauk dan biasanya tersedia dalam kesempatan khusus dan juga saat pesta. Makanan ini pertama kalinya muncul di abad ke 17 kala Dinasti Joseon memerintah. Raja Gwanghaegun yang tengah mengadakan pesta sangat menyukai hidangan satu ini.");

        namaMakanan.add("Miyeok Guk");
        fotoMakanan.add("https://cdn2.tstatic.net/style/foto/bank/images/sup-rumput-laut_20170917_170839.jpg");
        infoMakanan.add("Makanan yang satu ini juga terbilang halal dan patut dicoba lho. Ini merupakan sup yang biasa disajikan pada saat hari ulang tahun. Sup ini juga bisa disajikan pada ibu yang baru melahirkan.");

        namaMakanan.add("Dakkochi");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/AsBwGWSjlQ.jpg");
        infoMakanan.add("Yang satu ini pasti tak asing karena di Indonesia juga ada makanan serupa, ya. Makanan berupa sate ayam ini hadir dalam sensasi rasa pedas.");

        namaMakanan.add("Cheonggukjang");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/3sZ3JM5k5T.jpg");
        infoMakanan.add("Yang satu ini dikenal sebagai pasta kedelai Korea yang biasanya dibuat dalam beberapa hari. Makanan ini berbahan biji kedelai yang difermentasi dan disajikan sebagai sup. Aromanya kuat namun citarasa yang lezat menggoda. Makanan ini sangat menyehatkan tubuh loh ini karena kandungan yang ada dalam makanan ini. Ada bakteri Bacillus Subtlis yang mampu menguraikan protein kedelai menjadi asam amino dan saponin. Kandungan ini dipercaya mampu menurunkan kadar kolesterol serta meningkatkan fungsi hati. Bisa juga dipilih untuk makanan diet dan memperlambat penuaan.");

        namaMakanan.add("Yangnyeom Tongdak");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/lw0Q4Q6gdt.jpg");
        infoMakanan.add("Makanan satu in tergolong jenis fast food yang paling laris di Korea. Aneka restoran menyediakan layanan pesan antar untuk makanan satu ini. Ayam goreng khas Korea ini digemari karena rasanya nikmat bertabur saus pedas asam manis khas Korea.");

        namaMakanan.add("Ramyeon");
        fotoMakanan.add("https://img.qraved.co/v2/image/data/Indonesia/jakarta/Melawai/Gokana_Ramen__amp__Teppan/beef_soyu_ramen_734x535.jpg");
        infoMakanan.add("Makanan ini sudah populer banget di seluruh dunia ya. Mie ini dimasak dengan aneka bumbu dan juga bahan tambahan lain. Mie kuah ini umumnya rasanya pedas dengan kuah kental.");

        namaMakanan.add("Bulgogi");
        fotoMakanan.add("https://assets.bonappetit.com/photos/57acd741f1c801a1038bc801/16:9/w_1000,c_limit/basic-bulgogi.jpg");
        infoMakanan.add("Yang ini merupakan olahan daging khas Korea. Umumnya memakai daging sirloin atau bagian daging sapi pilihan. Untuk bumbunya sendiri biasanya campuran kecap asin dan gula ditambah rempah lain.");

        
        prosesRecyclerViewAdapter();
    }
}
