package ingeniumbd.com.eidwish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mach extends AppCompatActivity implements View.OnClickListener{

    private Button btnOne,btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnTen;
    String one = "উপকরণঃ ইলিশ মাছ ১টি, কাঁচামরিচ ৪টি, আলু মাঝারি ২ টী, টোষ্টের গুঁড়া ১ কাপ, সবুজ লেবু ১টি, সয়াবিন তেল ১/৪ চা চামচ, লেমন রাইন্ড ১ চা চামচ, লবন ২ চা চামচ, লেবুর রস ১ টেবিল চামচ, টমেটো সস ২ তেবিল চামচ, পেঁয়াজ ৬টি, গোলমরিচ ১/২ চা চামচ। \n" +
            " ১। ইলিশ মাছের আঁশ ছাড়িয়ে ধুয়ে নাও। মাথার সঙ্গে মাঝের কাঁটা রেখে ছুরি দিয়ে দু’পিঠের মাছ আস্ত তুলে নাও। প্রথমে ছুরি দিয়ে মাথার সঙ্গে লাগিয়ে মাছ অল্প কাট যেন মাছের কাঁটা না কাটে। তারপর ছুরির চোখা আগা দিয়ে বুক চিরে মাছের তেল বের করে মাছ ধুয়ে নাও। এবার ট্রে বা রুটি বেলার পিঁড়ির উপর মাছ রেখে ছুরি দিয়ে মাঝের কাঁটা থেকে দু’পিঠের মাছ তুলে নাও।\n" +
            "২। কাঁটাসহ মাছের মাথা বড় হাঁড়িতে নিয়ে অল্প সিদ্ধ করে রাখ। বেকিং ট্রেতে মাথাসহ মাছের কাঁটাও সামান্য পানি দিয়ে ওভেনেও সিদ্ধ করা যায়।\n" +
            "৩। অল্প পানি দিয়ে মাছ সিদ্ধ কর। মাছ সিদ্ধ হলে ফুলকো ইলিশের রেসিপির ৪নং পদ্ধতিতে মাছের কাঁটা বের করে মাছ কিমা করে নাও।\n" +
            "৪। আলু সিদ্ধ করে চটকে রাখ।\n" +
            "৫। একটি সবুজ রঙের লেবু গোল এবং পাতলা স্লাইস করে কেটে রাখ। সবজি কুরুনিতে আর একটি লেবুর  খোসার সবুজ অংশ ঝুরি করে লেমন রাইগু নাও। লেমন রাইগু নেয়ার পর লেবুর রস বের করে রাখ। পেঁয়াজ ও কাঁচামরিচ কুচি কর।\n" +
            "৬। দু’ টেবিল চামচ তেলে টোস্টের গুঁড়া হাল্কা ভেজে রাখ। কড়াইয়ে বাকি তেল দাও। পেঁয়াজ ও কাঁচামরিচ ভেজে তোল। তেলে চটকানো আলু দিয়ে ভাজ। পেঁয়াজের বেরেস্তা গুঁড়া করে অর্ধেকটা আলুতে দাও।\n" +
            "৭। আলু তুলে রেখে কড়াইয়ে আরও ১টে.চামচ তেল দিয়ে মাছের কিমা,টমেটো সস,গোলমরিচ ও লবণ দিয়ে ৪-৫ মিনিট ভাজ। ভাজা হলে বাকি বেরেস্তা ও কাঁচামরিচ দিয়ে নেড়ে আলুৃ দাও। সামান্য ভেজে নামাও।\n" +
            "৮। গরম মাছে চারভাগের তিনভাগ গরম বিস্কুটের গুঁড়া মিশাও।\n" +
            "৯। পরিবেশনের জন্য বড় ভাতের ডিস নাও। কাঁটসহ মাছের মাথা ডিসের মাঝে লম্বায় বিছিয়ে রাখ। গরম মাছ কাঁটার উপর ঠিক ইলিশ মাছের আকারে বিছিয়ে দাও। উপরে বাকি গরম টোস্টের গুঁড়া ছিটিয়ে দিয়ে মাছ ঢেকে দাও। হাত দিয়ে বিস্কুটের গুঁড়া সমান করে দাও। চামচের ডাট দিয়ে মাছের উপরে আঁশের মত দাগ কেটে কাবাব ইলিশের মাঝখানে লম্বায় লেবুর স্লাইস দিয়ে সাজিয়ে পরিবেশন কর। কাবাব ইলিশের দু’পাশে পটেটো চিপস অথবা রোস্ট পটেটো বা মাখনে সিদ্ধ সবজি দিয়ে পরিবেশন করা যায়। লেবু দিয়ে সাজাবার আগে কাবাব ইলিশ ওভেনে ১৯০º সেঃ(৩৭৫º ফাঃ) তাপে ২০-২৫ মিনিট বেক করে নেয়া যায়।\n";
    String two= "উপকরণঃ মাছ ১ কেজি, রসুন বাটা ১/৪ চা চামচ, লেবু ১টি, আদা বাটা ১/৪ চা চামচ, পেঁয়াজ ৪টি,তেল ২ চা চামচ, কাঁচামরিচ ৮টি, টমেটো সস ২ চা চামচ, টমেটো ৩ টি, ঊষ্টার সস ২ চা চামচ, মরিচ বাটা ১/৪ চা চামচ, লবন ১/২ চা চামচ, সরিষা বাটা ১/৪ চা চামচ, কাঠি ৯ সে মি লম্বা ১০-১২টি ।\n" +
            " ১। যে কোন বড় মাছের পিঠের অংশ কাঁটা ছাড়িয়ে ২ সে. মি.চৌকো টুকরা কর। ধুয়ে লেবুর রস ও লবণ মাখিয়ে ১০ মিনিট ভিজিয়ে রাখ।\n" +
            "২। পেঁয়াজ লম্বায় দু’ টুকরা করে ভাঁজ ছাড়িয়ে রাখ। কাঁচামরিচ লম্বায় দু’ভাগ কর। টমেটোর বীচি ফেলে পেঁয়াজের সমান টুকরা কর।\n" +
            "৩। অন্যান্য বাটা মসলা,তেল সস ও লবণ একসাথে মিশাও। মাছ দিয়ে মাখিয়ে ১০-১৫ মিনিট রাখ।\n" +
            "৪। কাঠিতে মাছ,পেঁয়াজ,টমেটো মরিচ পর পর গেঁথে যাও। ১০-১২ টি কাঠিতে মাছ গাঁথ।\n" +
            "৫। ফ্রাইপ্যানে সেকা তেলে ভাজ। গরম পরিবেশন কর।\n";
    String three= "উপকরণঃ মাছ সিদ্ধ কিমা ২ কাপ, লবন ইচ্ছামত, সবজি কুচি ২টেবিল চামচ, গোলমরিচ গুঁড়া ১/৪ কাপ, পেয়াজ কুচি ১ টেবিল চামচ, ডিম ২ টা, মাখন বা ঘি ২ টেবিল চামচ, দুধ ১ কাপ। \n" +
            " ১। ওভেনে ১৮০সেঃ তাপ দাও।\n" +
            "২। ঘিয়ে পেঁয়াজ ও সবজি ভাজ। ভাজা সবজি, মাছ, রুটি, লবণ ও গোলমরিচ একসঙ্গে মিশাও।\n" +
            "৩। ডিমের সাদা জমাট করে ফেট।\n" +
            "৪। ডিমের কুসুম ফেটে দুধের সঙ্গে মিশাও। মাছ  ও লেবুর রস দিয়ে মিশাও।\n" +
            "৫। ডিমের সাদা অংশ দিয়ে ভাঁজে ভাঁজে মিশাও। ঘি মাখানো পাত্রে ঢেলে এক ঘন্টা বেক কর। ওভেন থেকে নামিয়েই পরিবেশন কর।\n" +
            "\n" +
            "রসনা তৃপ্তিতে বাঙালির চাই মাছ। আর নিত্যকার রান্নার চেয়ে একটু ভিন্নস্বাদ পেলে তো কথাই নেই। \n";
    String four= "উপকরণ: রুই মাছ ৫-৬ টুকরা, লবঙ্গ ৪-৫টি, তেজপাতা ১টি, নারকেলের দুধ ঘন ১ কাপ, পেঁয়াজ মোটা করে কাটা ৭-৮টি, কাঁচা মরিচ ৫-৬টি, ময়দা ১ টেবিল-চামচ, চিনি ১ চা-চামচ, ঘি ১ টেবিল-চামচ, লবণ স্বাদমতো, লেবুর রস ২ টেবিল-চামচ, তেল প্রয়োজনমতো।\n" +
            "প্রণালি: মাছ কেটে ধুয়ে লবণ ও লেবুর রস মাখিয়ে রাখতে হবে ৫ মিনিট। এরপর মাছ হালকা বাদামি করে ভেজে তুলে রাখতে হবে। কড়াইতে ৪ টেবিল-চামচ তেল দিয়ে লবঙ্গ ও তেজপাতার ফোড়ন দিতে হবে। পেঁয়াজ হালকা করে ভেজে চিনি ও ময়দা দিয়ে আরও একটু ভাজতে হবে। নারকেলের দুধ ও কাঁচা মরিচ দিয়ে অপেক্ষা করতে হবে। ফুটে উঠলে মাছগুলো দিয়ে প্রয়োজন হলে আধা কাপ পানিও দেওয়া যেতে পারে। ঝোল ঘন হলে ঘি দিয়ে পরিবেশন করা যায়।\n";
    String five= "উপকরণ: পাবদা মাছ ৭-৮টি, লেবুর রস ১ টেবিল-চামচ, লেবুপাতা ২টি (সরু সরু করে কুচি করা), পেঁয়াজ বাটা ২ টেবিল-চামচ, রসুন বাটা ১ চা-চামচ, জিরা বাটা আধা চা-চামচ, মরিচ গুঁড়া আধা চা-চামচ, হলুদ গুঁড়া আধা চা-চামচ, লবণ স্বাদমতো, তেল প্রয়োজনমতো।\n" +
            "প্রণালি: পাবদা মাছ কেটে ও ধুয়ে পানি ঝরিয়ে রাখতে হবে। এরপর কড়াইয়ে তেল দিয়ে পেঁয়াজ, রসুন, জিরা, হলুদ, মরিচ, লবণ ও সামান্য পানি দিয়ে একটু মসলা কষিয়ে নিতে হবে। মসলা কষানো হলে পাবদা মাছগুলো দিয়ে একটু নেড়ে ১ কাপ গরম পানি দিয়ে ঢেকে দিতে হবে। মাছ মাখামাখা হলে তাতে লেবুর রস ও লেবুপাতা কুচি ছড়িয়ে দিয়ে নামিয়ে নিতে হবে মজাদার লেবু-পাবদা মাছ।\n";
    String six= "উপকরণ: কই মাছ ৪টি, ২টি কাঁচা মরিচসহ সরষে বাটা ১ টেবিল-চামচ, নারকেল বাটা ১ টেবিল-চামচ, রসুন বাটা ১ চা-চামচ, পেঁয়াজ ১ টেবিল-চামচ, মরিচ গুঁড়া সামান্য, হলুদ গুঁড়া আধা চা-চামচ, জিরা বাটা আধা চা-চামচ, কাঁচা মরিচ ৪টি, লাউপাতা বড় ৪টি, লবণ স্বাদমতো, সরষের তেল প্রয়োজনমতো, সুতা পরিমাণমতো।\n" +
            "প্রণালি: প্রথমে কই মাছ কেটে ভালো করে ধুয়ে পরিষ্কার করে নিতে হবে। লাউপাতা ও সুতা ছাড়া তেলসহ সব মসলা একসঙ্গে মাখিয়ে কই মাছ ১৫ মিনিট ম্যারিনেট করে রাখতে হবে। ৪টি বড় লাউপাতায় একটি করে মাছ ও একটি করে কাঁচা মরিচ দিয়ে ভালো করে মুড়িয়ে সুতা দিয়ে পেঁচিয়ে বেঁধে নিতে হবে। প্রতিটি মাছ বাঁধা হলে সসপ্যানে মাছের সমান করে পানি দিয়ে সেদ্ধ করতে হবে। পানি শুকিয়ে এলে পাঁচ মিনিট পর তা নামিয়ে সুতা খুলে গরম ভাতের সঙ্গে পরিবেশন করা যায় মজাদার কই মাছের পাতুরি।\n";
    String seven= "উপকরণ: কাতলা মাছ ৫ টুকরা, পেঁয়াজ বাটা ২ টেবিল-চামচ, আদা-রসুন বাটা ১ চা-চামচ, জিরা বাটা আধা চা-চামচ, ধনেগুঁড়া আধা চা-চামচ, মরিচ গুঁড়া আধা চা-চামচ, গরম মসলা গুঁড়া আধা চা-চামচ, কাজু বাদাম বাটা ১৪-১৫টি, টমেটো সস ২ টেবিল-চামচ, ময়দা ১ টেবিল-চামচ, ফেটানো ডিম অর্ধেকটা, আলু ডুমো করে কাটা ২টি (মাঝারি), কাঁচা মরিচ ফালি ৪-৫টি, লবণ স্বাদমতো, ঘি বা তেল প্রয়োজনমতো।\n" +
            "প্রণালি: কাতলা মাছ কেটে ও ধুয়ে তাতে হলুদ, মরিচ, আদা-রসুন বাটা, লবণ, ময়দা ও ফেটানো ডিম দিয়ে মাখিয়ে রাখতে হবে ৫ মিনিট। তারপর মাছগুলো ডুবোতেলে ভেজে তুলে রাখতে হবে। আলুগুলো মসলা মাখিয়ে ভেজে রাখতে হবে।\n" +
            "কড়াইয়ে ২ টেবিল-চামচ তেল ও ১ টেবিল-চামচ ঘি দিয়ে তাতে পেঁয়াজ বাটা, আদা-রসুন বাটা, জিরা বাটা, ধনে গুঁড়া, কাজু বাদাম বাটা, টমেটো সস দিয়ে কষিয়ে নিতে হবে। মসলা কষানো হলে ১ কাপ দুধ বা পানি দিয়ে তাতে ভাজা মাছ ও ভাজা আলু দিতে হবে। তেল ওপরে উঠে এলে গরম মসলা গুঁড়া ও কাঁচা মরিচ ছড়িয়ে দিয়ে নামিয়ে নিতে হবে।\n";
    String eight= "উপকরণঃ মাছ বাটা ১ কাপ, জিরা বাটা ১/২ চা চামচ, ভাত বাটা ১/২ কাপ, কাঁচামরিচ বাটা ১/২ চা চামচ, আদা বাতা ১/২ চা চামচ, এলাচ বাটা ২টি, রসুন বাটা ১/২ চা চামচ, দারচিনি বাটা ১/৮ চা চামচ, মরিচ বাটা ১/২ চা চামচ, ধনেপাতা কুচি ১ টেবিল চামচ, ধনে বাটা ১/২ চা চামচ, লবন ১ টেবিল চামচ, \n" +
            " ১। চিতল,ফলি অথবা অন্য বড় মাছের চামড়া ও কাঁটা ছাড়িয়ে মাছ বেটে নাও। ভাত ও লবণ দিয়ে বাট। বাটা মাছ ও অন্যান্য সব উপকরণ একসঙ্গে মিশাও। দশ ভাগ কর। গোল কোফতা তৈরি করে ডুবো তেলে ভাজ। চিতল ও বড় ফলি মাছ চামড়ায় মুড়ে ভাজা যায়। ভাজার পর স্লাইস করে কেটে পরিবেশন কর।\n" +
            " \n" +
            "মাছের কোফতা কারিঃ কোফতা কারি রান্না করতে হলে তেলে হলুদ,মরিচ,পেঁয়াজ,আদা,জিরা ও ধনে বাটা দিয়ে মসলা কষাতে হবে। মসলা কষাণ হলে কোফতা ও ধনেপাতা কুচি দিয়ে নামাতে হবে।\n";
    String nine= "উপকরণঃ মাছ ১ কেজি, পেঁয়াজ স্লাইস ১৩/৪ কাপ, হুলুদ বাটা ১/২ চা চামচ, লবন ১ চা চামচ, শুকনা মরিচ ৬টি, তেল ৩/৪ কাপ, তেঁতুল ছড়া ২ টি, মেথি ১/২ চা চামচ। \n" +
            " ১। শোল, গজার, রুই, কাতল যে কোন বড় মাছ চাক চাক করে টুকরা কর।\n" +
            "২। পেঁয়াজ মোটা স্লাইস করে কেটে হলুদ, লবন মাখাও। তার সাথে মাছ মাখাও।\n" +
            "৩। তেলে মেথির ফোড়ন দিয়ে মাছ ছাড়। মরিচ দিয়ে আস্তে আস্তে নেড়ে ঢেকে দাও। খুব মৃদু আঁচে রান্না কর। একবার মাছ উল্টে দাও।\n" +
            "৪। প্রায় আধ ঘন্টা বা এক ঘন্টা পরে যখন পানি শুকাতে আরম্ভ করবে তখন তেঁতুলের ছড়া ধুয়ে দাও।  ঢেকে মৃদু আঁচে রাখ।\n" +
            "৫। পানি শুকিয়ে তেলের উপর উঠলে নামাও।\n";
    String ten= " উপকরণঃ মাছ ১ কেজি, দই ১/২ কাপ, পেঁয়াজ বাটা ১/২ কাপ, আদা বাটা ২ চা চামচ, রসুন বাটা ১ আ চামচ, লবন ২ চা চামচ, ঘি বা সয়াবিন তেল ৩/৪ কাপ, কাঁচামরিচ ৬টি, কেওড়া ২ টেবিল চামচ, হলুদ বাটা ১/২ চা চামচ, ধনে বাটা ১ তেবিল চামচ, চিনি ১ টেবিল চামচ, লেবুর রস ১ টেবিল চামচ, এলাচ ৬টি, জাফরাণ ইচ্ছামত। \n" +
            " ১। রুই, কাতলা, পাঙ্গাশ, আইড়, ইলিশ বা বড় বাইন মাছ টুকরা করে ধুয়ে নাও।\n" +
            "২। কাঁচামরিচ বাদে সব মসলা, ঘি, দই ও আধা কাপ পানি হাঁড়িতে একসাথে মিশিয়ে মাছ দিয়ে মিশাও। টক দই হলে চিনি দাও ও লেবু বাদ দাও।মিষ্টি দই হলে চিনি বাদ দাও বা নিজের রুচিমত লেবু  ও চিনি দুটোই দিতে পার। ঢাকনা দিয়ে মৃদু আঁচে রান্না কর। মাছ একবার উল্টে দাও। পানি শুকিয়ে গেলে কেওড়া, জাফরান ও কাঁচামরিচ দিয়ে ঢেকে আরও আধা ঘন্টা খুব মৃদু আঁচে রাখ।\n" +
            "৩। তেলের উপরে উঠলে নামাও। মাছের কোরমায়, কিসমিস, পেস্তা-বাদামও দেয়া যায়।\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mach);
        btnOne = (Button) findViewById(R.id.btnCubab);
        btnTwo = (Button) findViewById(R.id.btnSosoli);
        btnThree = (Button) findViewById(R.id.btnSufle);
        btnFour = (Button) findViewById(R.id.btnLobongo);
        btnFive = (Button) findViewById(R.id.btnPabda);
        btnSix = (Button) findViewById(R.id.btnPaturi);
        btnSeven = (Button) findViewById(R.id.btnKalia);
        btnEight = (Button) findViewById(R.id.btnKofta);
        btnNine = (Button) findViewById(R.id.btnKari);
        btnTen = (Button) findViewById(R.id.btnKorma);
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
            Intent intent = new Intent(Mach.this, ContentActivity.class);
            intent.putExtra("Data", one);
            intent.putExtra("resourseInt", R.drawable.cubab_elis);
            startActivity(intent);

        }
        if (view == btnTwo){
            Intent intent = new Intent(Mach.this, ContentActivity.class);
            intent.putExtra("Data", two);
            intent.putExtra("resourseInt", R.drawable.sasoli_mach);
            startActivity(intent);
        }
        if (view == btnThree){
            Intent intent = new Intent(Mach.this, ContentActivity.class);
            intent.putExtra("Data", three);
            intent.putExtra("resourseInt", R.drawable.fish_sufle);
            startActivity(intent);
        }
        if (view == btnFour){
            Intent intent = new Intent(Mach.this, ContentActivity.class);
            intent.putExtra("Data", four);
            intent.putExtra("resourseInt", R.drawable.lobongo_rui);
            startActivity(intent);
        }
        if (view == btnFive){
            Intent intent = new Intent(Mach.this, ContentActivity.class);
            intent.putExtra("Data", five);
            intent.putExtra("resourseInt", R.drawable.lebu_pabda);
            startActivity(intent);
        }
        if (view == btnSix){
            Intent intent = new Intent(Mach.this, ContentActivity.class);
            intent.putExtra("Data", six);
            intent.putExtra("resourseInt", R.drawable.koymacher_popta);
            startActivity(intent);
        }
        if (view == btnSeven){
            Intent intent = new Intent(Mach.this, ContentActivity.class);
            intent.putExtra("Data", seven);
            intent.putExtra("resourseInt", R.drawable.katlamacher_kalia);
            startActivity(intent);
        }
        if (view == btnEight){
            Intent intent = new Intent(Mach.this, ContentActivity.class);
            intent.putExtra("Data", eight);
            intent.putExtra("resourseInt", R.drawable.macher_kofta);
            startActivity(intent);
        }
        if (view == btnNine){
            Intent intent = new Intent(Mach.this, ContentActivity.class);
            intent.putExtra("Data", nine);
            intent.putExtra("resourseInt", R.drawable.methi_kari);
            startActivity(intent);
        }
        if (view == btnTen){
            Intent intent = new Intent(Mach.this, ContentActivity.class);
            intent.putExtra("Data", ten);
            intent.putExtra("resourseInt", R.drawable.macher_korma);
            startActivity(intent);
        }

    }
}
