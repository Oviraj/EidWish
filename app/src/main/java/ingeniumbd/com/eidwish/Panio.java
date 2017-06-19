package ingeniumbd.com.eidwish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Panio extends AppCompatActivity implements View.OnClickListener{

    private Button btnOne,btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnTen;
    String one ="উপকরণ: আম কুচি ১ কাপ, তেঁতুলের ক্বাথ ১ টেবিল চামচ, পুদিনাপাতা ১ চা চামচ, কাঁচামরিচ ১টি, চিনি ২ টেবিল চামচ, লবণ সামান্য।\n" +
            "প্রণালি: সব একসঙ্গে ব্লেন্ডারে দিয়ে ব্লেন্ড করতে হবে। ওপরে বরফ কুচি, পুদিনা পাতা দিয়ে পরিবেশন করুন।\n";
    String two ="উপকরণঃ দুধ ২ কাপ, টক দই ১ কাপ, পাকা পেঁপে ২ কাপ, বরফ কুচি ১ কাপ, বিটলবণ আধা চা চামচ, পুদিনাপাতা ১ টেবিল চামচ।\n" +
            "প্রণালীঃ ওপরের সব উপকরণ একসঙ্গে ব্লেন্ড করে নিতে হবে। এবার গ্লাসে ঢেলে ঠান্ডা ঠান্ডা পরিবেশন।\n";
    String three ="উপকরণ : আঙুর ১২০ গ্রাম, পানি ২৬০ মিলিলিটার, টমেটো জুস ২০ মিলিলিটার, চিনি পাঁচ চা চামচ, বরফ চার টুকরো, বিট লবণ পরিমাণমতো, গোলমরিচের গুঁড়া ও জাফরানি পরিমাণমতো।\n" +
            "প্রণালী : ওপরের সব উপকরণ মিশিয়ে ভালোভাবে ব্লেন্ড করুন এবং একটি ছাঁকনি দিয়ে ভালো করে ছেঁকে নিন। এখন এই শরবত সুদৃশ্য গ্লাসে সুন্দর করে পরিবেশন করুন।\n";
    String four ="উপকরণ: দুধ ১ লিটার, পানি দেড় কাপ, এলাচি-খোসা ৪টা, থাই পাতা ২টা, আদাকুচি ১ টেবিল-চামচ, চিনি ৪-৫ চা-চামচ, মৌরি ১ চা-চামচ, দারচিনির গুঁড়া ১ চা-চামচ। চা-পাতা ৫ চা-চামচ।\n" +
            "প্রণালী: বড় পাত্রে ওপরের সব উপকরণ (চা-পাতা ছাড়া) একসঙ্গে মিলিয়ে চুলায় দিয়ে ২-৩টা বলক তুলে নিতে হবে। এখন চা-পাতা দিয়ে নেড়ে আবার ২-৩টা বলক তুলে চুলা বন্ধ করে ঢেকে রাখতে হবে। পাঁচ মিনিট পর ছেঁকে গরম গরম পরিবেশন।\n";
    String five ="উপকরণঃ দুধ ২কাপ, ডিমের কুসুম ৪টি,চিনি ২/৩ কাপ,কলা ৫টি.\n" +
            "১। সসপ্যানে দুধ ও অর্দ্বেক চিনি মিশিয়ে জ্বাল দাও। ফুটে উঠলে উনুন থেকে নামিয়ে ১০ মিনিট ঢেকে রাখ।\n" +
            "২। ডিমের কুসুমের সাথে বাকি চিনি মিশিয়ে ফেট। খুব ভালভাবে ফেটবে যেন কুসুমের রং হালকা হয়।\n" +
            "৩। দুধের সসপ্যান উনুনে দাও। দুধ ফুটে উঠলে ৩টে.চা দুধ কুসুমে দিয়ে জোরে ফেট। উনুন থেকে সসপ্যান নামিয়ে দুধের মধ্যে কুসুমের মিশ্রণ আস্তে আস্তে ঢাল এবং দুধ নাড়তে থাক।\n" +
            "৪। সসপ্যান আবার মৃদু আঁচে উনুনে বসিয়ে নাড়তে থাক। ক্রিম ঘন হবে কিন্তু ফুটাবে না। উনুন থেকে নামিয়ে ১-২ মিনিট নাড়তে থাক। বাটিতে ক্রিম ঢাল। বড় গামলায় বরফ মিশানো ঠান্ডা পানিতে ক্রিমের পাত্র রাখ। বাটির ক্রিম ঘন ঘন নাড়বে। আধা ঘন্টা পরে ক্রিম ঠান্ডা হলে বরফ পানি থেকে তোল।\n" +
            "৫। ক্রিম বরফ পানি থেকে তোলার পরে কলা খুব মিহি করে চটকাবে, ব্লেন্ডারে দিবে না। কলা চটকে দেড় কাপ নেবে।\n" +
            "৬। কলার সাথে অল্প অল্প করে ক্রিম দিয়ে মসৃণ করে ফেট, মোলডে ঢাল। রেফ্রিজারেটরে বরফের চেম্বারে রাখ। পরিবেশনের আগে ফ্রিজ থেকে নামাবে। ৮ পরিবেশন হবে।\n";
    String six ="ঊপকরণঃ তরমুজের রস ৩ কাপ, আদার রস ১/৪ কাপ, কমলার রস ১ কাপ, সাদা গোল মরিচের গুঁড়া ১/৪ কাপ, আনারসের রস ১ কাপ,কমলার কোষ ৮ টি, লবন ১/২ কাপ, চিনি ৩/৪ কাপ।\n" +
            "১। সব রস ঠান্ডা করে একসাথে নিয়ে অন্যান্য সব উপকরণ দিয়ে মিশাও।\n" +
            "কমলার কোষের আঁশ ও বীচি ফেলে পাঞ্চে দাও।\n" +
            "২। ফলের রসের পরিমাণ ইচ্ছা মতো নিতে পার। লবণ,চিনি,মসলা স্বাদ অনুযায়ী দিবে। মাঝারি সাইজের গ্লাসে ঠান্ডা পাঞ্চ পরিবেশন কর।\n";
    String seven ="উপকরণ: টকদই, পুদিনা ও ধনেপাতা, কাঁচামরিচ, লবঙ্গ, চিনি, লবণ পরিমাণমতো।\n" +
            "প্রণালি: সবকিছু মিশিয়ে এক ঘণ্টার মতো রাখতে হবে। রাখার পর পরিমাণমতো উপকরণ দিয়ে ব্লেন্ড করে তৈরি করতে হবে বোরহানি।\n";
    String eight ="খাদ্য উপাদান: প্রোটিন, ভিটামিন ‘এ’ ও ‘বি’, আয়রন ও রিবোফ্লাবিন।\n" +
            "উপকরণ: লাল চিঁড়া আধা কাপ, মিষ্টি দই ২ কাপ, ঠান্ডা দুধ ৩ কাপ, গোলাপ জল সিকি চা-চামচ, বরফ কুচি ইচ্ছামতো।\n" +
            "প্রণালি: চিঁড়া ভালো করে ধুয়ে এক ঘণ্টা ভিজিয়ে রেখে সব উপকরণ একসঙ্গে ব্লেন্ডারে ব্লেন্ড করে গ্লাসে ঢেলে পরিবেশন করতে হবে।\n";
    String nine ="উপকরণঃ\n" +
            "পাকা আমের ক্বাথ ২ কাপ,\n" +
            "মিষ্টি দই আধা কেজি,\n" +
            "চিনি ১ কাপ,\n" +
            "পানি ২ কাপ,\n" +
            "কাঠবাদাম বাটা আধা কাপ,\n" +
            "চিনাবাদাম বাটা সিকি কাপ,\n" +
            "পেস্তাবাদাম বাটা সিকি কাপ,\n" +
            "বরফ কুচি ১ কাপ।\n" +
            "প্রণালীঃ\n" +
            "বরফ কুচি বাদে বাকি সব উপকরণ একসঙ্গে ব্লেন্ডারে ব্লেন্ড করে বরফ কুচি দিয়ে পরিবেশন করুন।\n";
    String ten ="উপকরণঃ পাকা পেয়ারা ৪টি, মেবুর রস ১ টে.চা., পানি ৮ কাপ, চিনি ১ কাপ।  \n" +
            "১। পেয়ারা ধুয়ে টুকরা কর। ৮ কাপ পানি দিয়ে ঢেকে সিদ্ধ কর। সিদ্ধ করার সময় পেয়ারা নাড়বে না।\n" +
            "২। পেয়ারা খুব নরম হলে উনুন থেকে নামাও। মিহি কাপড়ে পেয়ারা ছেঁকে খুব সাবধানে নিংড়ে রস নাও।\n" +
            "৩। চিনি মিশিয়ে রস চুলায় দাও। ফুটে উঠলে সাইট্রিক এসিড বা লেবুর রস দাও। সিরাপ ঘন হলে নামাও।\n" +
            "৪। পেয়ারার সিরাপে ৩ কাপ পানি মিশিয়ে রেফ্রিজারেটারে রাখ।\n" +
            "৫। বরফকুচি দিয়ে পরিবেশন কর।\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panio);
        btnOne = (Button) findViewById(R.id.btnTetulerSorbot);
        btnTwo = (Button) findViewById(R.id.btnPaperLachi);
        btnThree = (Button) findViewById(R.id.btnAngurerSorbot);
        btnFour = (Button) findViewById(R.id.btnMoslaCha);
        btnFive = (Button) findViewById(R.id.btnBenanaRos);
        btnSix = (Button) findViewById(R.id.btnTajaRos);
        btnSeven = (Button) findViewById(R.id.btnBorhani);
        btnEight = (Button) findViewById(R.id.btnChirarLachi);
        btnNine = (Button) findViewById(R.id.btnBadamLachi);
        btnTen = (Button) findViewById(R.id.btnPearaSorbot);
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
            Intent intent = new Intent(Panio.this, ContentActivity.class);
            intent.putExtra("Data", one);
            intent.putExtra("resourseInt", R.drawable.amtetuler_sorbot);
            startActivity(intent);

        }
        if (view == btnTwo){
            Intent intent = new Intent(Panio.this, ContentActivity.class);
            intent.putExtra("Data", two);
            intent.putExtra("resourseInt", R.drawable.paka_pape);
            startActivity(intent);
        }
        if (view == btnThree){
            Intent intent = new Intent(Panio.this, ContentActivity.class);
            intent.putExtra("Data", three);
            intent.putExtra("resourseInt", R.drawable.angurer_sorbot);
            startActivity(intent);
        }
        if (view == btnFour){
            Intent intent = new Intent(Panio.this, ContentActivity.class);
            intent.putExtra("Data", four);
            intent.putExtra("resourseInt", R.drawable.mosla_cha);
            startActivity(intent);
        }
        if (view == btnFive){
            Intent intent = new Intent(Panio.this, ContentActivity.class);
            intent.putExtra("Data", five);
            intent.putExtra("resourseInt", R.drawable.flozen_benana);
            startActivity(intent);
        }
        if (view == btnSix){
            Intent intent = new Intent(Panio.this, ContentActivity.class);
            intent.putExtra("Data", six);
            intent.putExtra("resourseInt", R.drawable.taja_ros);
            startActivity(intent);
        }
        if (view == btnSeven){
            Intent intent = new Intent(Panio.this, ContentActivity.class);
            intent.putExtra("Data", seven);
            intent.putExtra("resourseInt", R.drawable.borhani);
            startActivity(intent);
        }
        if (view == btnEight){
            Intent intent = new Intent(Panio.this, ContentActivity.class);
            intent.putExtra("Data", eight);
            intent.putExtra("resourseInt", R.drawable.chirer_lachi);
            startActivity(intent);
        }
        if (view == btnNine){
            Intent intent = new Intent(Panio.this, ContentActivity.class);
            intent.putExtra("Data", nine);
            intent.putExtra("resourseInt", R.drawable.amdoyer_sorbot);
            startActivity(intent);
        }
        if (view == btnTen){
            Intent intent = new Intent(Panio.this, ContentActivity.class);
            intent.putExtra("Data", ten);
            intent.putExtra("resourseInt", R.drawable.pearar_sorbot);
            startActivity(intent);
        }

    }
}

