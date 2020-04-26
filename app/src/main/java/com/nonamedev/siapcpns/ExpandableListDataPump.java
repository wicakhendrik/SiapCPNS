package com.nonamedev.siapcpns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> q1 = new ArrayList<String>();
        q1.add("A: SSCASN atau Sistem Seleksi Calon Aparatur Sipil Negara adalah situs resmi pendaftaran ASN secara nasional sebagai pintu pendaftaran pertama seleksi ASN ke seluruh instansi baik Pusat maupun Daerah dan dikelola oleh Badan Kepegawaian Negara RI sebagai Panitia Seleksi Penerimaan Nasional.\n" +
                "SSCASN dapat diakses dengan alamat https://sscasn.bkn.go.id");

        List<String> q2 = new ArrayList<String>();
        q2.add("A: Untuk mendaftar Seleksi CPNS, silahkan masuk ke halaman https://sscn.bkn.go.id");

        List<String> q3 = new ArrayList<String>();
        q3.add("A: Warga Negara Indonesia yang berkeinginan dan memenuhi syarat sesuai peraturan masing-masing instansi (Formasi, Jabatan, dll) selama batas usia yang dipersyaratkan terpenuhi.");

        List<String> q4 = new ArrayList<String>();
        q4.add("\n" +
                "A: 1. Pendaftar menghubungi Dinas Dukcapil Kab/Kota masing-masing untuk konsolidasi data dan\n" +
                "2. Menghubungi call center Halo Dukcapil, dengan mengirimkan data sesuai format berikut:\n" +
                "# NIK\n" +
                "# Nama_Lengkap\n" +
                "# Nomor_Kartu_Keluarga\n" +
                "# Nomor_Telp\n" +
                "# Permasalahan\n" +
                "\n" +
                "Layanan Helpdesk Ditjen Dukcapil:\n" +
                "Hotline : 1500537\n" +
                "WA : 08118005373\n" +
                "SMS : 08118005373\n" +
                "Email : callcenter.dukcapil@gmail.com");

        List<String> q5 = new ArrayList<String>();
        q5.add("A: “Nama” yang diisikan adalah sesuai nama yang tertera pada ijazah tanpa gelar.");

        expandableListDetail.put("Q: Apakah SSCASN itu?", q1);
        expandableListDetail.put("Q: Bagaimana cara mendaftar Seleksi CPNS?", q2);
        expandableListDetail.put("Q: Siapa saja yang dapat mendaftar pada Seleksi CPNS?", q3);
        expandableListDetail.put("Q: Bagaimana jika data Nomor Induk Kependudukan (NIK), Nomor Kartu Keluarga (KK), Nama Lengkap sesuai KTP, Tempat Lahir sesuai KTP, Tanggal Lahir sesuai KTP saya tidak ditemukan/tidak sesuai di halaman Akun?", q4);
        expandableListDetail.put("Q: Bagaimana pengisian data “Nama” yang benar?", q5);
        return expandableListDetail;
    }
}