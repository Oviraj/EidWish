package ingeniumbd.com.eidwish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nasta extends AppCompatActivity implements View.OnClickListener{

    private Button btnOne,btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnTen;
    String one = "উপকরণ: আপেল ২টি, বড় সাগর কলা ২টি, পাকা পেয়ারা ২টি, পাকা আম ২টি, আনারস টুকরা অর্ধেকটি, সবুজ আঙুর আধা কাপ, লাল আঙুর আধা কাপ, মাল্টা ২টি, সাদা গোলমরিচ গুঁড়া ১ চা-চামচ, বিট লবণ আধা চা-চামচ, চিনি ২ টেবিল-চামচ, লেবুর রস ১ টেবিল-চামচ, সালাদ ড্রেসিং ২ টেবিল-চামচ, লবণ আধা চা-চামচ বা পরিমাণমতো। সব ফল টুকরা করে কাটতে হবে। ইচ্ছামতো ফল ব্যবহার করা যায়।\n" +
            "প্রণালি: গোলমরিচ গুঁড়া, বিট লবণ, চিনি, সালাদ ড্রেসিং ও লেবুর রস একসঙ্গে মিশিয়ে সব ফলের টুকরা দিয়ে মাখিয়ে রেফ্রিজারেটরে রেখে ঠান্ডা ককটেল পরিবেশন করতে হবে।\n";
    String two= "উপকরণ: কাঁচা মাষকলাই ডাল আধা কাপ, চিনি ২ টেবিল-চামচ, টক দই ৪ কাপ, সাদা গোলমরিচ গুঁড়া ১ চা-চামচ, জিরা টালা গুঁড়া ১ চা-চামচ, ধনে টালা গুঁড়া ১ চা-চামচ, মরিচ টালা গুঁড়া ১ চা-চামচ, লবণ পরিমাণমতো, বিট লবণ ১ চা-চামচ, পুদিনাপাতা বা ধনেপাতা কুচি ২ টেবিল-চামচ।\n" +
            "প্রণালি: ডাল ৭-৮ ঘণ্টা ভিজিয়ে রেখে মিহি করে বেটে নিতে হবে। অল্প পানি দিয়ে ডাল খুব ভালো করে ফেটাতে হবে। গামলায় ৬-৭ কাপ পানিতে ১ টেবিল চামচ লবণ গুলিয়ে রাখতে হবে। কড়াইয়ে দুই কাপ তেল গরম করে চ্যাপটা আকারে বড়া ভাজতে হবে। বড়া ভাজা হলে তেল থেকে তুলে লবণ পানিতে ছাড়তে হবে। ঘন দই হলে সামান্য পানি দিয়ে ফেটিয়ে লবণ, চিনি দিয়ে কিছুটা গুঁড়া মসলা মেশাতে হবে। বড়া পানি থেকে নিংড়ে নিয়ে দইয়ে ডুবাতে হবে। দই বড়ার ওপরে পুদিনাপাতা কুচি ও বাকি গুঁড়া মসলা ছিটিয়ে রেফ্রিজারেটরে রেখে ঠান্ডা দই বড়া ৫-৬ দিন ধরে পরিবেশন করা যায়।\n";
    String three= "উপকরণ : গাজর ১০০ গ্রাম, বরবটি ১০০ গ্রাম, আলু ৫০ গ্রাম, কাটা কলা ১০০ গ্রাম, বেসন ৫০ গ্রাম, তেল ২০০ গ্রাম, কর্নফ্লাওয়ার ২০ গ্রাম, লবণ পরিমাণ মত, ডিম ৩টা, বিস্কুটের গুঁড়ো ১০০ গ্রাম।\n" +
            "প্রণালী : একটি বাটিতে গাজর, বরবটি, লালশাক, পুই শাক, আলু কাটা কলা সেদ্ধ একত্রে চটকে নিন। চটকানো সবজির সাথে বেসন কর্নফ্লাওয়ার লবণ দিয়ে মাখিয়ে চপের মত করে শেপ করে নিন। ডিম ফেটে চপ ডিমে ডুবিয়ে বিস্কুটের গুঁড়োতে গড়িয়ে বাদামি করে এপিঠ ওপিঠ ভেজে তুলুন। সুন্দর করে গাজরে ফুল দিয়ে সাজিয়ে, টমেটো সসের সাথে ইফতারির টেবিলে গরম গরম পরিবেশন করুন।\n";
    String four= "উপকরণ : মাশরুম ৫টি, গাজর ১টি, পালংশাক ৬টি পাতা, ক্যাপসিকাম অর্ধেকটা, রসুনের কোয়া ৩টি, ভিনেগার ১ টেবিল চামচ, লালমরিচ ১টি, তেল ১টেবিল চামচ, ভেজিটেবল স্টক ৩ কাপ, লুডলস্ ৪০ গ্রাম, গোল মরিচ গুঁড়ো হাফ চা চামচ, লবণ পরিমাণ মতো।\n" +
            "যেভাবে রান্না করবেন : মাশরুম ধুয়ে াইস করে নিন। গাজর ধুয়ে কুচি করে নিন। পালং শাক ধুয়ে কুচি করে নিন। ক্যাপসিকাম পাতলা করে ফালি করে নিন। রসুন বেটে নিন। লাল মরিচের বীচি এবং ভেতরটা বের করে নিন। প্যানে তেল গরম করুন। রসুন ছেড়ে দিয়ে খানিক নাড়ুন। মাশরুম, গাজর, ক্যাপসিকাম দিয়ে দুই মিনিট নেড়ে ভেজিটেবল স্টক এবং লাল মরিচ দিয়ে নাড়তে থাকুন। মিশ্রণটি ফুটতে থাকলে সস দিন। তাপ কমিয়ে ৩-৪ মি: রাখুন। এরপর লবণ, মরিচ গুঁড়ো, শাক দিয়ে অল্প কিছুক্ষণ রেখে নামিয়ে নিন। গাজর, ক্যাপসিকাম দিয়ে সাজিয়ে পরিবেশন করুন।\n";
    String five= "উপকরণ: ময়দা ৩ কাপ, গুঁড়ো দুধ ৩ টেবিল-চামচ, বাটার অয়েল ৪ টেবিল-চামচ, লবণ আধা চা-চামচ, চিনি ১ টেবিল-চামচ, কুসুম গরম পানি প্রয়োজনমতো, তেল ভাজার জন্য।\n" +
            "প্রণালি: ময়দা, গুঁড়ো দুধ, চিনি বাটার অয়েল লবণ দিয়ে ভালো করে মাখিয়ে নিতে হবে। কুসুম গরম পানি দিয়ে ময়দা মাখিয়ে নিতে হবে। ময়দা যখন নরম হবে তা থেকে ১০টি লেচি কেটে নিতে হবে। ছোট ছোট রুটি বানিয়ে তাতে তেল ও শুকনো ময়দা ছিটিয়ে রোল করে নিন। পরে ছোট পরোটা/লুচি আকারে বেলে তেল দিয়ে ভেজে নিন।\n";
    String six= "উপকরণ: ক. চিকেন কিমা ১ কাপ, গাজরকুচি ২ টেবিল-চামচ, পেঁয়াজকুচি ১ কাপ, রসুনবাটা ১ টেবিল-চামচ, কাঁচা মরিচ কুচি ১ টেবিল-চামচ, হলুদগুঁড়া আধা টেবিল-চামচ, টমেটো সস ১ টেবিল-চামচ, লবণ স্বাদমতো, তেল ভাজার জন্য যতটুকু লাগে। খ. প্যান কেক তৈরি করতে লাগবে ময়দা ১ কাপ, আতপ চালের গুঁড়া ১ কাপ, ডিম ১টি, লবণ পরিমাণমতো এবং প্রয়োজনমতো পানি। গ. ভাজার জন্য টোস্টের গুঁড়া ১ কাপ, ফেটানো ডিম ১টি, তেল ভাজার জন্য পরিমাণমতো।\n" +
            "প্রণালি: ক. উপকরণগুলো দিয়ে একটি পুর তৈরি করে নিতে হবে। খ. উপকরণ দিয়ে একটি মিশ্রণ তৈরি করতে হবে। ফ্রাই প্যানে সামান্য তেল দিয়ে এক হাতা করে গোলা ছড়িয়ে দিতে হবে। মাঝখানে পুর দিয়ে রোল তৈরি করতে হবে। গ. উপকরণ দিয়ে ফেটানো ডিম দিয়ে টোস্টের গুঁড়া মেখে ডুবো তেলে বাদামি রং করে ভেজে পরিবেশন করুন।\n";
    String seven= "উপকরণঃ পুরির জন্যঃ ময়দা ২ কাপ, লবণ সামান্য, বেকিং পাউডার আধা চা চামচ, তেল ভাজার জন্য।\n" +
            "পুরের জন্যঃ আলু সেদ্ধ আধা কাপ, মটর ডাল সেদ্ধ ১ কাপ, কাঁচা মরিচ কুচি আধা চা চামচ, ধনেপাতা কুচি ১ টেবিল চামচ, পেঁয়াজ কুচি ১ টেবিল চামচ, তেঁতুলের সস ১ টেবিল চামচ, চিনি ১ চা চামচ, চটপটি মসলা ১ চা চামচ, ভাজা জিরার গুঁড়া আধা চা চামচ, শসা কুচি ১ কাপ, লবণ স্বাদমতো, বিটলবণ সামান্য।\n" +
            "প্রণালীঃ পুরের উপকরণগুলো ভালো করে মেখে একটি পুর তৈরি করুন। এবার পুরির উপকরণ থেকে ময়দা, বেকিং পাউডার ও লবণ একসঙ্গে মিশিয়ে চালুনিতে চেলে নিন। ১ টেবিল চামচ তেল গরম করে ময়দার সঙ্গে ভালো করে মেখে নিন। প্রয়োজনমতো পানি দিয়ে ময়দা মেখে লেচি কেটে নিন। পছন্দমতো আকারে পুরি তৈরি করে ডুবোতেলে ভেজে তুলুন। প্রতিটি পুরি অর্ধেক করে কেটে এতে পুর ভরে দিন। তারপর শসা কুচি ও বিটলবণ দিন। ইফতারের সময় গরম গরম পরিবেশন করুন মজাদার ভেলপুরি।\n";
    String eight= "উপকরণ: ৬টি ডিম, ১টি নারকেলের দুধ, আদা বাটা, রসুন বাটা, পোস্তদানা, কাঁচামরিচ, পেঁয়াজ কুচি, আধা কাপ খাবার তেল।\n" +
            "প্রসু্ততপ্রণালী: গরম কড়াইয়ে তেল দিয়ে পেঁয়াজ কুচি, আদা, রসুনসহ অন্যান্য মসলা দিয়ে দেব। সঙ্গে পরিমাণমতো লবণ। তারপর নারকেল দুধটা দিয়ে দেব কড়াইয়ে। এবার চামচ দিয়ে নাড়তে হবে কিছুক্ষণ।\n" +
            "এদিকে ৬টি ডিম সেদ্ধ করে সেগুলো থেকে প্রথমে কুসুম ছাড়িয়ে নিতে হবে। তারপর সাদা অংশটুকু শিল-পাটায় বেটে নিতে হবে। একপর্যায়ে কুসুমও সাদা বাটার সঙ্গে মিশিয়ে বেটে নিতে হবে। এরপর দুই হাতে একটু তেল মেখে নিয়ে ডিম বাটার অংশ নিয়ে ছোট ছোট বল বানাতে হবে। এ বলগুলো ফ্রাইপ্যানে নিয়ে সামান্য তেলের মধ্যে ভেজে নিতে হবে। তারপর কষানো মসলায় ডিমের বলগুলো ছেড়ে দিই। কিছুক্ষণ চুলোয় রেখে ডিম বল চুলো থেকে নামিয়ে ফেলি। মুখে দিলেই দারুণ এক স্বাদ পাওয়া যাবে ডিম বলের।\n";
    String nine= "উপকরণ: ডাঁটাসহ সাত-আটটি পুঁইপাতা। গোলমরিচ, মাখানো বেসন, চিংড়ি, পরিমাণমতো তেল ও লবণ।\n" +
            "প্রস্তুতপ্রণালী: পুঁইপাতায় চিংড়ি দিয়ে পানের খিলির মতো বানিয়ে টুথ-পিক দিয়ে তা আটকে দিয়ে বেসনে মাখিয়ে গরম তেলের মধ্যে ছেড়ে দিই। যখন ভাজাভাজা হয়ে আসবে, তখন তেল থেকে তুলে আনি। হয়ে গেল পুঁইপাতা পানখিলি।\n";
    String ten= "উপকরণ : সুজি ১ কাপ, বেকিং পাউডার আধা চা চামচ, পেঁয়াজ কুচি আধা কাপ, কাঁচামরিচ কুচি ১ টেবিল চামচ, লবণ পরিমাণমতো, চিনি ১ চা চামচ, স্বাদ লবণ (টেস্টিং সল্ট) আধা চা চামচ, ডিম ১টি, কালিজিরা সিকি চা চামচ, পানি আধাকাপ, মটরশুঁটি।";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasta);
        btnOne = (Button) findViewById(R.id.btnFrute);
        btnTwo = (Button) findViewById(R.id.btnBora);
        btnThree = (Button) findViewById(R.id.btnChop);
        btnFour = (Button) findViewById(R.id.btnNuduls);
        btnFive = (Button) findViewById(R.id.btnMini);
        btnSix = (Button) findViewById(R.id.btnRol);
        btnSeven = (Button) findViewById(R.id.btnVelpuri);
        btnEight = (Button) findViewById(R.id.btnDimbol);
        btnNine = (Button) findViewById(R.id.btnPuipata);
        btnTen = (Button) findViewById(R.id.btnPakora);
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
            Intent intent = new Intent(Nasta.this, ContentActivity.class);
            intent.putExtra("Data", one);
            intent.putExtra("resourseInt", R.drawable.frout_coctel);
            startActivity(intent);

        }
        if (view == btnTwo){
            Intent intent = new Intent(Nasta.this, ContentActivity.class);
            intent.putExtra("Data", two);
            intent.putExtra("resourseInt", R.drawable.doi_bora);
            startActivity(intent);
        }
        if (view == btnThree){
            Intent intent = new Intent(Nasta.this, ContentActivity.class);
            intent.putExtra("Data", three);
            intent.putExtra("resourseInt", R.drawable.sobji_cop);
            startActivity(intent);
        }
        if (view == btnFour){
            Intent intent = new Intent(Nasta.this, ContentActivity.class);
            intent.putExtra("Data", four);
            intent.putExtra("resourseInt", R.drawable.noodles);
            startActivity(intent);
        }
        if (view == btnFive){
            Intent intent = new Intent(Nasta.this, ContentActivity.class);
            intent.putExtra("Data", five);
            intent.putExtra("resourseInt", R.drawable.mini);
            startActivity(intent);
        }
        if (view == btnSix){
            Intent intent = new Intent(Nasta.this, ContentActivity.class);
            intent.putExtra("Data", six);
            intent.putExtra("resourseInt", R.drawable.vgtbl_roll);
            startActivity(intent);
        }
        if (view == btnSeven){
            Intent intent = new Intent(Nasta.this, ContentActivity.class);
            intent.putExtra("Data", seven);
            intent.putExtra("resourseInt", R.drawable.velpuri);
            startActivity(intent);
        }
        if (view == btnEight){
            Intent intent = new Intent(Nasta.this, ContentActivity.class);
            intent.putExtra("Data", eight);
            intent.putExtra("resourseInt", R.drawable.dim_bol);
            startActivity(intent);
        }
        if (view == btnNine){
            Intent intent = new Intent(Nasta.this, ContentActivity.class);
            intent.putExtra("Data", nine);
            intent.putExtra("resourseInt", R.drawable.puipata);
            startActivity(intent);
        }
        if (view == btnTen){
            Intent intent = new Intent(Nasta.this, ContentActivity.class);
            intent.putExtra("Data", ten);
            intent.putExtra("resourseInt", R.drawable.pakura);
            startActivity(intent);
        }

    }
}

