package com.nonamedev.siapcpns;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("no")
    @Expose
    private String no;
    @SerializedName("soal")
    @Expose
    private String soal;
    @SerializedName("pilihan1")
    @Expose
    private String pilihan1;
    @SerializedName("pilihan2")
    @Expose
    private String pilihan2;
    @SerializedName("pilihan3")
    @Expose
    private String pilihan3;
    @SerializedName("pilihan4")
    @Expose
    private String pilihan4;
    @SerializedName("pilihan5")
    @Expose
    private String pilihan5;
    @SerializedName("jawabanbenar")
    @Expose
    private String jawabanbenar;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    public String getPilihan1() {
        return pilihan1;
    }

    public void setPilihan1(String pilihan1) {
        this.pilihan1 = pilihan1;
    }

    public String getPilihan2() {
        return pilihan2;
    }

    public void setPilihan2(String pilihan2) {
        this.pilihan2 = pilihan2;
    }

    public String getPilihan3() {
        return pilihan3;
    }

    public void setPilihan3(String pilihan3) {
        this.pilihan3 = pilihan3;
    }

    public String getPilihan4() {
        return pilihan4;
    }

    public void setPilihan4(String pilihan4) {
        this.pilihan4 = pilihan4;
    }

    public String getPilihan5() {
        return pilihan5;
    }

    public void setPilihan5(String pilihan5) {
        this.pilihan5 = pilihan5;
    }

    public String getJawabanbenar() {
        return jawabanbenar;
    }

    public void setJawabanbenar(String jawabanbenar) {
        this.jawabanbenar = jawabanbenar;
    }

}