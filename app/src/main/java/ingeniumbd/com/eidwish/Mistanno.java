package ingeniumbd.com.eidwish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mistanno extends AppCompatActivity implements View.OnClickListener{

    private Button btnOne,btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnTen;
    String one = "উপকরণ: ঘিয়ে ভাজা লাচ্ছা (১ প্যাকেট), দুধ ১ লিটার, চিনি, পেঁপে, আনার, আপেল ও মিষ্টি কমলা।\n" +
            "যেভাবে করবেন: এক লিটার দুধ জ্বাল দিয়ে আধা লিটারের কাছাকাছি বানাতে হবে। দুধ একটি পাত্রে ঢেলে চিনি মেশাতে হবে। লাচ্ছা সেমাই দুধে ঢেলে কিছুটা নাড়াচাড়া করতে হবে। আগেই পেঁপে ও আপেল ছোট কিউব করতে হবে। আনার ও মিষ্টি কমলার কোয়া বের করুন। এরপর লাচ্ছার ওপর সুন্দর করে পেঁপে, আনার, আপেল ও কমলা দিয়ে নিন। ইচ্ছে করলে ওপর-নিচ করে দিন। গরম গরম পরিবেশন করুন।\n";
    String two = "উপকরণ: বড় ডিম ৪টা, লাচ্ছা সেমাই ২৫০ গ্রাম, কনডেন্সড মিল্ক ১ টিন, ঘি আধা কাপ, জাফরান ১ চা চামচ, গোলাপজল ১ টেঃ চামচ, এলাচ গুঁড়া আধা চা চামচ, কিসমিস ২ টেঃ চামচ, পেস্তাবাদাম কুচি ২ টেঃ চামচ, পানি ১ টেঃ চামচ।\n" +
            "প্রণালী: পানি, গোলাপজল ও জাফরান মিশিয়ে ঢেকে রাখতে হবে। ডিম কাঁটা চামচ দিয়ে ফেটিয়ে কনডেন্সড মিল্ক, এলাচ গুঁড়া, জাফরান মিশ্রিত গোলাপজল মিশিয়ে রাখতে হবে। লাচ্ছা সেমাই হাতে ভেঙে ঘি দিয়ে মাঝারি জ্বালে কিছুক্ষণ ভেজে ডিমের মিশ্রণ ওপর থেকে ঢালতে হবে, আর অনবরত নাড়তে হবে। ঝরঝরা হলে কিসমিস, পেস্তাবাদাম কুচি দিয়ে কিছুক্ষণ নাড়াচাড়া করে নামাতে হবে।\n";
    String three = "উপকরণ: পোলাওয়ের চাল ২ কাপ, চিনি ৩ কাপ, ঘি ১০ টেবিল চামচ, কমলার রস বা আনারস টুকরা আধা কাপ, পেস্তা বাদাম কুচি ২ টেবিল চামচ, খাবার রং সিকি চা-চামচ, কিশমিশ ২ টেবিল চামচ, দারচিনি ৪ টুকরা, এলাচ ৪ টুকরা, গোলাপ পানি ১ টেবিল চামচ, মোরব্বা আধা কাপ, জর্দার গুল্লি ১ কাপ, মালাই সিকি কাপ, জাফরান সিকি চা-চামচ।\n" +
            "প্রণালি: গোলাপ পানিতে জাফরান ভিজিয়ে রাখতে হবে। চাল ধুয়ে পানি ঝরিয়ে ২০-২৫ মিনিট পর ফোটানো পানিতে দিয়ে ভাত রান্না করতে হবে। ভাত সেদ্ধ হওয়া মাত্র মাড় ঝরাতে হবে। আধা কাপ পানিতে চিনি গলিয়ে লেবুর রস বা দুধ দিয়ে চিনির ময়লা কাটাতে হবে। আনারস কোরানো দিয়ে ঘি দিতে হবে। এলাচ, দারচিনি দিতে হবে। এবার ভাত সেদ্ধ আঁচে রান্না করতে হবে। কিশমিশ দিতে হবে। পানি শুকিয়ে গেলে জাফরান মিশ্রিত গোলাপ পানি দিতে হবে। চুলা থেকে নামিয়ে বাকি উপকরণ দিয়ে পরিবেশন করতে হবে।\n";
    String four = "উপকরণঃ দুধ ২ কেজি, সেমাই আধা কাপ, সাগুদানা ১ টেবিল চামচ, পেস্তা বাদাম কুচি সিকি কাপ, জাফরান এক চিমটি, কাঠবাদাম কুচি সিকি কাপ, কিসমিস ২ টেবিল চামচ, খুরমা কুচি সিকি কাপ, চিনি ১ কাপ। সাজানোর জন্য চেরি ও পেস্তা কুচি প্রয়োজনমতো।\n" +
            "প্রণালীঃ সাগুদানা ধুয়ে বাকি সব উপকরণ একসঙ্গে মিশিয়ে চুলায় দিতে হবে। ঘন ঘন নাড়তে হবে। ঘন হয়ে এলে নামিয়ে পাত্রে ঢালতে হবে। এবার ছোট ছোট পানতুয়া অথবা রসগোল্লা প্রয়োজনমতো পাত্রে দিতে হবে। ওপরে পেস্তা কুচি ও চেরি দিয়ে সাজিয়ে ঠান্ডা ঠান্ডা পরিবেশন করুন। নামানোর সময় খেয়াল রাখতে হবে যেন বেশি ঘন হয়ে না যায়। কারণ ঠান্ডা হলে এটা জমে আসবে।\n";
    String five = "উপকরণ: মেরি বিস্কুট দুই প্যাকেট। সফট ক্রিম একটিন (ছোট)। আধা লিটার সাদা দই, সাজানোর জন্য ফ্রেশ কেক, দুধ দুই কাপ, আধা চামচ কফি, এক টিন কনডেন্সড মিল্ক।\n" +
            "প্রণালী: দুধ অল্প গরম করে কফি মিলিয়ে ঠান্ডা করতে হবে। দই ও ক্রিম ভালো করে ফেটিয়ে কনডেন্সড মিল্ক মেশাতে হবে। আবার ফেটাতে হবে। এবার ডিসে এক প্রস্থ দইয়ের মিশ্রণ দিতে হবে। মেরি বিস্কুট, কফি দুধে ভিজিয়ে উঠিয়ে দইয়ের ওপর বিছাতে হবে, বিস্কুট এমনভাবে ভেজাতে হবে যেন তা আস্ত থাকে, ভেঙে না যায়। এভাবে একের পর এক লেয়ার তৈরি করে শেষ বার কেকটা গুঁড়ো করে ঢেকে দিতে হবে। ওপরে গেট করা চকোলেট দিয়ে সুন্দর করে সাজিয়ে তৈরি করা যায় দই ক্রিম কেক।\n";
    String six = "উপকরণ:\n" +
            "ডিম ৪টি, চিনি ৩/৪ কাপ, দুধ, ঘন ১/২ কাপ, ঘি ১/২ কাপ, এলাচ ২টি, দারচিনি ২ সেমি, ২ টুকরো, গোলাপজল ২ টেবিল চামচ, জাফরান (ইচ্ছা) সামান্য।\n" +
            "প্রস্তুত প্রণালী:\n" +
            "১। গোলাপজলে জাফরান আধঘন্টা ভিজিয়ে রাখুন।\n" +
            "২। ডিম কাঁটা চামচ দিয়ে ফেটে নিন। সব উপকরণ একসঙ্গে মিশান।\n" +
            "৩। মৃদু আঁচে চুলায় দিয়ে নাড়তে থাকুন। খুব সাবধানে নাড়তে হবে যেন তলায়না লাগে। ডিম জমাট বেঁধে মিহিদানার মতো হবে। পানি শুকিয়ে ঘি বের হলেই নামিয়ে নাড়ুন। বেশি ভাজলে হালুয়া শক্ত হয়ে যাবে। পরিবেশন পাত্রে ঢেলে উপরে মাওয়া বা পেস্তা বাদাম কুচি দিয়ে সাজান যায়।\n";
    String seven = "উপকরণ : তরল দুধ ১ লিটার, কনডেন্স মিল্ক ১ টিল, চালের গুঁড়ো আধা ভাঙ্গা, ১ কাপ ফজলি আম সরু করা ২ কাপ, এলাচ দানা আধা চা চামচ।\n" +
            "প্রণালী : প্রথমে দুধ ও চালের গুঁড়ো এক সাথে জ্বাল দিতে হবে। ঘন হয়ে গেলে তখন কনডেন্সড মিল্ক দিতে হবে। আবার আর একটু ঘন হয়ে গেলে চিনি সিরাপ ডুবানো আম সিরা থেকে উঠিয়ে ওই দুধে দিতে হবে। আরো একটু ঘন হয়ে এলে এলাচ দানা দিয়ে নামিয়ে নিতে হবে এরপর ঠান্ডা পরিবেশন করুন।\n";
    String eight = "উপকরণ: ছানা এক কাপ, ডিমের সাদা অংশ (দুটি ডিমের), গুঁড়ো দুধ- আধা কাপ, চিনি-আধা কাপ, পানি-আধা কাপ, এলাচগুঁড়া চা চামচের চার ভাগের এক ভাগ ও পাকা আমের টুকরা (ছোট ছোট) দেড় কাপ।\n" +
            "প্রণালী: আম ছাড়া ওপরের সব উপকরণ একসঙ্গে ব্লেন্ড করে নিতে হবে।\n" +
            "পুডিংয়ের ছাঁচে ক্যারামেল করে নিতে হবে। ব্লেন্ড করা উপকরণে আমের টুকরা মিলিয়ে ছাঁচে ঢেলে ভাপে জমিয়ে নিতে হবে। এতে ৩০-৪৫ মিনিট সময় লাগবে। ডিশে উল্টে নিয়ে সাজিয়ে পরিবেশন করুন।\n";
    String nine = "উপকরণঃ ছানা-৫০০ গ্রাম, খোয়াক্ষীর-৩৫০ গ্রাম, গুঁড়া চিনি- ১ কাপ, এলাচ গুঁড়া-১ চা চামচ, আমন্ড বাদাম বাটা-১ টে• চামচ, পেস্তা বাটা-১ টে•চামচ, ঘি-১ টে• চামচ।\n" +
            "প্রণালীঃ ছানা হাতে মসৃণ করে গুঁড়া চিনি, ঘি, পেস্তা ও আমন্ড বাটা এবং এলাচা গুঁড়া মিশিয়ে চুলায় দিয়ে নাড়াচাড়া করে নামিয়ে ঠান্ডা করে নিতে হবে। খোয়াক্ষীর দিয়ে মাখিয়ে পছন্দমতো শেপ করতে হবে। তাবক, চেরি ও কোকো পাউডার দিয়ে সাজিয়ে পরিবেশন করুন।\n";
    String ten = "উপকরণঃ আপেল, কলা, পেঁপে, আম টুকরো করে কাটা ২ কাপ, ঘন দুধ ১ কাপ, আইসক্রিম প্রয়োজনমতো, মধু ২ টেবিল চামচ, পেস্তা কুচি ২ চা চামচ, রুহ আফজা পরিমাণমতো, ওয়েফার বিস্কুট সাজানোর জন্য, মাওয়া ২ চা চামচ।\n" +
            "প্রণালীঃ ঘন করে দুধ গুলিয়ে ঠান্ডা করে নিতে হবে। ফলগুলো মধু দিয়ে মাখিয়ে নিতে হবে।\n" +
            "গ্লাস সাজানোঃ ২টি গ্লাসে ফলগুলো দিয়ে তার ওপর ঘন দুধ দিতে হবে। আইসক্রিমের স্কুপ দিতে হবে। এর ওপর পেস্তা ও মাওয়া ছড়িয়ে দিতে রুহ আফজা দিতে হবে। এবার ওয়েফার বিস্কুট দিয়ে সাজিয়ে পরিবেশন।\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mistanno);
        btnOne = (Button) findViewById(R.id.btnFolerLachaSemy);
        btnTwo = (Button) findViewById(R.id.btnDimLachaSemy);
        btnThree = (Button) findViewById(R.id.btnJafraniJorda);
        btnFour = (Button) findViewById(R.id.btnKosirSemy);
        btnFive = (Button) findViewById(R.id.btnKorimCake);
        btnSix = (Button) findViewById(R.id.btnDimerHalua);
        btnSeven = (Button) findViewById(R.id.btnDudherPaes);
        btnEight = (Button) findViewById(R.id.btnChanrPuding);
        btnNine = (Button) findViewById(R.id.btnMojadarSondes);
        btnTen = (Button) findViewById(R.id.btnFolerFaluda);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnTen.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public void onClick(View view) {
        if (view == btnOne){
            Intent intent = new Intent(Mistanno.this, ContentActivity.class);
            intent.putExtra("Data", one);
            intent.putExtra("resourseInt", R.drawable.foler_lacha_semy);
            startActivity(intent);

        }
        if (view == btnTwo){
            Intent intent = new Intent(Mistanno.this, ContentActivity.class);
            intent.putExtra("Data", two);
            intent.putExtra("resourseInt", R.drawable.dimerlacha_semy);
            startActivity(intent);
        }
        if (view == btnThree){
            Intent intent = new Intent(Mistanno.this, ContentActivity.class);
            intent.putExtra("Data", three);
            intent.putExtra("resourseInt", R.drawable.jafrin_jorda);
            startActivity(intent);
        }
        if (view == btnFour){
            Intent intent = new Intent(Mistanno.this, ContentActivity.class);
            intent.putExtra("Data", four);
            intent.putExtra("resourseInt", R.drawable.khir_semy);
            startActivity(intent);
        }
        if (view == btnFive){
            Intent intent = new Intent(Mistanno.this, ContentActivity.class);
            intent.putExtra("Data", five);
            intent.putExtra("resourseInt", R.drawable.doy_crim_cake);
            startActivity(intent);
        }
        if (view == btnSix){
            Intent intent = new Intent(Mistanno.this, ContentActivity.class);
            intent.putExtra("Data", six);
            intent.putExtra("resourseInt", R.drawable.dimer_halua);
            startActivity(intent);
        }
        if (view == btnSeven){
            Intent intent = new Intent(Mistanno.this, ContentActivity.class);
            intent.putExtra("Data", seven);
            intent.putExtra("resourseInt", R.drawable.amdudher_paes);
            startActivity(intent);
        }
        if (view == btnEight){
            Intent intent = new Intent(Mistanno.this, ContentActivity.class);
            intent.putExtra("Data", eight);
            intent.putExtra("resourseInt", R.drawable.amchaner_puding);
            startActivity(intent);
        }
        if (view == btnNine){
            Intent intent = new Intent(Mistanno.this, ContentActivity.class);
            intent.putExtra("Data", nine);
            intent.putExtra("resourseInt", R.drawable.mojadar_sondesh);
            startActivity(intent);
        }
        if (view == btnTen){
            Intent intent = new Intent(Mistanno.this, ContentActivity.class);
            intent.putExtra("Data", ten);
            intent.putExtra("resourseInt", R.drawable.foler_faluda);
            startActivity(intent);
        }

    }
}

