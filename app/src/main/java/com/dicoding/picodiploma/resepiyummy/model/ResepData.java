package com.dicoding.picodiploma.resepiyummy.model;

import com.dicoding.picodiploma.resepiyummy.R;

import java.io.Serializable;
import java.util.ArrayList;

public class ResepData implements Serializable {
    private static String[] resepNames = {
            "Leker Surabaya",
            "Serabi",
            "Kue Pukis",
            "Pie Susu",
            "Brownies",
            "Kue Putri Salju",
            "Nastar",
            "Kue Cubit",
            "Bika Ambon",
            "Onde-Onde"
    };

    private static String[] resepDetails = {
            "Leker atau kue pisang Surabaya adalah salah satu Resep khas kota Surabaya.",
            "Serabi merupakan jajanan pasar tradisional yang berasal dari Indonesia.",
            "Kue ini dibuat dari adonan telur, gula pasir, tepung terigu, ragi dan santan.",
            "Pie Susu adalah Kue yang terbuat dari kulit kue kering dan isi yang beraneka ragam.",
            "Brownies merupakan sebuah Resep yang dipanggang berbentuk persegi.",
            "Sejenis kue kering yang berbentuk bulan sabit.",
            "Nastar adalah sejenis kue kering dari adonan tepung terigu, mentega dan telur.",
            "Kue cubit menggunakan campuran susu dan tepung terigu sebagai komponen utamanya.",
            "Bika ambon adalah sejenis penganan asal Medan, Indonesia.",
            "Onde-onde adalah sejenis kue jajanan pasar yang populer di Indonesia."
    };

    private static int[] resepImages = {
            R.drawable.leker,
            R.drawable.serabi,
            R.drawable.pukis,
            R.drawable.susu,
            R.drawable.brownies,
            R.drawable.putri,
            R.drawable.nastar,
            R.drawable.cubit,
            R.drawable.bika,
            R.drawable.onde
    };

    private static String[] resepBahan = {
            "1. Tepung terigu 200 gram\n" +
                    "\n" +
                    "2. Gula pasir 2 sendok makan\n" +
                    "\n" +
                    "3. Vanili bubuk siapkan secukupnya\n" +
                    "\n" +
                    "4. Garam 1 sendok teh\n" +
                    "\n" +
                    "5. Air siapkan secukupnya\n" +
                    "\n" +
                    "6. Telur 2 butir\n" +
                    "\n" +
                    "7. Pisang raja kemudian di iris bulat tipis\n" +
                    "\n" +
                    "8. Susu cokelat kental dan manis\n" +
                    "\n" +
                    "9. Meises coklat siapkan secukupnya\n" +
                    "\n" +
                    "10. Gula pasir 2 sendok makan",
            "1. Tepung beras sebanyak 200 gram\n" +
                    "\n" +
                    "2. Kelapa setengah tua sebanyak 150 gram, keruk dan parut kasar\n" +
                    "\n" +
                    "3. Santan kelapa sebanyak 500 ml dari ½ butir kelapa\n" +
                    "\n" +
                    "4. Air perasan daun suji sebanyak 50 ml, dibuat dari 10 lembar daun suji ditambah 50 ml air\n" +
                    "\n" +
                    "5. Garam halus sebanyak ½ sdt\n" +
                    "\n" +
                    "Bahan kuah kinca:\n" +
                    "\n" +
                    "\n" +
                    "   1. Gula merah sebanyak 120 gram, sisir halus\n" +
                    "\n" +
                    "   2. Santan kelapa kental sebanyak 100 ml\n" +
                    "\n" +
                    "   3. Daun pandan sebanyak 3 lembar, potong jadi 2 bagian\n" +
                    "\n" +
                    "   4. Garam halus sebanyak ½ sdt\n" +
                    "\n" +
                    "   5. Gula pasir sebanyak 20 gram\n",
            "1. 1 kg tepung terigu serba guna\n" +
                    "\n" +
                    "2. 300 gr margarin Blue Band Cake and Cookie\n" +
                    "\n" +
                    "3. 1,2 liter santan\n" +
                    "\n" +
                    "4. 10 butir telur\n" +
                    "\n" +
                    "5. 700 gr gula pasir\n" +
                    "\n" +
                    "6. 10 gr ragi instan\n" +
                    "\n" +
                    "7. 1 sdt garam\n" +
                    "\n" +
                    "8. Pasta pandan secukupnya\n" +
                    "\n" +
                    "9. Keju parut\n" +
                    "\n" +
                    "10. Meises cokelat",
            "1. 200 gr tepung terigu protein sedang\n" +
                    "\n" +
                    "2. 150 gr margarin Blue Band Cake and Cookie\n" +
                    "\n" +
                    "3. 1 sdm gula pasir\n" +
                    "\n" +
                    "4. Air es secukupnya\n" +
                    "\n" +
                    "5. 1 kaleng susu bubuk kental manis putih\n" +
                    "\n" +
                    "6. 5 butir telur ayam\n" +
                    "\n" +
                    "7. 500 ml air matang\n" +
                    "\n" +
                    "8. 4 sdm tepung maizena\n" +
                    "\n" +
                    "9. ¼ sdt bubuk vanila",
            "1. 7 sdm tepung terigu\n" +
                    "\n" +
                    "2. 1 sdm baking soda\n" +
                    "\n" +
                    "3. 2 sachet susu kental manis cokelat\n" +
                    "\n" +
                    "4. 6 sdm gula pasir- 6 sdm air hangat\n" +
                    "\n" +
                    "5. 6 sdm minyak goreng\n" +
                    "\n" +
                    "6. 3 saset minuman serbuk rasa cokelat Chocolatos (bisa diganti susu bubuk Milo atau cokelat bubuk)\n" +
                    "\n" +
                    "7. 2 butir telur",
            "1. 200 gram margarin\n" +
                    "\n" +
                    "2. 225 gram tepung terigu\n" +
                    "\n" +
                    "3. 30 gram susu bubuk\n" +
                    "\n" +
                    "4. 25 gram keju parut\n" +
                    "\n" +
                    "5. 1 butir kuning telur\n" +
                    "\n" +
                    "6. Gula halus secukupnya",
            "1. Tepung terigu 300 g\n" +
                    "\n" +
                    "2. Gula halus 90 g\n" +
                    "\n" +
                    "3. Kuning telur 4 butir\n" +
                    "\n" +
                    "4. Mentega 150 g\n" +
                    "\n" +
                    "5. Tepung maizena 50 g\n" +
                    "\n" +
                    "6. Margarin 100 g\n" +
                    "\n" +
                    "7. Susu bubuk 50 g\n" +
                    "\n" +
                    "8. Keju parut 175g, bagi 3 (25 g, 50 g, 100 g)\n" +
                    "\n" +
                    "9. Susu cair 1 sdm",
            "1.\tTepung terigu protein sedang 100 g, ayak\n" +
                    "\n" +
                    "2.\tGula pasir 100 g\n" +
                    "\n" +
                    "3.\tMargarin 100 g, cairkan\n" +
                    "\n" +
                    "4.\tBaking powder 1 sdt\n" +
                    "\n" +
                    "5.\tRagi 2 g\n" +
                    "\n" +
                    "6.\tTelur 3 butir\n" +
                    "\n" +
                    "7.\tVanili 1 sdt\n" +
                    "\n" +
                    "8.\tCetakan kue cubit\n" +
                    "\n" +
                    "9.\tMeses coklat\n" +
                    "\n" +
                    "10.\tKeju parut\n" +
                    "\n" +
                    "11.\tSusu kental manis 1 kaleng",
            "1. Santan 225 ml\n" +
                    "\n" +
                    "2. Daun Jeruk 5 lembar\n" +
                    "\n" +
                    "3. Serai 1 batang, memarkan\n" +
                    "\n" +
                    "4. Daun Pandan 1 lembar, simpulkan\n" +
                    "\n" +
                    "5. Garam 1/2 sdt\n" +
                    "\n" +
                    "6. Tepung terigu protein sedang 80 gr\n" +
                    "\n" +
                    "7. Tepung sagu 90 gr\n" +
                    "\n" +
                    "8. Ragi instan 1 sdt\n" +
                    "\n" +
                    "9. Telur ayam 4 butir\n" +
                    "\n" +
                    "10. Kuning telur ayam 2 butir\n" +
                    "\n" +
                    "11. Gula pasir 125 gr\n" +
                    "\n" +
                    "12. Blue Band Serbaguna 2 sdm, cairkan\n" +
                    "\n" +
                    "13. Blue Band Serbaguna 2 sdm, untuk olesan",
            "1.\t500 gram tepung beras ketan\n" +
                    "\n" +
                    "2.\t250 gram gula pasir\n" +
                    "\n" +
                    "3.\t75 gram tepung beras\n" +
                    "\n" +
                    "4.\t150 ml air hangat\n" +
                    "\n" +
                    "5.\tGaram (secukupnya, kira-kira 1 sdt)\n" +
                    "\n" +
                    "6.\tVanili bubuk (secukupnya, kira-kira 1 sdt)\n" +
                    "\n" +
                    "7.\t200 gram wijen\n" +
                    "\n" +
                    "8.\tMinyak goreng (secukupnya)\n" +
                    "\n" +
                    "9.\t250 gram kacang hijau kupas\n" +
                    "\n" +
                    "10.\t100 gram gula pasirGaram (secukupnya, kira-kira 1/2 sdt)\n" +
                    "\n" +
                    "11.\tVanili bubuk (secukupnya, kira-kira 1/2 sdt)"
    };

    private static String[] resepLangkah = {
            "1. Awal langkah ayak terigu ke dalam wadah yang cukup besar.\n" +
                    "\n" +
                    "2. Di samping itu kocok telur kemudian masukan kedalam wadah terigu.\n" +
                    "\n" +
                    "3. Berikutnya masukkan garam, vanili dan juga air ke dalamnya. Aduk sampai merata.\n" +
                    "\n" +
                    "4. Diamkan adonan sampai 20 menit.\n" +
                    "\n" +
                    "5. Kemudian siapkan wajan pipih lalu lumuri mentega dan nyalakan api kecil.\n" +
                    "\n" +
                    "6. Siapkan sendok sayur kemudian ambil adonan dan simpan di atas wajan.\n" +
                    "\n" +
                    "7. Buat adonan tersebut serupa dadar tipis dan masak sampai mengering.\n" +
                    "\n" +
                    "8. Selanjutnnya simpan bahan isi di tengahnya kemudian lipat dan balikkan supaya matag dengan sempurna.\n" +
                    "\n" +
                    "9.Angkat dan simpan di piring yang telah di siapkan.\n" +
                    "\n" +
                    "10. Selesai, kue leker crispy siap buat anda sajikan." ,
            "1. Pertama kita buat dahulu adonan kue serabinya. Siapkan wadah yang bersih dan berukuran cukup besar, masukan bahan-bahan seperti tepung terigu, kelapa parut, dan garam.  Aduk bahan hingga tercampur dengan merata.\n" +
                    "\n" +
                    "2. Tuangkan santan ke dalam campuran bahan kering tadi sedikit demi sedikit sambil diaduk.  Pastikan bahwa campuran bahan-bahan ini menjadi adonan yang cukup cair.\n" +
                    "\n" +
                    "3. Masukan air perasan daun suji, aduk kembali semua bahan hingga adonan berwarna hijau.\n" +
                    "\n" +
                    "4. Panaskan cetakan serabi, gunakan saja api sedang dan jika dirasa cetakan sudah panas, kecilkan api.\n" +
                    "\n" +
                    "5. Tuangkan 1 sendok sayur adonan serabi ke dalam cetakan tersebut, tutup dan masak sampai matang kira-kira 2 sampai 3 menit. Lakukan sampai semua adonan habis dan sisihkan.\n" +
                    "\n" +
                    "6. Sekarang untuk kuah kinca, siapkan panci bersih dan masukan santan serta daun pandang serta masak hingga mendidih.\n" +
                    "\n" +
                    "7. Tambahkan irisan gula merah, gula pasir dan sedikit garam, aduk rata rata dan masak hingga larut. Matikan api dan dinginkan.\n" +
                    "\n" +
                    "8. Siapkan piring saji, letakan beberapa kue serabi dan guyurkan kuah kinca. Kue serabi siap untuk dinikmati.",
            "1. Campur tepung terigu, gula pasir, ragi instan, dan garam. Aduk hingga merata.\n" +
                    "\n" +
                    "2. Masukkan telur dan margarin Blue Band Cake and Cookie ke dalam adonan. Kemudian aduk kembali.\n" +
                    "\n" +
                    "3. Tuang santan sedikit demi sedikit ke dalam adonan sembari terus diaduk. Jangan sampai ada bagian adonan yang menggumpal.\n" +
                    "\n" +
                    "4. Beri sedikit pasta pandan sampai warna hijaunya kelihatan pas dan tidak terlalu pekat. Aduk kembali sampai semua adonan berwarna hijau.\n" +
                    "\n" +
                    "5. Istirahatkan adonan selama kurang lebih 30 menit agar proses fermentasinya maksimal.\n" +
                    "\n" +
                    "6. Sebelum memanggang adonan kue, aduk terlebih dahulu agar kandungan udaranya hilang.\n" +
                    "\n" +
                    "7. Panaskan cetakan kue pukis dengan api kecil. Lalu oleskan dengan margarin Blue Band Cake and Cookie.\n" +
                    "\n" +
                    "8. Tuang adonan ke dalam cetakan hingga terisi ¾ penuh.\n" +
                    "\n" +
                    "9. Tutup cetakan dan tunggu hingga kue pukis mulai matang.\n" +
                    "\n" +
                    "10. Ketika pukis sudah ¾ matang, taburi dengan meises cokelat dan keju parut di atasnya. Lanjutkan memasak hingga matang.\n" +
                    "\n" +
                    "11. Kue pukis yang sudah matang pun siap diangkat dari cetakan dan disajikan dalam keadaan hangat.",
            "1. Mulai dengan membuat adonan kulit pie terlebih dahulu. Campur semua bahan kulit pie dalam satu wadah.\n" +
                    "\n" +
                    "2. Uleni adonan kulit pie hingga kalis dan tidak menempel di tangan.\n" +
                    "\n" +
                    "3. Setelah adonan kulit pie kalis, pipihkan dengan ketebalan 0,5 cm dan letakkan pada loyang pie. Usahakan agar ketebalan kulit pie merata sehingga adonan matang sempurna saat dipanggang.\n" +
                    "\n" +
                    "4. Selanjutnya, buat adonan isi pie susu sambil memanaskan oven dengan temperatur 180 derajat Celcius.\n" +
                    "\n" +
                    "5. Kocok telur ayam sambil dicampur dengan susu kental manis. Kemudian tuang air matang sedikit demi sedikit agar adonan tidak terlalu cair. Jangan lupa menambahkan bubuk vanila. Lalu aduk agar adonan isi pie susu tercampur merata.\n" +
                    "\n" +
                    "6. Tuang adonan isi pie ke atas adonan kulit di loyang pie.\n" +
                    "\n" +
                    "7. Panggang pie susu dengan api kecil selama kurang lebih 1 jam. Pastikan kalau bagian isi pie sudah matang sempurna ketika diangkat.\n" +
                    "\n" +
                    "8. Keluarkan pie susu yang sudah matang dari loyang. Diamkan sebentar agar uap panasnya hilang. Pie susu pun siap dipotong sesuai selera sebelum disajikan.",
            "1. Langkah awal kocok telur dengan gula pasir dengan whisk atau garpu sampai berbuih. Sisihkan.\n" +
                    "\n" +
                    "2. Di wadah lain, campur tepung terigu, susu kental manis, serbuk chocolatos dan baking soda lalu campurkan ke adonan telur.\n" +
                    "\n" +
                    "3. Kemudian tambahkan air hangat dan minyak goreng, aduk sampai adonan tercampur dengan baik dengan whisk. Jadi tidak perlu menggunakan mixer ya.\n" +
                    "\n" +
                    "4. Selanjutnya tuang adonan ke dalam loyang yang sebelumnya sudah di olesi sedikit minyak goreng.\n" +
                    "\n" +
                    "5. Lalu kukus selama 30 menit kedalam panci yang sudah mendidih airnya. Jangan lupa saat mengukus tutup panci di alasi lap atau serbet bersih untuk menyerap uap air agar tidak jatuh ke adonan.\n" +
                    "\n" +
                    "6. Boleh tes tusuk adonan dengan lidi atau ujung sendok, jika tidak ada adonan yang terbawa pertanda brownies sudah matang sempurna.\n" +
                    "\n" +
                    "7. Setelah matang, angkat dan beri topping sesuai selera.",
            "1. Langkah pertama, campurkan margarin, keju parut, dan kuning telur. Aduklah menggunakan spatula sampai rata.\n" +
                    "\n" +
                    "2. Tambahkan tepung serta susu bubuk dan aduk lagi sampai rata.\n" +
                    "\n" +
                    "3. Aduk kembali dengan spatula, lalu cetaklah sesuai selera di atas loyang yang sebelumnya sudah diolesi margarin. Pangganglah kurang lebih selama 30 menit.\n" +
                    "\n" +
                    "4. Setelah bagian bawahnya mulai berwarna kecoklatan, angkat dan dinginkan sebentar.\n" +
                    "\n" +
                    "5. Apabila sudah berkurang panasnya, taburkan gula halus pada seluruh permukaan kue putri salju secara merata.\n" +
                    "\n" +
                    "6. Sajikan di dalam toples cantik dengan hiasan kreatif sesuai selera.",
            "1.\tMasukkan mentega, margarin, dan gula halus ke dalam wadah. Kemudian kocok dengan mixer berkecepatan rendah. Kocok selama 2 menit saja.\n" +
                    "\n" +
                    "2.\tMasukkan 2 butir kuning telur satu per satu, kocok lagi.\n" +
                    "\n" +
                    "3.\tMasukkan tepung maizena, tepung terigu, dan susu bubuk di wadah lain. Campur hingga rata.\n" +
                    "\n" +
                    "4.\tTuang sedikit demi sedikit tepung yang sudah dicampur tadi ke dalam adonan pertama. Kocok dengan spatula hingga rata.\n" +
                    "\n" +
                    "5.\tTuang keju parut (50 g), aduk hingga rata.\n" +
                    "\n" +
                    "6.\tPotong keju parut (100 g) menjadi dadu-dadu kecil (1 cm).\n" +
                    "\n" +
                    "7.\tSetelah adonan jadi, bentuk adonan dengan bentuk bulatan.\n" +
                    "\n" +
                    "8.\tPipihkan sedikit lalu isi dengan keju parut yang sudah dibentuk menjadi dadu, bentuk bulat lagi.\n" +
                    "\n" +
                    "9.\tOleskan loyang dengan mentega.\n" +
                    "\n" +
                    "10.\tTaruh nastar yang sudah dibentuk pada loyang.\n" +
                    "\n" +
                    "11.\tMasukkan dalam oven dengan suhu 150 derajat celcius selama 15 menit saja. Keluarkan.\n" +
                    "\n" +
                    "12.\tSembari menunggu nastar yang sedang dipanggang, campurkan susu cair, madu dan 2 butir kuning telur dalam wadah hingga rata sebagai bahan olesan nanti. Parut juga keju (25 g).\n" +
                    "\n" +
                    "13.\tSetelah 15 menit, keluarkan nastar dari dalam oven.\n" +
                    "\n" +
                    "14.\tOlesi bagian atas nastar dengan bahan olesan yang sudah Anda buat.\n" +
                    "\n" +
                    "15.\tTaburkan pula keju parut.\n" +
                    "\n" +
                    "16.\tMasukkan kembali nastar ke dalam oven lalu panggang hingga matang.\n" +
                    "\n" +
                    "17.\tSetelah matang, keluarkan dari dalam oven, dinginkan.\n" +
                    "\n" +
                    "18.\tKue kering nastar keju siap dihidangkan.\n",
            "1.\tSiapkan wadah, lalu masukkan gula dan telur. Kocok hingga rata dan mengembang. Bisa dikocok dengan menggunakan mixer dengan kecepatan rendah.\n" +
                    "\n" +
                    "2.\tMasukkan tepung terigu yang sudah di ayak sedikit demi sedikit sembari terus diaduk.\n" +
                    "\n" +
                    "3.\tTuang margarin yang sudah dicairkan. Aduk hingga rata.\n" +
                    "\n" +
                    "4.\tMasukkan baking powder, ragi, dan vanili. Aduk hingga rata dan mengembang.\n" +
                    "\n" +
                    "5.\tDiamkan adonan selama 15 menit agar lebih mengembang.\n" +
                    "\n" +
                    "6.\tTuang adonan ke wadah yang mudah untuk menuangkan ke cetakan seperti gelas.\n" +
                    "\n" +
                    "7.\tPanaskan cetakan kue cubit dengan api kecil. Olesi cetakan dengan minyak goreng.\n" +
                    "\n" +
                    "8.\tTuang adonan kue cubit ke cetakan. Tutup dan tunggu hingga adonan matang.\n" +
                    "\n" +
                    "9.\tKue cubit yang hampir matang kemudian tambahkan topping sesuai dengan keinginan Anda.\n" +
                    "\n" +
                    "10.\tTutup lagi kemudian biarkan hingga benar-benar matang.\n" +
                    "\n" +
                    "11.\tKue cubit siap disajikan.",
            "1. Rebus hingga mendidih santan, daun jeruk, daun pandan, serai dan garam. Jangan lupa diaduk supaya santan tidak pecah. Angkat, saring dan dinginkan.\n" +
                    "\n" +
                    "2. Di dalam mangkuk, campur tepung terigu, tepung sagu, ragi instan hingga rata. Sisihkan\n" +
                    "\n" +
                    "3. Masukkan santan yang sudah hangat ke dalam mangkuk berisi tepung lalu aduk rata hingga adonan rata. Pastikan adonan halus tanpa ada gumpalan tepung. Diamkan 10 menit.\n" +
                    "\n" +
                    "4. Kocok telur dan gula hingga mengembang dan putih.\n" +
                    "\n" +
                    "5. Masukkan kocokan telur ke dalam adonan tepung lalu aduk rata menggunakan spatula.\n" +
                    "\n" +
                    "6. Tambahkan Blue Band Serbaguna cair lalu aduk rata. Diamkan adonan sekitar 30 menit.\n" +
                    "\n" +
                    "7. Panaskan wajan anti lengket/teflon dengan diameter 20 cm atau cetakan kue lumpur berdiameter 6 cm yang telah diolesi dengan Blue Band Serba Guna. Masukkan adonan dan panggang di atas api kecil biarkan hingga permukaan bergelembung lalu tutup wajan/teflon.\n" +
                    "\n" +
                    "8. Jika sudah matang, balik sebentar untuk mendapatkan warna kecoklatan di bagian atas. Angkat dan sajikan.",
            "1.\tRendam kacang hijau yang telah dikupas selama 4 sampai 5 jam setelah itu cuci bersih dan bilas.\n" +
                    "\n" +
                    "2.\tKukus kacang hijau sampai empuk lalu tumbuk atau haluskan hingga halus. \n" +
                    "\n" +
                    "3.\tCampur kacang hijau halus bersama gula, garam dan vanili sampai semua bahan menyatu. Uleni dan bulatkan kecil-kecil untuk dijadikan isi onde-onde.\n" +
                    "\n" +
                    "4.\tCampur tepung beras ketan, tepung beras, garam, gula dan vanili jadi satu lalu uleni hingga adonan kalis.\n" +
                    "\n" +
                    "5.\tAmbil adonan secukupnya lalu pipihkan dan buat cekungan untuk tempat isian. \n" +
                    "\n" +
                    "6.\tBulatkan adonan dan pastikan onde-onde terbentuk sempurna. \n" +
                    "\n" +
                    "7.\tSetelah onde-onde jadi, celupkan onde-onde ke dalam air dingin lalu gulingkan onde-onde ke atas wijen yang telah diletakkan di piring sampai rata. \n" +
                    "\n" +
                    "8.\tPanaskan minyak dan segera goreng onde-onde hingga warnanya menjadi kuning kecokelatan dan kulit bagian luar kering. \n" +
                    "\n" +
                    "9.\tAngkat onde-onde setelah matang lalu sajikan pada keluarga tercinta selagi masih hangat."
    };
    public static ArrayList<Resep> getListData() {
        ArrayList<Resep> list = new ArrayList<>();
        for (int position = 0; position < resepNames.length; position++){
            Resep resep = new Resep();
            resep.setName(resepNames[position]);
            resep.setDetail(resepDetails[position]);
            resep.setPhoto(resepImages[position]);
            resep.setBahan(resepBahan[position]);
            resep.setLangkah(resepLangkah[position]);
            list.add(resep);
        }
        return list;
}

}
