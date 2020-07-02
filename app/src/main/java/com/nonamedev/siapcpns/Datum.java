package com.nonamedev.siapcpns;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id_soal")
    @Expose
    private String idSoal;
    @SerializedName("pertanyaan")
    @Expose
    private String pertanyaan;
    @SerializedName("pilihanA")
    @Expose
    private String pilihanA;
    @SerializedName("pilihanB")
    @Expose
    private String pilihanB;
    @SerializedName("pilihanC")
    @Expose
    private String pilihanC;
    @SerializedName("pilihanD")
    @Expose
    private String pilihanD;
    @SerializedName("pilihanE")
    @Expose
    private String pilihanE;
    @SerializedName("jawabanbenar")
    @Expose
    private String jawabanbenar;
    @SerializedName("tipe_soal")
    @Expose
    private String tipeSoal;

    public String getIdSoal() {
        return idSoal;
    }

    public void setIdSoal(String idSoal) {
        this.idSoal = idSoal;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getPilihanA() {
        return pilihanA;
    }

    public void setPilihanA(String pilihanA) {
        this.pilihanA = pilihanA;
    }

    public String getPilihanB() {
        return pilihanB;
    }

    public void setPilihanB(String pilihanB) {
        this.pilihanB = pilihanB;
    }

    public String getPilihanC() {
        return pilihanC;
    }

    public void setPilihanC(String pilihanC) {
        this.pilihanC = pilihanC;
    }

    public String getPilihanD() {
        return pilihanD;
    }

    public void setPilihanD(String pilihanD) {
        this.pilihanD = pilihanD;
    }

    public String getPilihanE() {
        return pilihanE;
    }

    public void setPilihanE(String pilihanE) {
        this.pilihanE = pilihanE;
    }

    public String getJawabanbenar() {
        return jawabanbenar;
    }

    public void setJawabanbenar(String jawabanbenar) {
        this.jawabanbenar = jawabanbenar;
    }

    public String getTipeSoal() {
        return tipeSoal;
    }

    public void setTipeSoal(String tipeSoal) {
        this.tipeSoal = tipeSoal;
    }

}